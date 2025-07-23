package com.aurionpro.inheritance.model;

public class Employee extends Person {

	public void showRole() {
		super.displayDetails();
		System.out.println("I am Employee");
	}
}
