package com.aurionpro.food_ordering.dao;

import com.aurionpro.food_ordering.model.MenuItem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MenuDao {
    private Connection conn;

    public MenuDao(Connection conn) {
        this.conn = conn;
    }

    public List<MenuItem> getAllAvailableItems() throws SQLException {
        List<MenuItem> items = new ArrayList<>();
        String query = "SELECT * FROM food_ordering_admin_menu WHERE availability = 1";

        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                MenuItem item = new MenuItem(
                        rs.getInt("item_id"),
                        rs.getString("item_name"),
                        rs.getDouble("price"),
                        rs.getInt("availability") == 1
                );
                items.add(item);
            }
        }

        return items;
    }

    public MenuItem getItemById(int id) throws SQLException {
        String query = "SELECT * FROM food_ordering_admin_menu WHERE item_id = ? AND availability = 1";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new MenuItem(
                            rs.getInt("item_id"),
                            rs.getString("item_name"),
                            rs.getDouble("price"),
                            rs.getInt("availability") == 1
                    );
                }
            }
        }
        return null;
    }
}
