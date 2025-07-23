package com.aurionpro.student_mp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		Integer choice = -1;

		while (true) {

			System.out.print(
					"\n\nChoose option : 1 -> Add Student  |  2 -> View All Students  |  3 -> Search student by Roll \n           4 -> Delete student by Roll  | 5 -> EXIT : ");

			while (true) {
				try {
					choice = Integer.parseInt(scanner.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("Input Mismatched , enter in Digits only ....");
					System.out.print(
							"\n\nChoose option : 1 -> Add Student  |  2 -> View All Students  |  3 -> Search student by Roll \n           4 -> Delete student by Roll  | 5 -> EXIT : ");
				}
			}

			switch (choice) {

			case 1:
				StudentManager.addStudent(StudentInputService.getStudentInput(scanner));
				break;

			case 2:
				StudentManager.viewAllStudent();
				break;

			case 3:
				StudentManager.searchStudentByRollNo(StudentInputService.getStudentRollInput(scanner));
				break;
            
			case 4:
				StudentManager.deleteStudentByRollNo(StudentInputService.getStudentRollInput(scanner));
				break;
				
			case 5:
				System.out.println("System exited ....");
				return;

			default:
				System.out.println("Invalid choice.....");

			}
		}

	}

}
