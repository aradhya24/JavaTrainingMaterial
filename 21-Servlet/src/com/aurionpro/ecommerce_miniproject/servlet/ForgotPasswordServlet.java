package com.aurionpro.ecommerce_miniproject.servlet;

import com.aurionpro.ecommerce_miniproject.utils.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

@WebServlet("/forgot-password")
public class ForgotPasswordServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String phone = request.getParameter("phone");
		String newPassword = request.getParameter("newPassword");

		if (!phone.matches("\\d{10}")) {
			redirectWithToast(response, "📱 Phone must be 10 digits.", false);
			return;
		}

		if (newPassword.length() < 4) {
			redirectWithToast(response, "🔐 Password must be at least 4 characters.", false);
			return;
		}

		try (Connection conn = DBUtil.getConnection()) {
			String selectQuery = "SELECT * FROM servlet_ecom_user WHERE username = ? AND phone = ?";
			try (PreparedStatement selectStmt = conn.prepareStatement(selectQuery)) {
				selectStmt.setString(1, username);
				selectStmt.setString(2, phone);

				try (ResultSet rs = selectStmt.executeQuery()) {
					if (rs.next()) {
						String updateQuery = "UPDATE servlet_ecom_user SET password = ? WHERE username = ? AND phone = ?";
						try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
							updateStmt.setString(1, newPassword);
							updateStmt.setString(2, username);
							updateStmt.setString(3, phone);

							int rows = updateStmt.executeUpdate();
							if (rows > 0) {
								redirectWithToast(response, "✅ Password updated successfully!", true);
							} else {
								redirectWithToast(response, "❌ Failed to update password.", false);
							}
						}
					} else {
						redirectWithToast(response, "⚠️ Invalid username or phone number.", false);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			redirectWithToast(response, "⚠️ Something went wrong.", false);
		}
	}

	private void redirectWithToast(HttpServletResponse response, String message, boolean success) throws IOException {
		String status = success ? "success" : "error";
		response.sendRedirect("login.html?toast=" + java.net.URLEncoder.encode(message, "UTF-8") + "&status=" + status);
	}
}
