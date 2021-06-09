package com.codegym.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class SQLConnection {
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/mannagerproduct?useSSL=false";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "5436593";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
