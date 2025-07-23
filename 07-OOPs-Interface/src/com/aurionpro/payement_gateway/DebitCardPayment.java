package com.aurionpro.payement_gateway;

public class DebitCardPayment implements Payment {

	@Override
	public void processPayment(Double amount) {
		System.out.println("\nDebit Card Payment  -> Amount : " + amount);
	}

}
