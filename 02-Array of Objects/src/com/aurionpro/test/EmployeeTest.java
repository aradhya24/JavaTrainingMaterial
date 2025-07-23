package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	static Scanner scanner = new Scanner(System.in);

	public void employeeListDepartmentWise(Employee[] employee) {
		System.out.print("\nEnter Department name : ");
		String departmentInput = scanner.nextLine();
		System.out.println("\n-------------------------------------------");
		for (Employee employees : employee) {
			if (departmentInput.equalsIgnoreCase(employees.getEmployeeData().department)) {
				System.out.println("Employee Name : " + employees.getEmployeeData().name);
				System.out.println("-------------------------------------------");
			}

		}
	}

	public void employeeWithLowestSalary(Employee[] employee) {
		int salary = Integer.MAX_VALUE;
		String name = "";
		for (Employee employees : employee) {
			if (employees.getEmployeeData().salary < salary) {
				salary = employees.getEmployeeData().salary;
				name = employees.getEmployeeData().name;
			}
		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("Employee With Lowest Salary : " + salary + "\nName : " + name);
		System.out.println("----------------------------------------------------------------");
	}

	public void totalEmployeeSalary(Employee[] employee) {
		int salary = 0;
		for (Employee employees : employee) {
			salary += employees.getEmployeeData().salary;
		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("Total Salary Expense for the company : " + salary);
		System.out.println("----------------------------------------------------------------");
	}

	public Employee[] getUserInput() {

		System.out.print("Enter number of Employees to be added : ");
		int numberOfEmployee = scanner.nextInt();
		System.out.println();

		Employee[] employee = new Employee[numberOfEmployee];

		for (int i = 0; i < numberOfEmployee; i++) {

			scanner.nextLine();
			System.out.println("\nEnter " + (i + 1) + " employee detail :");
			
			System.out.print("Enter name :");
			String name = scanner.nextLine();

			System.out.print("Enter Department :");
			String department = scanner.nextLine();

			System.out.print("Enter salary :");
			int salary = scanner.nextInt();
	
			employee[i] = new Employee(name, department.toLowerCase(), salary);

		}
		return employee;
	}

	public static void main(String[] args) {

		EmployeeTest employeetest = new EmployeeTest();
		Employee[] employee = employeetest.getUserInput();

		System.out.print(
				"\n\n1)Employee with lowest Salary\n2)List of Employee with particular department \n3)Total Expense for the Company in term of salary\nEnter Choice : ");
		int choice = scanner.nextInt();
		scanner.nextLine();

		switch (choice) {
		case 1:
			employeetest.employeeWithLowestSalary(employee);
			break;

		case 2:
			employeetest.employeeListDepartmentWise(employee);
			break;

		case 3:
			employeetest.totalEmployeeSalary(employee);
			break;

		case 0:
			System.out.println("-----------Exited------------");
			break;

		default:
			System.out.println("Wrong Choice !!!!!!!!");
		}

	}

}
