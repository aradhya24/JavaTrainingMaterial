package com.aurionpro.ecommerce_miniproject.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/practice";
        String user = "root";
        String password = "root";

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            //System.out.println("✅ Database connection successful");
        } catch (Exception e) {
            System.out.println("❌ Connection to database failed...");
            e.printStackTrace(); // Add this to see actual error
        }

        return connection;
    }
}
