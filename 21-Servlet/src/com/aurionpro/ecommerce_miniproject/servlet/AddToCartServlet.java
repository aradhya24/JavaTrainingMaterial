package com.aurionpro.ecommerce_miniproject.servlet;

import com.aurionpro.ecommerce_miniproject.dao.CartDao;
import com.aurionpro.ecommerce_miniproject.utils.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.*;

@WebServlet("/add-to-cart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("user_id") == null) {
			response.sendRedirect("login.html");
			return;
		}

		int userId = (int) session.getAttribute("user_id");
		String[] selectedProductIds = request.getParameterValues("products");

		if (selectedProductIds == null || selectedProductIds.length == 0) {
			session.setAttribute("message", "⚠️ No products selected.");
			response.sendRedirect("dashboard");
			return;
		}

		try (Connection conn = DBUtil.getConnection()) {
			// Check cart limit
			int currentItems = CartDao.getCartItemCount(conn, userId);
			if (currentItems + selectedProductIds.length > 6) {
				session.setAttribute("message", "❌ You can only have 6 items in cart.");
				response.sendRedirect("dashboard");
				return;
			}

			String priceQuery = "SELECT price FROM servlet_ecom_product WHERE product_id = ?";
			String insertQuery = "INSERT INTO servlet_ecom_cart "
					+ "(user_id, product_id, quantity, price, total_price, status) "
					+ "VALUES (?, ?, ?, ?, ?, ?)";

			PreparedStatement priceStmt = conn.prepareStatement(priceQuery);
			PreparedStatement insertStmt = conn.prepareStatement(insertQuery);

			for (String pidStr : selectedProductIds) {
				int productId = Integer.parseInt(pidStr);
				String qtyStr = request.getParameter("qty_" + productId);
				int quantity = Integer.parseInt(qtyStr);

				// Get price
				priceStmt.setInt(1, productId);
				try (ResultSet rs = priceStmt.executeQuery()) {
					if (rs.next()) {
						BigDecimal price = rs.getBigDecimal("price");
						BigDecimal total = price.multiply(new BigDecimal(quantity));

						// Insert into cart
						insertStmt.setInt(1, userId);
						insertStmt.setInt(2, productId);
						insertStmt.setInt(3, quantity);
						insertStmt.setBigDecimal(4, price);
						insertStmt.setBigDecimal(5, total);
						insertStmt.setString(6, "PENDING");
						insertStmt.executeUpdate();
					}
				}
			}

			session.setAttribute("message", "✅ Selected products added to cart.");
			response.sendRedirect("dashboard");

		} catch (Exception e) {
			throw new ServletException("Error while adding to cart", e);
		}
	}
}
