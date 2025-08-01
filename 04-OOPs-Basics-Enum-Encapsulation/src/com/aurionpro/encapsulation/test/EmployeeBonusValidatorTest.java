package com.aurionpro.encapsulation.test;

import java.util.Scanner;

import com.aurionpro.encapsulation.model.EmployeeBonusValidator;

public class EmployeeBonusValidatorTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of Employees to be added : ");
		int numberOfEmployee = scanner.nextInt();
		System.out.println();

		EmployeeBonusValidator[] employeeBonusValidator = new EmployeeBonusValidator[numberOfEmployee];

		for (int i = 0; i < numberOfEmployee; i++) {

			scanner.nextLine();
			System.out.println("\nEnter " + (i + 1) + " employee detail :");

			System.out.print("Enter name :");
			String name = scanner.nextLine();

			System.out.print("Enter Salary :");
			double salary = scanner.nextDouble();

			System.out.print("Enter Bonus :");
			double bonus = scanner.nextDouble();

			employeeBonusValidator[i] = new EmployeeBonusValidator();
			employeeBonusValidator[i].setName(name);
			employeeBonusValidator[i].setSalary(salary);
			employeeBonusValidator[i].setBonus(bonus);

		}
		System.out.println("------------------------------------------------");
		for(EmployeeBonusValidator employees : employeeBonusValidator) {
			employees.displaySalary();
		}

	}

}
