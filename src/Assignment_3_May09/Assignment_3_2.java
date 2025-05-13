package Assignment_3_May09;

//Write a method getStocksLookup that takes a connection and ticker symbol as input
// and prints the Ticker Symbol and Ticker Name

import java.sql.*;
import java.util.Scanner;

public class Assignment_3_2 {
    private static final String DB_HOST = "jdbc:postgresql://endeavourtech.ddns.net:27443/StocksDB";
    private static final String USERNAME = "evr_sql_app";
    private static final String PASSWORD = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void getStocksLookup(Connection connection , String tickerSymbol) throws SQLException , ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String query = "select * from endeavour.stocks_lookup where ticker_symbol=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query))
        {
            preparedStatement.setString(1, tickerSymbol);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println(resultSet.getString("ticker_symbol"));
                System.out.println(resultSet.getString("ticker_name"));
            }
            else{
                System.out.println("No data found with given ticker symbol : " + tickerSymbol);
            }
        }
    }


    public static void main(String[] args){
        try(Connection connection = DriverManager.getConnection(DB_HOST, USERNAME, PASSWORD);
        Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter ticker symbol :");
            String tickerSymbol = sc.nextLine();
            getStocksLookup(connection , tickerSymbol);

        }
        catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


