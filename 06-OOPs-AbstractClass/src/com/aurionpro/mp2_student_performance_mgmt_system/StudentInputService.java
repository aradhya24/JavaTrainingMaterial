package com.aurionpro.mp2_student_performance_mgmt_system;

import java.util.Scanner;

public class StudentInputService {

	static Scanner scanner = new Scanner(System.in);

	public static Student getScienceStudentsInput(Stream stream) {
		System.out.println("\n--------------------------------");
		System.out.println("Enter " + stream + " Student Details:");

		System.out.print("Name: ");
		String name = scanner.nextLine();

		System.out.print("Roll Number: ");
		Integer rollNumber = scanner.nextInt();

		System.out.print("Physics Marks: ");
		Integer physicsMarks = scanner.nextInt();

		System.out.print("Chemistry Marks: ");
		Integer chemistryMarks = scanner.nextInt();

		System.out.print("Maths Marks: ");
		Integer mathsMarks = scanner.nextInt();
		System.out.println("--------------------------------");
		ScienceStudent scienceStudents = new ScienceStudent(name, rollNumber, stream, physicsMarks, chemistryMarks,
				mathsMarks);
		return scienceStudents;
	}

	public static Student getCommerceStudentInput(Stream stream) {
		System.out.println("\n--------------------------------");
		System.out.println("Enter " + stream + " Student Details:\n");

		scanner.nextLine();
		System.out.print("Name: ");
		String name = scanner.nextLine();

		System.out.print("Roll Number: ");
		Integer rollNumber = scanner.nextInt();

		System.out.print("Accounts Marks: ");
		Integer accounts = scanner.nextInt();

		System.out.print("Economics Marks: ");
		Integer economics = scanner.nextInt();

		System.out.print("Buisness Marks: ");
		Integer buisness = scanner.nextInt();

		CommerceStudent commerceStudents = new CommerceStudent(name, rollNumber, stream, accounts, economics, buisness);
		System.out.println("--------------------------------");
		return commerceStudents;
	}

	public static Student getArtsStudentInput(Stream stream) {
		System.out.println("\n--------------------------------");
		System.out.println("Enter " + stream + " Student Details:\n");
       
		scanner.nextLine();
		System.out.print("Name: ");
		String name = scanner.nextLine();

		System.out.print("Roll Number: ");
		Integer rollNumber = scanner.nextInt();

		System.out.print("History Marks: ");
		Integer history = scanner.nextInt();

		System.out.print("Political Science Marks: ");
		Integer politicalScience = scanner.nextInt();

		System.out.print("Sociology Marks: ");
		Integer sociology = scanner.nextInt();
		System.out.println("--------------------------------");
		ArtsStudent artsStudent = new ArtsStudent(name, rollNumber, stream, history, politicalScience, sociology);
		return artsStudent;
	}
}
