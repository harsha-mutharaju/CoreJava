package io.endeavour.stocks.dao;

import io.endeavour.stocks.Exception.StockException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
    protected static final String DB_HOST = "jdbc:postgresql://endeavourtech.ddns.net:27443/StocksDB";
    protected static final String USERNAME = "evr_sql_app";
    protected static final String PASSWORD = "5LViU5pLkSjRHECec9NF4wRxxV";

    protected Connection connection;

    public BaseDAO() {

        try
        {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(DB_HOST, USERNAME, PASSWORD);
        }
        catch (Exception e) {
            throw new StockException(e);
        }
    }
}
