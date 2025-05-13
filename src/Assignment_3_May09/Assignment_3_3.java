package Assignment_3_May09;

//Write a method getMultipleStockFundamentals that takes a connection and List of Ticker Symbols as inputs, and prints the Ticker Name, Market Cap for each of the Ticker Name in the values.
//The query used within the method should use the IN clause

import java.sql.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment_3_3 {
    private static final String DB_HOST = "jdbc:postgresql://endeavourtech.ddns.net:27443/StocksDB";
    private static final String USERNAME = "evr_sql_app";
    private static final String PASSWORD = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void getMultipleStockFundamentals(Connection connection , List<String> tickerSymbols) throws SQLException, ClassNotFoundException {

        if(tickerSymbols == null || tickerSymbols.isEmpty()){
            System.out.println("No ticker symbols provided");
            return;
        }

        Class.forName("org.postgresql.Driver");

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< tickerSymbols.size() ; i++){
            sb.append("?");
            if(i < tickerSymbols.size() - 1){
                sb.append(",");
            }
        }

        String query =    "select sf.ticker_symbol , sl.ticker_name , sf.market_cap "+
                          "from endeavour.stock_fundamentals sf " +
                          "join endeavour.stocks_lookup sl "+
                          "on sf.ticker_symbol = sl.ticker_symbol "+
                          "where sf.ticker_symbol in ("+sb+")";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query))
        {
            for(int i = 0 ; i < tickerSymbols.size() ; i++){
                preparedStatement.setString(i+1 , tickerSymbols.get(i));
            }

            ResultSet resultSet = preparedStatement.executeQuery();
            boolean found = false;
            while(resultSet.next()) {
                found = true;
                System.out.println("Ticker Symbol :"+resultSet.getString("ticker_symbol"));
                System.out.println("Ticker Name :"+resultSet.getString("ticker_name"));
                System.out.println("Market Cap :"+resultSet.getString("market_cap"));
                System.out.println("----------------------\n");

            }
            if(!found){
                System.out.println("No data found with given ticker symbols : ");
            }
        }
    }


    public static void main(String[] args){
        try(Connection connection = DriverManager.getConnection(DB_HOST, USERNAME, PASSWORD);
            Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter ticker symbols :");
            String input = sc.nextLine();
            List<String> tickerSymbols = Arrays.stream(input.split(","))
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .toList();
            getMultipleStockFundamentals(connection , tickerSymbols);

        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}



