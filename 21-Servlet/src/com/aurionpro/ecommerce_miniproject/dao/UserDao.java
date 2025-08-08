package com.aurionpro.ecommerce_miniproject.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aurionpro.ecommerce_miniproject.model.User;
import com.aurionpro.ecommerce_miniproject.utils.DBUtil;

public class UserDao {

    public static boolean isValidUser(Connection conn, String username, String password) {
        String query = "SELECT * FROM servlet_ecom_user WHERE username = ? AND password = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);

            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next(); // returns true if a matching row is found
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    public static int getUserIdByUsernameAndPassword(Connection conn, String username, String password) throws SQLException {
        String query = "SELECT user_id FROM servlet_ecom_user WHERE username = ? AND password = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("user_id");
                }
            }
        }
        return -1; // invalid user
    }
    
    
//    public static boolean registerUser(User user) {
//        String sql = "INSERT INTO servlet_ecom_users (username, password, phone) VALUES (?, ?, ?)";
//
//        try (Connection conn = DBUtil.getConnection();
//             PreparedStatement stmt = conn.prepareStatement(sql)) {
//
//            stmt.setString(1, user.getUsername());
//            stmt.setString(2, user.getPassword());
//            stmt.setString(3, user.getPhone());
//
//            int rowsInserted = stmt.executeUpdate();
//            return rowsInserted > 0;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
    
    
    
    public static boolean isUsernameOrPhoneExists(Connection conn, String username, String phone) throws SQLException {
    	String query = "SELECT * FROM servlet_ecom_user WHERE username = ? OR phone = ?";
    	try (PreparedStatement stmt = conn.prepareStatement(query)) {
    		stmt.setString(1, username);
    		stmt.setString(2, phone);
    		try (ResultSet rs = stmt.executeQuery()) {
    			return rs.next(); // true if user exists
    		}
    	}
    }


    public static boolean registerUser(Connection conn,  String username, String phone, String password) throws SQLException {
        String query = "INSERT INTO servlet_ecom_user ( username, phone, password) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, phone);
            stmt.setString(3, password);
            return stmt.executeUpdate() > 0;
        }
    }
    
    

    public static boolean resetPassword(String username, String phone, String newPassword) {
        String sql = "UPDATE servlet_ecom_users SET password = ? WHERE username = ? AND phone = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newPassword);
            stmt.setString(2, username);
            stmt.setString(3, phone);

            int updated = stmt.executeUpdate();
            return updated > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
