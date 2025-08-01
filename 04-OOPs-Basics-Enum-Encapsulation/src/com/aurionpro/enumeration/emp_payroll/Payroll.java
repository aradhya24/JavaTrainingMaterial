package com.aurionpro.enumeration.emp_payroll;

import java.util.Scanner;

public class Payroll {

	Employee[] employees = new Employee[5];
	Scanner scanner = new Scanner(System.in);

	public void addEmployee() {

		for (int i = 0; i < 5; i++) {
			System.out.println("---------------------------------------");
			System.out.println("Enter " + (i + 1) + " employee details ");
			System.out.print("Enter name : ");
			String name = scanner.nextLine();

			System.out.print("Enter employee ID : ");
			int empId = scanner.nextInt();

			System.out.print("Enter salary : ");
			double salary = scanner.nextDouble();

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

			employees[i] = new Employee(empId, name, salary, JobRole.valueOf(role));

		}
	}

	public void getAllEmployees() {
		System.out.println("----------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println("Employee " + (i + 1) + " details");
			System.out.println("Employee Id : " + employees[i].getEmployeeId());
			System.out.println("Enter name : " + employees[i].getName());
			System.out.println("Job role : " + employees[i].getJobRole());
			System.out.println("Salary : Rs." + employees[i].getSalary());
			System.out.println("Bonus on salary : " + employees[i].calculateBonus(employees[i].getJobRole()));
			System.out.println("Total Salary : "
					+ (employees[i].getSalary() + employees[i].calculateBonus(employees[i].getJobRole())));
			System.out.println("----------------------------------");
		}
	}

	public void getEmployeesByRole(JobRole jobrole) {
		System.out.println("----------------------------------");
		for (int i = 0; i < 5; i++) {
			if (jobrole == employees[i].getJobRole()) {
				System.out.println("Employee " + (i + 1) + " details");
				System.out.println("Employee Id : " + employees[i].getEmployeeId());
				System.out.println("Enter name : " + employees[i].getName());
				System.out.println("Job role : " + employees[i].getJobRole());
				System.out.println("Salary : Rs." + employees[i].getSalary());
				System.out.println("Bonus on salary : " + employees[i].calculateBonus(employees[i].getJobRole()));
				System.out.println("Total Salary : "
						+ (employees[i].getSalary() + employees[i].calculateBonus(employees[i].getJobRole())));
				System.out.println("----------------------------------");
			}
		}
	}

}
