package JDBC;

import java.sql.*;

public class JDBCExample {
    private static final String DB_HOST = "jdbc:postgresql://endeavourtech.ddns.net:27443/StocksDB";
    private static final String USERNAME = "evr_sql_app";
    private static final String PASSWORD = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException , ClassNotFoundException {
        // loading the postgres driver
        Class.forName("org.postgresql.Driver");


        // create connection string
        Connection connection = DriverManager.getConnection(DB_HOST, USERNAME, PASSWORD);
        String query = "select * from endeavour.stock_fundamentals limit 10";

        // create a statement
        PreparedStatement preparedStatement = connection.prepareStatement(query);


        //execute query
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));

        }


    }
}