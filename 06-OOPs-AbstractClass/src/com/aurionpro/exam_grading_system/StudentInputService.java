package com.aurionpro.exam_grading_system;

import java.util.Scanner;

public class StudentInputService {

	static Scanner scanner = new Scanner(System.in);

	public static ScienceStudent[] getScienceStudentsInput(Integer count) {
		ScienceStudent[] scienceStudents = new ScienceStudent[count];
		for (int i = 0; i < count; i++) {
			System.out.println("Enter Science Student Details:");

			System.out.print("Name: ");
			scanner.nextLine(); // To consume the leftover newline
			String name = scanner.nextLine();

			System.out.print("Roll Number: ");
			int rollNumber = scanner.nextInt();

			System.out.print("Physics Marks: ");
			int physicsMarks = scanner.nextInt();

			System.out.print("Chemistry Marks: ");
			int chemistryMarks = scanner.nextInt();

			System.out.print("Maths Marks: ");
			int mathsMarks = scanner.nextInt();

			scienceStudents[i] = new ScienceStudent(rollNumber, name, physicsMarks, chemistryMarks, mathsMarks);
		}
		return scienceStudents;
	}

	public static CommerceStudent[] getCommerceStudentInput(Integer count) {
		CommerceStudent[] commerceStudents = new CommerceStudent[count];
		for (int i = 0; i < count; i++) {
			System.out.println("Enter Commerce Student Details:");

			System.out.print("Name: ");
			scanner.nextLine(); // To consume the leftover newline
			String name = scanner.nextLine();

			System.out.print("Roll Number: ");
			int rollNumber = scanner.nextInt();

			System.out.print("Accounts Marks: ");
			int accounts = scanner.nextInt();

			System.out.print("Economics Marks: ");
			int economics = scanner.nextInt();

			System.out.print("Buisness Marks: ");
			int buisness = scanner.nextInt();

			commerceStudents[i] = new CommerceStudent(rollNumber, name, accounts, economics, buisness);
		}
		return commerceStudents;
	}

}
