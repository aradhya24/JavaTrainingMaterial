package com.aurionpro.payement_gateway;

public class CreditCardPayment implements Payment{

	@Override
	public void processPayment(Double amount) {
		System.out.println("\nCredit	 Card Payment  -> Amount : " + amount);
	}

}
