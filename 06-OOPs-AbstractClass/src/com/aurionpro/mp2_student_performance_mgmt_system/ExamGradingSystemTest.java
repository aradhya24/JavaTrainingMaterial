package com.aurionpro.mp2_student_performance_mgmt_system;

import java.util.Scanner;

public class ExamGradingSystemTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Students to be recorded : ");
		int count = scanner.nextInt();

		Student[] students = new Student[count];

		for (int i = 0; i < count; i++) {
			System.out.println("\n\nWhich Stream student want to be recorded : ");
			System.out.print("\nChoose 1 -> Science | 2 -> Commerce | 3 -> Arts | 4 -> EXIT : ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				students[i] = StudentInputService.getScienceStudentsInput(Stream.SCIENCE);
				break;

			case 2:
				students[i] = StudentInputService.getCommerceStudentInput(Stream.COMMERCE);
				break;

			case 3:
				students[i] = StudentInputService.getArtsStudentInput(Stream.ARTS);
				break;

			case 4:
				System.out.println("System Exited..........");
				return;

			default:
				System.out.println("Entered wrong choice !! , Enter again....");
			}
		}
		
		
		int choice = 0 ;
		
		while(true) {
			System.out.print("\n\nChoose 1 -> Show All Student Details | 2 -> Show Subject Wise Marks + AVG | 3 -> Show Percentage and grades | 4 -> EXIT : ");
			choice = scanner.nextInt();
			System.out.println();
			switch (choice) {
			case 1:
				
				StudentReportService.displayAllInfo(students);
				break;

			case 2:
				StudentReportService.displayAllInfo(students, true);
				break;

			case 3:
				StudentReportService.displayAllInfo(students, "Grade");
				break;

			case 4:
				System.out.println("System Exited..........");
				return;

			default:
				System.out.println("Entered wrong choice !! , Enter again....");
			}
		}

	}
}
