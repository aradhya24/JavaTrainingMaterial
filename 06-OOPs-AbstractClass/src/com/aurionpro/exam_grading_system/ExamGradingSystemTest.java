package com.aurionpro.exam_grading_system;

import java.util.Scanner;

import com.aurionpro.electricity_billing_system.BillingService;
import com.aurionpro.electricity_billing_system.CommercialCustomer;
import com.aurionpro.electricity_billing_system.InputService;

public class ExamGradingSystemTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		while (true) {

			System.out.println("Which Stream student want to be recorded : ");
			System.out.print("Choose 1 -> Science | 2 -> Commerce | 3 -> EXIT : ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter number of Students to be recorded : ");
				int count = scanner.nextInt();
				ScienceStudent[] scienceStudents = StudentInputService.getScienceStudentsInput(count);
				StudentReportService.printAllReports(scienceStudents);
				break;

			case 2:
				System.out.println("Enter number of Students to be recorded : ");
				count = scanner.nextInt();
				CommerceStudent[] commerceStudents = StudentInputService.getCommerceStudentInput(count);
				StudentReportService.printAllReports(commerceStudents);
				break;

			case 3:
				System.out.println("System Exited..........");
				return;

			default:
				System.out.println("Entered wrong choice !! , Enter again....");
			}

		}

	}
}
