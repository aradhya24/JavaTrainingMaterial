package com.aurionpro.abstract_eg.model;

public class Intern extends Employee {

	double stipend;

	public Intern(String name, String id, double stipend) {
		super(name, id);
		this.stipend = stipend;
	}

	@Override
	Double calculateSalary() {
		return stipend;
	}

	public void printInterns() {
		System.out.println("---------------Intern-----------------");
		System.out.println("Name : " + name);
		System.out.println("Salary : " + calculateSalary());
	}

}
