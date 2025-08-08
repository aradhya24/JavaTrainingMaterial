	package com.aurionpro.ecommerce_miniproject.servlet;
	
	import java.io.IOException;
	import java.net.URLEncoder;
	import java.sql.Connection;
	
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.*;
	
	import com.aurionpro.ecommerce_miniproject.dao.UserDao;
	import com.aurionpro.ecommerce_miniproject.utils.DBUtil;
	
	@WebServlet("/register")
	public class RegisterServlet extends HttpServlet {
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
	
			String username = request.getParameter("username");
			String phone = request.getParameter("phone");
			String password = request.getParameter("password");
	
			if (!phone.matches("\\d{10}")) {
				String msg = encode("📱 Phone must be 10 digits.");
				response.sendRedirect("login.html?toast=" + msg + "&status=error");
				return;
			}
	
			if (password.length() < 4) {
				String msg = encode("🔐 Password must be at least 4 characters.");
				response.sendRedirect("login.html?toast=" + msg + "&status=error");
				return;
			}
	
			try (Connection conn = DBUtil.getConnection()) {
				if (UserDao.isUsernameOrPhoneExists(conn, username, phone)) {
					String msg = encode("❌ Username or phone already exists.");
					response.sendRedirect("login.html?toast=" + msg + "&status=error");
					return;
				}
	
				boolean success = UserDao.registerUser(conn, username, phone, password);
				String msg = success
					? encode("✅ Registration successful!")
					: encode("❌ Registration failed. Try again.");
				String status = success ? "success" : "error";
				response.sendRedirect("login.html?toast=" + msg + "&status=" + status);
	
			} catch (Exception e) {
				e.printStackTrace();
				String msg = encode("⚠️ Something went wrong.");
				response.sendRedirect("login.html?toast=" + msg + "&status=error");
			}
		}
	
		private String encode(String msg) {
			try {
				return URLEncoder.encode(msg, "UTF-8");
			} catch (Exception e) {
				return ""; // fallback
			}
		}
	}
