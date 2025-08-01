package com.aurionpro.assignments;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/transferMoney")
public class FundTransfer extends HttpServlet{
   
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int sourceAccNo = Integer.parseInt(req.getParameter("sourceAccount"));
		int destAccNo = Integer.parseInt(req.getParameter("destinationAccount"));
		double amount = Double.parseDouble(req.getParameter("amount"));
		
		PrintWriter pw = resp.getWriter();
		if(sourceAccNo == destAccNo) {
			pw.write("Both accounts should not the same..");
		}
		else if(amount < 1 || amount >= 50000) {
			pw.write("Amount should be positive and less than ₹50,000.");
		}
		else {
			pw.write("SUCESS : Amount transferred from " + sourceAccNo + " -> " + destAccNo);
		}
		
	}
}
