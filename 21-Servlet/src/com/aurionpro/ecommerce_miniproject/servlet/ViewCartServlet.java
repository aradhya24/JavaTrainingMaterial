package com.aurionpro.ecommerce_miniproject.servlet;

import com.aurionpro.ecommerce_miniproject.dao.CartDao;
import com.aurionpro.ecommerce_miniproject.model.CartItem;
import com.aurionpro.ecommerce_miniproject.utils.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

@WebServlet("/view-cart")
public class ViewCartServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("username") == null) {
            response.sendRedirect("login.html?toast=Session%20expired.%20Please%20login%20again.&status=error");
            return;
        }

		int userId = (int) session.getAttribute("user_id");
		String username = (String) session.getAttribute("username");

		boolean itemRemoved = request.getParameter("removed") != null;
		boolean limitExceeded = request.getParameter("limit") != null;
		response.setContentType("text/html; charset=UTF-8");
		try (Connection conn = DBUtil.getConnection();

		  PrintWriter out = response.getWriter()) {

			List<CartItem> cartItems = CartDao.getCartItemsByUserId(conn, userId);

			out.println("<html><head><title>Your Cart</title>");
			out.println("<style>");
			out.println("body { font-family: Arial; background-color: #f4f4f4; margin: 0; }");
			out.println(
					".navbar { background-color: #343a40; color: white; padding: 10px 20px; display: flex; justify-content: space-between; align-items: center; }");
			out.println(".navbar .user { font-weight: bold; }");
			out.println(
					".navbar .logout { background-color: #dc3545; color: white; padding: 5px 10px; border: none; border-radius: 4px; text-decoration: none; }");
			out.println(
					".container { max-width: 800px; margin: 30px auto; background: #fff; padding: 20px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
			out.println("table { width: 100%; border-collapse: collapse; margin-top: 20px; }");
			out.println("th, td { padding: 10px; text-align: center; border-bottom: 1px solid #ddd; }");
			out.println("th { background-color: #007bff; color: white; }");
			out.println(
					".btn { padding: 5px 10px; background-color: #dc3545; color: white; border: none; border-radius: 4px; cursor: pointer; }");
			out.println(".btn:hover { background-color: #c82333; }");
			out.println(
					".button { margin-top: 20px; background-color: #007bff; color: white; padding: 10px 20px; border: none; cursor: pointer; border-radius: 5px; text-decoration: none; display: inline-block; }");
			out.println(
					".toast { visibility: hidden; min-width: 250px; margin-left: -125px; background-color: #333; color: #fff; text-align: center; border-radius: 8px; padding: 12px; position: fixed; z-index: 1; left: 50%; bottom: 30px; font-size: 15px; opacity: 0; transition: opacity 0.5s, bottom 0.5s; }");
			out.println(".toast.show { visibility: visible; opacity: 1; bottom: 50px; }");
			out.println("</style>");

			// Toast script
			out.println("<script>");
			out.println("function showToast(message) {");
			out.println("  var toast = document.getElementById('toast');");
			out.println("  toast.textContent = message;");
			out.println("  toast.className = 'toast show';");
			out.println("  setTimeout(function(){ toast.className = toast.className.replace('show', ''); }, 2000);");
			out.println("}");
			if (itemRemoved) {
				out.println("window.onload = function() { showToast('Item removed from cart'); };");
			}
			if (limitExceeded) {
				out.println("window.onload = function() { showToast('Cannot add more than 6 items'); };");
			}
			out.println("</script>");

			out.println("</head><body>");

			// Navbar
			out.println("<div class='navbar'>");
			out.println("<div class='user'>Welcome, " + username + "</div>");
			out.println("<a href='logout' class='logout'>Logout</a>");
			out.println("</div>");

			out.println("<div class='container'>");
			out.println("<h2>Your Shopping Cart</h2>");

			if (cartItems.isEmpty()) {
				out.println("<p>Your cart is empty.</p>");
			} else {
				double grandTotal = 0.0;

				out.println("<table>");
				out.println("<tr><th>Product</th><th>Quantity</th><th>Price</th><th>Total</th><th>Action</th></tr>");

				for (CartItem item : cartItems) {
					double total = item.getPrice() * item.getQuantity();
					grandTotal += total;

					out.println("<tr>");
					out.println("<td>" + item.getProductName() + "</td>");
					out.println("<td>" + item.getQuantity() + "</td>");
					out.println("<td>₹" + item.getPrice() + "</td>");
					out.println("<td>₹" + total + "</td>");
					out.println("<td>");
					out.println("<form method='post' action='remove-cart'>");
					out.println("<input type='hidden' name='cart_id' value='" + item.getCartId() + "'/>");
					out.println("<input type='submit' class='btn' value='Remove'/>");
					out.println("</form>");
					out.println("</td>");
					out.println("</tr>");
				}

				// Grand Total row
				out.println("<tr style='font-weight:bold;'>");
				out.println("<td colspan='3' style='text-align:right;'>Grand Total</td>");
				out.println("<td>₹" + grandTotal + "</td>");
				out.println("<td></td>"); // for Action column
				out.println("</tr>");


				out.println("</table>");

			}

			out.println("<br><a href='dashboard' class='button'>← Continue Shopping</a>");
			out.println("</div>");

			// Toast Container
			out.println("<div id='toast' class='toast'></div>");

			out.println("</body></html>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
