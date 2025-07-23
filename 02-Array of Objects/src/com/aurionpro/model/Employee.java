package com.aurionpro.model;

public class Employee {
	public String name;
	public String department;
	public int salary;

	public Employee(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}


     
	public Employee getEmployeeData() {
		Employee employee = new Employee(name , department , salary);
		return employee;
	}
	
	
}
