package com.aurionpro.model;

public class Employee {
	String name;
	int id;
	double salary;

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void generateSalarySlip() {
		double hra = 0.2 * salary;
		double da = 0.1 * salary;
		System.out.println("--------------------------------------------");
		System.out.println("       " + name + "'s Salary slip");
		System.out.println();
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Basic Salary : " + salary);
		System.out.println("HRA is 20% of Basic : " + hra);
		System.out.println("DA is 10% of Basic : " + da);
		System.out.println("Total Salary : " + (hra + da + salary));
	}
}
