package com.aurionpro.abstract_eg.model;

public abstract class Employee {

	protected String name;
	protected String id;

	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}

	abstract Double calculateSalary();
}
