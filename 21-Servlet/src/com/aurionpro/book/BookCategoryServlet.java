package com.aurionpro.book;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/category")
public class BookCategoryServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String category = request.getParameter("name");
        ServletContext context = getServletContext();

        Integer totalVisits = (Integer) context.getAttribute("visitCount");
        if (totalVisits == null) totalVisits = 0;
        context.setAttribute("visitCount", ++totalVisits);

        int catVisits = 0;
        switch (category.toLowerCase()) {
            case "fiction":
                catVisits = (Integer) context.getAttribute("fictionCount");
                context.setAttribute("fictionCount", ++catVisits);
                break;
            case "science":
                catVisits = (Integer) context.getAttribute("scienceCount");
                context.setAttribute("scienceCount", ++catVisits);
                break;
            case "technology":
                catVisits = (Integer) context.getAttribute("techCount");
                context.setAttribute("techCount", ++catVisits);
                break;
            default:
                category = "Unknown";
        }

        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Book Category</title></head><body>");
        response.getWriter().println("<h2>Book Category: " + category + "</h2>");
        response.getWriter().println("<p>Store: BookVerse</p>");
        response.getWriter().println("<p>Admin Email: admin@bookverse.com</p>");
        response.getWriter().println("<p>" + category + " Books Visited: " + catVisits + "</p>");
        response.getWriter().println("<p>Total Visitors: " + totalVisits + "</p>");
        response.getWriter().println("<p>App Version: " + context.getAttribute("appVersion") + "</p>");
        response.getWriter().println("<br/><a href='landing'>Back to Home</a>");
        response.getWriter().println("</body></html>");
    }
}
