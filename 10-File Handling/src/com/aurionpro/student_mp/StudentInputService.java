package com.aurionpro.student_mp;

import java.util.Scanner;

public class StudentInputService {

	static Student getStudentInput(Scanner scanner) {
		String name = "";
		Integer rollNo = 0;
		Integer marks = 0;

		while (true) {
			System.out.print("Enter Rollno : ");
			try {
				rollNo = Integer.parseInt(scanner.nextLine());
				if (Validations.negativeValueValidate(rollNo)) {
					continue;
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Input Mismatched .... Enter roll no in digits only.");
			}
		}

		while (true) {
			System.out.print("Enter student name : ");
			name = scanner.nextLine();

			if (Validations.getStringValidateAllAlphabets(name) && Validations.getStringValidateNotNull(name)) {
				break;
			}
		}

		while (true) {
			System.out.print("Enter Marks (0 - 100): ");
			try {
				marks = Integer.parseInt(scanner.nextLine());
				if (Validations.negativeValueValidate(marks) || Validations.maxMarksValidate(marks)) {
					continue;
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Input Mismatched .... Enter marks in digits only.");
			}
		}

		return new Student(rollNo, name, marks);
	}

	static Integer getStudentRollInput(Scanner scanner) {
		Integer rollNo = -1;
		while (true) {
			System.out.print("\nEnter Rollno : ");
			try {
				rollNo = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("\nInput Mismatched .... Enter roll no in digits only.");
			}
		}
		return rollNo;
	}

}
