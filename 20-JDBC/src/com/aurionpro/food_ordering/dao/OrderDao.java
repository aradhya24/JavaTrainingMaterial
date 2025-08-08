package com.aurionpro.food_ordering.dao;

import com.aurionpro.food_ordering.model.*;

import java.sql.*;
import java.util.List;

public class OrderDao {
    private Connection conn;

    public OrderDao(Connection conn) {
        this.conn = conn;
    }

    public Order placeOrder(Customer customer, List<OrderItem> items, String paymentMode, DeliveryPartner partner) throws SQLException {
        double total = 0;
        for (OrderItem item : items) total += item.getSubtotal();
        double discount = total > 500 ? 50 : 0;
        double finalAmount = total - discount;

        String orderSql = "INSERT INTO food_ordering_orders (customer_id, total_amount, discount_applied, final_amount, payment_mode, delivery_partner_id) VALUES (?, ?, ?, ?, ?, ?)";
        String itemSql = "INSERT INTO food_ordering_order_items (order_id, item_id, quantity, subtotal) VALUES (?, ?, ?, ?)";

        try (PreparedStatement orderStmt = conn.prepareStatement(orderSql, Statement.RETURN_GENERATED_KEYS);
             PreparedStatement itemStmt = conn.prepareStatement(itemSql)) {

            conn.setAutoCommit(false);
            orderStmt.setInt(1, customer.getCustomerId());
            orderStmt.setDouble(2, total);
            orderStmt.setDouble(3, discount);
            orderStmt.setDouble(4, finalAmount);
            orderStmt.setString(5, paymentMode);
            orderStmt.setInt(6, partner.getPartnerId());
            orderStmt.executeUpdate();

            ResultSet rs = orderStmt.getGeneratedKeys();
            int orderId = rs.next() ? rs.getInt(1) : -1;

            for (OrderItem item : items) {
                itemStmt.setInt(1, orderId);
                itemStmt.setInt(2, item.getItem().getItemId());
                itemStmt.setInt(3, item.getQuantity());
                itemStmt.setDouble(4, item.getSubtotal());
                itemStmt.addBatch();
            }
            itemStmt.executeBatch();
            conn.commit();

            return new Order(orderId, customer, items, total, discount, finalAmount, paymentMode, partner);
        } catch (SQLException e) {
            conn.rollback();
            throw e;
        }
    }
}