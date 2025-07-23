package com.aurionpro.ecommerce_domain;

public class CreditCard implements IPaymentGateway {

	static Boolean isAmountPaid = false;
    static Double amount;
	@Override
	public void pay(Double amount) {
		CreditCard.amount = amount;
		isAmountPaid = true;
		System.out.println("Successfully paid amount Rs. " + amount + "   | Payment Gateway : Credit Card");
	}

	@Override
	public void refund() {
		if (isAmountPaid) {
			System.out.println("Sucessfully refunded Amount Rs. " + amount + "   | Payment Gateway : Credit Card");
			CreditCard.amount = 0.0;
			isAmountPaid = false;
			return;
		}
		System.out.println("You havent't paid any amount !!!!");
	}

}
