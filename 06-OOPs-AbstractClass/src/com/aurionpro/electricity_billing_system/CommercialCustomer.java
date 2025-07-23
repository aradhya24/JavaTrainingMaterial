package com.aurionpro.electricity_billing_system;

public  class CommercialCustomer extends Customer {

	public CommercialCustomer(String name, Double unitsConsumed) {
		super(name, unitsConsumed);
	}

	@Override
	Double calculateBill() {
		return unitsConsumed * 8;
	}

	void printBill() {
		System.out.println("-------------Commercial Bill--------------");
		System.out.println("Name : " + name + " \nConsumed units : " + unitsConsumed);
		System.out.println("Your Bill is : " + calculateBill());
	}

}
