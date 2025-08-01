package com.aurionpro.assignments;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bookConference")
public class EventMgmt extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     
		String attendeeName = req.getParameter("attendeeName");
		String email = req.getParameter("email");
		String seatsStr = req.getParameter("seats");
		String dateStr = req.getParameter("date");
		String sessionType = req.getParameter("session");

	    PrintWriter pw = resp.getWriter();
	    
	    if(attendeeName.isEmpty() || email.isEmpty() || seatsStr.isEmpty() || dateStr.isEmpty() || sessionType.isEmpty()) {
			pw.write("Error: All fields are required.");
			return;
		}

		int numberOfSeats = Integer.parseInt(seatsStr);

		if(numberOfSeats > 5) {
			pw.write("Error: Maximum 5 seats allowed per booking.");
			return;
		}

		try {
			LocalDate attendanceDate = LocalDate.parse(dateStr);
			LocalDate today = LocalDate.now();

			if(attendanceDate.isBefore(today)) {
				pw.write(" Error: Attendance date cannot be in the past.");
				return;
			}

			pw.write("   Ticket Confirmation\n");
			pw.write("------------------------------\n");
			pw.write("Attendee Name: " + attendeeName + "\n");
			pw.write("Email: " + email + "\n");
			pw.write("Number of Seats: " + numberOfSeats + "\n");
			pw.write("Date of Attendance: " + attendanceDate + "\n");
			pw.write("Session Type: " + sessionType + "\n");
			pw.write("------------------------------\n");
			pw.write("Thank you! Your booking is confirmed.");
			
		} catch (DateTimeParseException e) {
			pw.write("Error: Invalid date format.");
		}
	
	}

}
