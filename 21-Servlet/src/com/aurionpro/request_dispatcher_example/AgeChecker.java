package com.aurionpro.request_dispatcher_example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submit-form")
public class AgeChecker extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String username = req.getParameter("username");
        String age = req.getParameter("age");

        if(Integer.parseInt(age) >= 18 && Integer.parseInt(age) <= 80) {
            RequestDispatcher rd = req.getRequestDispatcher("vote");
            rd.forward(req, resp);
        }
        else if (Integer.parseInt(age) > 80) {
        	
                resp.setContentType("text/html");

                PrintWriter pw = resp.getWriter();
                pw.println("<div style='color:red; font-weight:bold; text-align:center;'>");
                pw.println("Error: You are above 80 , please be rest at home");
                pw.println("</div><br>");

                RequestDispatcher rd = req.getRequestDispatcher("age_checker.html");
                rd.include(req, resp);
        }
        
        else {
            resp.setContentType("text/html");

            PrintWriter pw = resp.getWriter();
            pw.println("<div style='color:red; font-weight:bold; text-align:center;'>");
            pw.println("Error: Not eligible to vote below 18 age. Please enter age again.");
            pw.println("</div><br>");

            RequestDispatcher rd = req.getRequestDispatcher("age_checker.html");
            rd.include(req, resp);
        }
    }
}
