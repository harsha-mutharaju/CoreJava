package JDBC;

import org.postgresql.Driver;

public class TestConnection {
    public static void main(String[] args) {
        Driver driver = new Driver();
        System.out.println("PostgreSQL Driver Loaded: " + driver.getMajorVersion());
    }
}

