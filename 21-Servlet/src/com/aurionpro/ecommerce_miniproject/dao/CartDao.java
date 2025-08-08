package com.aurionpro.ecommerce_miniproject.dao;

import java.sql.*;
import java.util.*;
import com.aurionpro.ecommerce_miniproject.model.CartItem;

public class CartDao {

    public static int getUserIdByUsername(Connection conn, String username) throws SQLException {
        String query = "SELECT user_id FROM servlet_ecom_user WHERE username = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) return rs.getInt("user_id");
            }
        }
        return -1;
    }

    public static List<CartItem> getCartItemsByUserId(Connection conn, int userId) throws SQLException {
        List<CartItem> cartItems = new ArrayList<>();
        String query = "SELECT c.cart_id, p.product_id, p.product_name, c.quantity, p.price " +
                       "FROM servlet_ecom_cart c " +
                       "JOIN servlet_ecom_product p ON c.product_id = p.product_id " +
                       "WHERE c.user_id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                	int cartId = rs.getInt("cart_id");
                	int productId = rs.getInt("product_id");
                    String name = rs.getString("product_name");
                    int quantity = rs.getInt("quantity");
                    double price = rs.getDouble("price");
                    cartItems.add(new CartItem(cartId, productId, name, quantity, price));
                }
            }
        }
        return cartItems;
    }

    public static int getCartItemCount(Connection conn, int userId) throws SQLException {
        String query = "SELECT COUNT(*) AS total FROM servlet_ecom_cart WHERE user_id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) return rs.getInt("total");
            }
        }
        return 0;
    }

    public static boolean addToCart(Connection conn, int userId, int productId, int quantity, double price) throws SQLException {
        if (getCartItemCount(conn, userId) >= 6) return false;

        String insertQuery = "INSERT INTO servlet_ecom_cart (user_id, product_id, quantity, price, total_price) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
            stmt.setInt(1, userId);
            stmt.setInt(2, productId);
            stmt.setInt(3, quantity);
            stmt.setDouble(4, price);
            stmt.setDouble(5, price * quantity);
            return stmt.executeUpdate() > 0;
        }
    }

    public static boolean removeFromCartByCartId(Connection conn, int cartId, int userId) throws SQLException {
        String query = "DELETE FROM servlet_ecom_cart WHERE cart_id = ? AND user_id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, cartId);
            stmt.setInt(2, userId);
            return stmt.executeUpdate() > 0;
        }
    }

}
