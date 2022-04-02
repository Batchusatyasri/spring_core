package com.springboot.workers.jdbcexample.util;
import java.sql.*;

public class DataBaseConnection {
	
    static final String url = "jdbc:mysql://localhost:3307/org";
    static final String username = "root";
    static final String password = "satyasri";
    private static Connection con = null;

    private DataBaseConnection() {
    }

    public static Connection getConnection() throws SQLException {
        if (con == null) {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully connected to database server "
                    + con.getMetaData().getDatabaseProductName()
                    + " version: "
                    + con.getMetaData().getDatabaseProductVersion());
        }
        return con;
    }

    public static void closeConnection() throws SQLException {
        con.close();
    }
}