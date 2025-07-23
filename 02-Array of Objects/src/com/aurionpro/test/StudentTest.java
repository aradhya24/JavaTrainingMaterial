package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number of Students to be recorded : ");
		int size = scanner.nextInt();
		Student[] students = new Student[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter " + (i + 1) + " Student Details");
			scanner.nextLine();

			System.out.println("Enter Name : ");
			String name = scanner.nextLine();

			System.out.println("Enter RollNo : ");
			int rollNo = scanner.nextInt();

			System.out.println("Enter CGPA : ");
			double cgpa = scanner.nextDouble();

			students[i] = new Student(name, rollNo, cgpa);
		}

		for (Student student : students) {
			student.display();
		}

	}

}
