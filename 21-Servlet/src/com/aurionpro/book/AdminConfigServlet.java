package com.aurionpro.book;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
    urlPatterns = "/admin",
    initParams = {
        @WebInitParam(name = "storeName", value = "BookVerse"),
        @WebInitParam(name = "adminEmail", value = "admin@bookverse.com"),
        @WebInitParam(name = "category", value = "Science")
    }
)
public class AdminConfigServlet extends HttpServlet {
    private String storeName;
    private String adminEmail;
    private String category;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        storeName = config.getInitParameter("storeName");
        adminEmail = config.getInitParameter("adminEmail");
        category = config.getInitParameter("category");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Admin Config</title></head><body>");
        out.println("<h2>🔹 Admin Panel</h2>");
        out.println("<p>Configured Category: " + category + "</p>");
        out.println("<p>Store Name: " + storeName + "</p>");
        out.println("<p>Contact Admin: " + adminEmail + "</p>");
        out.println("<a href='landing'>Back to Home</a>");
        out.println("</body></html>");
    }
}
