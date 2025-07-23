package com.aurionpro.electricity_billing_system;

public class ResidentialCustomer extends Customer {

	public ResidentialCustomer(String name, Double unitsConsumed) {
		super(name, unitsConsumed);
	}

	@Override
	Double calculateBill() {
		return unitsConsumed * 5;
	}

	void printBill() {
		System.out.println("------------------- Residential Bill-----------------------");
		System.out.println("Name : " + name + " \nConsumed units : " + unitsConsumed);
		System.out.println("Your Bill is : " + calculateBill());
	}

}
