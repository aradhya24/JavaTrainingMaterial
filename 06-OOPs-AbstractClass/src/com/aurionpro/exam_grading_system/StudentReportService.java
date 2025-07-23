package com.aurionpro.exam_grading_system;

public class StudentReportService {

	static void  printAllReports(ScienceStudent[] scienceStudents) {
		for (ScienceStudent scienceStudent : scienceStudents) {
			scienceStudent.printDetails();
		}
	}

	static void printAllReports(CommerceStudent[] commerceStudents) {
		for (CommerceStudent commerceStudent : commerceStudents) {
			commerceStudent.printDetails();
		}
	}
}
