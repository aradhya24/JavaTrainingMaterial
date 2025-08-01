package com.aurionpro.book;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/landing")
public class LandingServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext context = getServletContext();
        Integer visits = (Integer) context.getAttribute("visitCount");
        if (visits == null) visits = 0;
        context.setAttribute("visitCount", ++visits);

        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Landing Page</title></head><body>");
        response.getWriter().println("<h2>Welcome to BookVerse!</h2>");
        response.getWriter().println("<p>Total Visitors So Far: " + visits + "</p>");
        response.getWriter().println("<h3>Select a Category:</h3>");
        response.getWriter().println("<ul>");
        response.getWriter().println("<li><a href='category?name=fiction'>Fiction</a></li>");
        response.getWriter().println("<li><a href='category?name=science'>Science</a></li>");
        response.getWriter().println("<li><a href='category?name=technology'>Technology</a></li>");
        response.getWriter().println("</ul>");
        response.getWriter().println("<br/><a href='admin'>Admin Panel</a>");
        response.getWriter().println("</body></html>");
    }
}
