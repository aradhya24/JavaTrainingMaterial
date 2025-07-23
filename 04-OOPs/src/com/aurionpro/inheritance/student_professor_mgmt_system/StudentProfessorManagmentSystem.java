package com.aurionpro.inheritance.student_professor_mgmt_system;

import java.util.Scanner;

public class StudentProfessorManagmentSystem {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int choice = 6;

		while (true) {
			System.out.print(
					"\nWant to Register \n 1 -> Student , 2 -> Professor , 0 -> EXIT : ");
			choice = scanner.nextInt();
			switch (choice) {

			case 0:
				System.out.println("Total Count of Student : " + Student.countStudents);
				System.out.println("System.exited!!!!!!");
				return;

			case 1:
				studentDetails();
				System.out.println("Total Count of Student : " + Student.countStudents);
				break;

			case 2:
				professorDetails();
				break;

			}
		}

	}

	static void studentDetails() {
		System.out.print("\nEnter Number of student details : ");
		int numberOfStudent = scanner.nextInt();
		scanner.nextLine();
		Student[] student = new Student[numberOfStudent];
		Student.countStudents = numberOfStudent;
		for (int i = 0; i < numberOfStudent; i++) {
			System.out.println("-------------------------------------------");
			System.out.println("Enter Student " + (i + 1) + " details: ");
			System.out.print("\nEnter Name : ");
			String name = scanner.nextLine();
			System.out.print("Enter RollNo : ");
			int rollNo = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Department Names : ");
			Departments[] departments = Departments.values();
			for (Departments department : departments) {
				System.out.print(" " + department);
			}
			System.out.print(" : ");

			String inputDepartment = scanner.nextLine().toUpperCase();

			System.out.print("\nEnter number of Courses want to enrolled : ");
			int numberOfCourse = scanner.nextInt();

			String[] courseName = new String[numberOfCourse];
			String[] courseType = new String[numberOfCourse];
			scanner.nextLine();
			int j = 0;
			while (true) {
				if (j < numberOfCourse) {

					System.out.print("\nEnter Course" + (j + 1) + " name : ");
					courseName[j] = scanner.nextLine().toUpperCase();
					System.out.print("Enter Course Type :  Core  or  Elective : ");
					courseType[j++] = scanner.nextLine().toUpperCase();

				} else {
					break;
				}
			}

			student[i] = new Student();
			student[i].setName(name);
			student[i].setRollNo(rollNo);
			student[i].setDepartment(Departments.valueOf(inputDepartment));
			student[i].setCourseTypes(courseType);
			student[i].setEnrolledCourses(courseName);

			
		}
		Student students = new Student();
		System.out.println("\n-------------------------------------------");
		students.getDetails(student);
	}

	static void professorDetails() {
		System.out.print("\nEnter Number of Professor details : ");
		int numberOfProfessor = scanner.nextInt();
		scanner.nextLine();
		Professor[] professor = new Professor[numberOfProfessor];
		for (int i = 0; i < numberOfProfessor; i++) {
			System.out.println("-------------------------------------------");
			System.out.println("Enter professor " + (i + 1) + " details: ");
			System.out.print("\nEnter Name : ");
			String name = scanner.nextLine();
			System.out.print("Enter ID : ");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Department Names : ");
			Departments[] departments = Departments.values();
			for (Departments department : departments) {
				System.out.print(" " + department);
			}
			System.out.print(" : ");

			String inputDepartment = scanner.nextLine().toUpperCase();

			System.out.print("\nEnter number of Subjects You Teached : ");
			int numberOfSubjects = scanner.nextInt();

			String[] courseName = new String[numberOfSubjects];
			String[] courseType = new String[numberOfSubjects];
			scanner.nextLine();
			int j = 0;
			while (true) {
				if (j < numberOfSubjects) {
					System.out.print("\nEnter subject " + (j + 1) + " name : ");
					courseName[j] = scanner.nextLine().toUpperCase();
					System.out.print("Enter subject Type :  Core  or  Elective : ");
					courseType[j++] = scanner.nextLine().toUpperCase();

				} else {
					break;
				}
			}

			professor[i] = new Professor();
			professor[i].setName(name);
			professor[i].setProfessorID(id);
			professor[i].setDepartment(Departments.valueOf(inputDepartment));
			professor[i].setCourseTypes(courseType);
			professor[i].setAssignedSubjects(courseName);

		}
		Professor professors = new Professor();
		System.out.println("\n-------------------------------------------");
		professors.getDetails(professor);
	}

}
