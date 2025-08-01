package com.aurionpro.assignments;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/currencyconverter")
public class CurrencyConverter extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String usd = req.getParameter("usd");
		
		double rs = 88.88 * Integer.parseInt(usd);
		
		PrintWriter pw = resp.getWriter();
		pw.write("$"+usd + " ->   Rs " + rs);
	}
}
