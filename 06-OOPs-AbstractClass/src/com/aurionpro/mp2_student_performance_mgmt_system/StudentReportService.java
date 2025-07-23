package com.aurionpro.mp2_student_performance_mgmt_system;

public class StudentReportService {

	static void displayAllInfo(Student[] students) {
		System.out.println("----------------------------------------");
		for (Student student : students) {
			student.displayInfo();
		}
		System.out.println("----------------------------------------");
	}

	static void displayAllInfo(Student[] students, Boolean detailed) {
		System.out.println("----------------------------------------");
		for (Student student : students) {
			student.displayInfo(detailed);
		}
		System.out.println("----------------------------------------");
	}

	static void displayAllInfo(Student[] students, String format) {
		System.out.println("----------------------------------------");
		for (Student student : students) {
			student.displayInfo(format);
		}

	}

}
