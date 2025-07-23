package com.aurionpro.electricity_billing_system;

public abstract class Customer {
    
	protected String name;
	protected Double unitsConsumed;
	
	
	
	public Customer(String name, Double unitsConsumed) {
		this.name = name;
		this.unitsConsumed = unitsConsumed;
	}



	abstract Double calculateBill();

}
