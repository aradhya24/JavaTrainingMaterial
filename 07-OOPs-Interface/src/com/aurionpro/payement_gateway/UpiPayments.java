package com.aurionpro.payement_gateway;

public class UpiPayments implements Payment{

	@Override
	public void processPayment(Double amount) {
		System.out.println("\nUpi Payment : " + amount);
	}
     
}
