package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of Employee : ");
		int numberOfEmployee = scanner.nextInt();
		System.out.println();

		Employee[] employee = new Employee[numberOfEmployee];

		for (int i = 0; i < numberOfEmployee; i++) {

			scanner.nextLine();
			System.out.println("\nEnter " + (i + 1) + " employee detail :");

			System.out.print("Enter name :");
			String name = scanner.nextLine();

			System.out.print("Enter ID :");
			int id = scanner.nextInt();

			System.out.print("Enter Salary :");
			double salary = scanner.nextDouble();

			employee[i] = new Employee(name, id, salary);

		}

		for (Employee employees : employee) {
			employees.generateSalarySlip();
		}
		System.out.println("--------------------------------------------");

	}
}