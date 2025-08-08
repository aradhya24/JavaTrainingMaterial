package com.aurionpro.ecommerce_miniproject.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.aurionpro.ecommerce_miniproject.utils.UserSessionTracker;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session != null) {
            String username = (String) session.getAttribute("username");
            if (username != null) {
                UserSessionTracker.removeUser(username);
            }
            //session.invalidate();
        }
        resp.sendRedirect("login.html?toast=Logged%20out%20successfully.&status=success");
    }
}

