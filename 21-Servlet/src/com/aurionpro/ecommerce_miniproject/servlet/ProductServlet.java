package com.aurionpro.ecommerce_miniproject.servlet;

import com.aurionpro.ecommerce_miniproject.dao.ProductDao;
import com.aurionpro.ecommerce_miniproject.model.Product;
import com.aurionpro.ecommerce_miniproject.utils.UserSessionTracker;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

@WebServlet(
    urlPatterns = "/dashboard",
    initParams = {
        @WebInitParam(name = "admin", value = "Mr. Hassan")
    }
)
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession(false);
        if (session == null || session.getAttribute("username") == null) {
            resp.sendRedirect("login.html?toast=Session%20expired.%20Please%20login%20again.&status=error");
            return;
        }

        String username = (String) session.getAttribute("username");

        // Read last visit cookie
        String lastVisitTime = "First visit";
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("lastLoginTime".equals(cookie.getName())) {
                    lastVisitTime = URLDecoder.decode(cookie.getValue(), "UTF-8");
                    break;
                }
            }
        }

        ServletContext context = getServletContext();
        String portalMotto = (String) context.getAttribute("portalMotto");
        int onlineUsers = UserSessionTracker.getOnlineUserCount();
        //if (onlineUsers == null) onlineUsers = 0;

        ServletConfig config = getServletConfig();
        String admin = config.getInitParameter("admin");

        String toastMessage = (String) session.getAttribute("message");
        if (toastMessage != null) session.removeAttribute("message");

        List<Product> productList = new ArrayList<>();
        try {
            productList = ProductDao.getAllProducts();
        } catch (Exception e) {
            System.out.println("There is some issue with product server: " + e);
        }

        // Start HTML
        out.println("<html><head><title>Product List</title>");
        out.println("<style>");
        out.println("body { font-family: Arial; background-color: #f4f4f4; margin: 0; }");
        out.println(".navbar { background-color: #343a40; color: white; padding: 10px 20px; display: flex; justify-content: space-between; align-items: center; }");
        out.println(".navbar .user { font-weight: bold; }");
        out.println(".navbar .logout { background-color: #dc3545; color: white; padding: 5px 10px; border: none; border-radius: 4px; text-decoration: none; }");
        out.println(".container { max-width: 800px; margin: 30px auto; background: #fff; padding: 20px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
        out.println("table { width: 100%; border-collapse: collapse; margin-top: 20px; }");
        out.println("th, td { padding: 10px; text-align: left; border-bottom: 1px solid #ddd; }");
        out.println("th { background-color: #007bff; color: white; }");
        out.println("input[type=submit], .button { margin-top: 20px; background-color: #28a745; color: white; padding: 10px 20px; border: none; cursor: pointer; border-radius: 5px; text-decoration: none; display: inline-block; }");
        out.println("select { padding: 5px; }");
        out.println(".toast { visibility: hidden; min-width: 250px; margin-left: -125px; background-color: #333; color: #fff; text-align: center; border-radius: 8px; padding: 12px; position: fixed; z-index: 1; left: 50%; bottom: 30px; font-size: 15px; opacity: 0; transition: opacity 0.5s, bottom 0.5s; }");
        out.println(".toast.show { visibility: visible; opacity: 1; bottom: 50px; }");
        out.println("</style>");

        out.println("<script>");
        out.println("function showToast(message) {");
        out.println("  var toast = document.getElementById('toast');");
        out.println("  toast.textContent = message;");
        out.println("  toast.className = 'toast show';");
        out.println("  setTimeout(function(){ toast.className = toast.className.replace('show', ''); }, 2000);");
        out.println("}");
        if (toastMessage != null) {
            out.println("window.onload = function() { showToast('" + toastMessage.replace("'", "\\'") + "'); };");
        }
        out.println("</script>");

        out.println("</head><body>");

        // Navbar
        out.println("<div class='navbar'>");
        out.println("<div class='user'>Welcome, " + username + "</div>");
        out.println("<a href='logout' class='logout'>Logout</a>");
        out.println("</div>");

        // Dashboard Info
        out.println("<div class='container'>");
        out.printf("<p><strong>Last Visit:</strong> %s</p>", lastVisitTime);
        out.printf("<p><strong>Online Users:</strong> %d</p>", onlineUsers);
        out.printf("<p><strong>Admin:</strong> %s</p>", admin);
        out.printf("<p><strong>Portal Motto:</strong> %s</p>", portalMotto);
        out.println("<a href='view-cart' class='button'>View Cart</a>");

        // Product Table
        out.println("<form action='add-to-cart' method='post'>");
        out.println("<table>");
        out.println("<tr><th>Select</th><th>Product</th><th>Status</th><th>Qty</th><th>Price</th></tr>");

        for (Product product : productList) {
            out.println("<tr>");
            if (product.getQuantity() > 0) {
                out.printf("<td><input type='checkbox' name='products' value='%d'></td>", product.getProductId());
            } else {
                out.println("<td><input type='checkbox' disabled></td>");
            }

            out.printf("<td>%s</td>", product.getProductName());

            String status = product.getQuantity() > 0 ? "In Stock" : "Out of Stock";
            out.printf("<td>%s</td>", status);

            if (product.getQuantity() > 0) {
                out.printf("<td><select name='qty_%d'>", product.getProductId());
                for (int i = 1; i <= 5; i++) {
                    out.printf("<option value='%d'>%d</option>", i, i);
                }
                out.println("</select></td>");
            } else {
                out.println("<td>-</td>");
            }

            out.printf("<td>₹%.2f</td>", product.getPrice());
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("<input type='submit' value='Add to Cart'>");
        out.println("</form>");
        out.println("</div>");

        // Toast Container
        out.println("<div id='toast' class='toast'></div>");

        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doGet(req, resp);
    }
}
