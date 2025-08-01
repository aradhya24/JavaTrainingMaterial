package com.aurionpro.servlet_context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visit")
public class SessionCounter extends HttpServlet{
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		int count = (int)context.getAttribute("counter");
		count++;
		context.setAttribute("counter", count);
		resp.setContentType("text/html");
		resp.getWriter().write("Visitor count : " + count);
	}
}
