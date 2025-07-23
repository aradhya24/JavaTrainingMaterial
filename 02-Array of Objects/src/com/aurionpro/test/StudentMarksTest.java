package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.model.StudentMarks;

public class StudentMarksTest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number of Students to be recorded : ");
		int size = scanner.nextInt();
		StudentMarks[] students = new StudentMarks[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter " + (i + 1) + " Student Details");
			scanner.nextLine();

			System.out.println("Enter Name : ");
			String name = scanner.nextLine();

			System.out.println("Enter RollNo : ");
			int rollNo = scanner.nextInt();

			System.out.println("Enter English Marks : ");
			int englishMarks = scanner.nextInt();
			
			System.out.println("Enter Science Marks : ");
			int scienceMarks = scanner.nextInt();
			
			System.out.println("Enter Maths Marks : ");
			int mathsMarks = scanner.nextInt();

			students[i] = new StudentMarks(name, rollNo, englishMarks ,scienceMarks, mathsMarks);
		}

		for (StudentMarks student : students) {
			student.display();
		}

	}

}
