package com.aurionpro.servlet_context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/initCounter")
public class ContextInitCounter extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		ServletContext context = getServletContext();
		context.setAttribute("counter", 0);
		System.out.println("Counter initialized with 0.");
	}
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.getWriter().write("Counter initialized. <a href=\"visit\">Go to visitor counter</a>");
	}

}
