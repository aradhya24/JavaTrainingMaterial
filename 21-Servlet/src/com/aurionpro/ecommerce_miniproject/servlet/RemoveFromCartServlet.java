package com.aurionpro.ecommerce_miniproject.servlet;

import com.aurionpro.ecommerce_miniproject.dao.CartDao;
import com.aurionpro.ecommerce_miniproject.utils.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;

@WebServlet("/remove-cart")
public class RemoveFromCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("user_id") == null) {
            response.sendRedirect("login.html");
            return;
        }

        int cartId = Integer.parseInt(request.getParameter("cart_id"));
        int userId = (int) session.getAttribute("user_id");

        try (Connection conn = DBUtil.getConnection()) {
            CartDao.removeFromCartByCartId(conn, cartId, userId);
        } catch (Exception e) {
            throw new ServletException(e);
        }

        response.sendRedirect("view-cart?removed=1");
    }
}
