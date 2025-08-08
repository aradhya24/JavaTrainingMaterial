package com.aurionpro.ecommerce_miniproject.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/error")
public class ErrorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) 
            throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String errorMsg = (String) req.getAttribute("errorMsg");

        out.println("<html><head><title>Error</title></head><body>");
        out.println("<h3 style='color:red;'>Error: " + (errorMsg != null ? errorMsg : "Unknown Error") + "</h3>");
        out.println("<a href='login.html'>Go Back to Login</a>");
        out.println("</body></html>");
    }
}
