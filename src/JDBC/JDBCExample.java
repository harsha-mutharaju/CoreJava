package JDBC;

import org.postgresql.Driver;
import java.sql.*;

public class JDBCExample {
    private static final String DB_HOST = "jdbc:postgresql://endeavourtech.ddns.net:27443/StocksDB";
    private static final String USERNAME = "evr_sql_app";
    private static final String PASSWORD = "5LViU5pLkSjRHECec9NF4wRxxV";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1. Load the Postgres Driver
        Class.forName("org.postgresql.Driver");

        //2. Get the DB Connection
        Connection connection = DriverManager.getConnection(DB_HOST, USERNAME, PASSWORD);
        String query = """
                SELECT 
                    SECTOR_ID, 
                    SECTOR_NAME
                 FROM ENDEAVOUR.SECTOR_LOOKUP
                """;
        //3. Create a statement
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        //4. Execute the query
        ResultSet resultSet = preparedStatement.executeQuery();

        //Iterating through the ResultSet
        while(resultSet.next()){
            System.out.println("SECTOR ID " + resultSet.getInt("SECTOR_ID"));
            System.out.println("SECTOR NAME " + resultSet.getString("SECTOR_NAME"));
        }
//
    }
}