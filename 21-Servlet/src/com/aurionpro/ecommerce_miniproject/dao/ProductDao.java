package com.aurionpro.ecommerce_miniproject.dao;

import com.aurionpro.ecommerce_miniproject.model.Product;
import com.aurionpro.ecommerce_miniproject.utils.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {


    public static List<Product> getAllProducts() throws Exception {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * FROM servlet_ecom_product";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("product_id");
                String name = rs.getString("product_name");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");

                products.add(new Product(id, name, quantity, price));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }
}
