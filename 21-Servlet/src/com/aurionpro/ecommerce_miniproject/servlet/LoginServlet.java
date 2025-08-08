package com.aurionpro.ecommerce_miniproject.servlet;

import com.aurionpro.ecommerce_miniproject.dao.UserDao;
import com.aurionpro.ecommerce_miniproject.utils.DBUtil;
import com.aurionpro.ecommerce_miniproject.utils.UserSessionTracker;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("login.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            req.setAttribute("errorMsg", "Username and password are required.");
            RequestDispatcher rd = req.getRequestDispatcher("/error");
            rd.forward(req, resp);
            return;
        }

        try (Connection conn = DBUtil.getConnection()) {
            boolean isValid = UserDao.isValidUser(conn, username, password);

            if (isValid) {
                int userId = UserDao.getUserIdByUsernameAndPassword(conn, username, password);
                if (userId != -1) {
                    // ✅ Create a new session
                    HttpSession session = req.getSession(true);
                    session.setAttribute("username", username);
                    session.setAttribute("user_id", userId);
                    session.setMaxInactiveInterval(550); // 9 minutes

                    // ✅ Track user in UserSessionTracker
                    UserSessionTracker.addUser(username);

                    // ✅ Set last login time in cookie
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String formattedDate = sdf.format(new Date());
                    String encodedDate = URLEncoder.encode(formattedDate, StandardCharsets.UTF_8.toString());

                    Cookie lastVisit = new Cookie("lastLoginTime", encodedDate);
                    lastVisit.setMaxAge(60 * 60 * 24 * 7); // 7 days
                    lastVisit.setPath("/"); // Make cookie available for entire app
                    resp.addCookie(lastVisit);

                    // ✅ Redirect to dashboard
                    resp.sendRedirect("dashboard");
                } else {
                    resp.sendRedirect("login.html?toast=Invalid%20user.&status=error");
                }
            } else {
                resp.sendRedirect("login.html?toast=Invalid%20credentials.&status=error");
            }

        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect("login.html?toast=Internal%20error.&status=error");
        }
    }
}
