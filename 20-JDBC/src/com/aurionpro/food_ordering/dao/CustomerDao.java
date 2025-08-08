package com.aurionpro.food_ordering.dao;

import com.aurionpro.food_ordering.model.Customer;

import java.sql.*;

public class CustomerDao {

    public Customer insertCustomer(String name, String contact) {
        String sql = "INSERT INTO food_ordering_customer (name, contact) VALUES (?, ?)";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, name);
            stmt.setString(2, contact);
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return new Customer(rs.getInt(1), name, contact);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
