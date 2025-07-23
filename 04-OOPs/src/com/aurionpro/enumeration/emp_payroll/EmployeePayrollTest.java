package com.aurionpro.enumeration.emp_payroll;

import java.util.Scanner;

public class EmployeePayrollTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Payroll payroll = new Payroll();

		System.out.println("-------- Emplopyee Payroll Software ---------\n\n");
		System.out.println("Enter Employees Details\n ");

		payroll.addEmployee();

		int choice = 4;
		while (true) {
			System.out.print("\n1 -> View All Employees | 2 -> Search Employees by Role | 0 -> Exit : ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				payroll.getAllEmployees();
				break;

			case 2:
				scanner.nextLine();
				System.out.println();
				String role = "";
				boolean isValid = false;

				while (!isValid) {
					System.out.print("MANAGER, DEVELOPER, DESIGNER, TESTER, HR\n");
					System.out.print("Enter role : ");
					role = scanner.nextLine().toUpperCase();
					if (JobRole.MANAGER.name().equals(role)  || JobRole.DESIGNER.name().equals(role)
							|| JobRole.DEVELOPER.name().equals(role) || JobRole.HR.name().equals(role)
							|| JobRole.TESTER.name().equals(role)) {
						isValid = true;
						break;
					} else {
						System.out.println("Invalid Role ! enter again.");
					}
				}
				payroll.getEmployeesByRole(JobRole.valueOf(role));
				break;

			case 0:
				System.out.println("System Exited.....");
				return;

			default:
				System.out.println("Enter Wrong Choice !!! Enter again");
			}
		}

	}

}
