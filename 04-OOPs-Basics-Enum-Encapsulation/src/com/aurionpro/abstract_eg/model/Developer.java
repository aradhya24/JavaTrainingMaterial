package com.aurionpro.abstract_eg.model;

public class Developer extends Employee{
    
	Double 	baseSalary;
	Double bonus;
	
	
	public Developer(String name, String id, Double baseSalary, Double bonus) {
		super(name, id);
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}

	@Override
	Double calculateSalary() {
		return baseSalary+bonus;
	}
	
	public void printDeveloper() {
		System.out.println("---------------Developer-----------------");
		System.out.println("Name : " + name);
		System.out.println("Salary : " + calculateSalary());
	}
    
	
}
