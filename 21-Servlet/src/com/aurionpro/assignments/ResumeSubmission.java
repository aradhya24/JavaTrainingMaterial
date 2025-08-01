package com.aurionpro.assignments;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submitResume")
public class ResumeSubmission extends HttpServlet{
     
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String resumeText = req.getParameter("resume"); 
		String skills = req.getParameter("skills");

		PrintWriter pw = resp.getWriter();

		if(name.isEmpty() || email.isEmpty() || skills.isEmpty()) {
			pw.write("Error: Name, Email, and Skills are mandatory fields.");
			return;
		}

		pw.write("Resume Submitted Successfully!!!\n");
		pw.write("----------------------------------\n");
		pw.write("Name: " + name + "\n");
		pw.write("Email: " + email + "\n");
		pw.write("Skills: " + skills + "\n");

		if(resumeText != null && !resumeText.trim().isEmpty()) {
			pw.write("Resume Summary: \n" + resumeText + "\n");
		} else {
			pw.write("Resume: (Not Provided)\n");
		}
	}
}
