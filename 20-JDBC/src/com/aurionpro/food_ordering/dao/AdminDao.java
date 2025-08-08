package com.aurionpro.food_ordering.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDao {

    private Connection conn;

    public AdminDao(Connection conn) {
        this.conn = conn;
    }

    public boolean validateAdmin(String username, String password) throws SQLException {
        String query = "SELECT * FROM food_ordering_admin WHERE username = ? AND password = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);

            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        }
    }

    public void viewMenuItems() throws SQLException {
        String query = "SELECT * FROM food_ordering_admin_menu";
        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("\n--- Menu Items ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("item_id") +
                        ", Name: " + rs.getString("item_name") +
                        ", Price: ₹" + rs.getDouble("price") +
                        ", Available: " + (rs.getInt("availability") == 1 ? "Yes" : "No"));
            }
        }
    }

    public void addMenuItem(String itemName, double price) throws SQLException {
        String query = "INSERT INTO food_ordering_admin_menu (item_name, price) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, itemName);
            stmt.setDouble(2, price);
            stmt.executeUpdate();
            System.out.println("✅ Item added successfully!");
        }
    }

    public void updateAvailability(int itemId, int availability) throws SQLException {
        String query = "UPDATE food_ordering_admin_menu SET availability = ? WHERE item_id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, availability);
            stmt.setInt(2, itemId);
            int updated = stmt.executeUpdate();
            if (updated > 0) {
                System.out.println("✅ Availability updated successfully!");
            } else {
                System.out.println("❌ Item not found.");
            }
        }
    }
}
