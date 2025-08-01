package com.aurionpro.assignments;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submitStudent")
public class StudentRegistration extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String ageStr = req.getParameter("age");
		String course = req.getParameter("course");
		
		PrintWriter pw = resp.getWriter();
		
		if(name.isEmpty() || email.isEmpty()) {
			pw.write("Error : Name and email must not be empty.");
		}
		else if (ageStr == null || ageStr.isEmpty()) {
			pw.write("Error: Age must not be empty.");
		}
		else if(course.isEmpty()) {
			pw.write("Error : Course must be selected.");
		}
		else {
			pw.write("Name : " + name + " | Email : " + email + " | Age : " + ageStr + " | Course : " + course);
		}
		
		
	}
	
}
