package com.aurionpro.ecommerce_domain;

public class UPI implements IPaymentGateway {

	static Boolean isAmountPaid = false;
    static Double amount;
	@Override
	public void pay(Double amount) {
		UPI.amount = amount;
		isAmountPaid = true;
		System.out.println("Successfully paid amount Rs. " + amount + "   | Payment Gateway : UPI");
	}

	@Override
	public void refund() {
		if (isAmountPaid) {
			System.out.println("Sucessfully refunded Amount Rs. " + amount + "   | Payment Gateway :UPI");
			UPI.amount = 0.0;
			isAmountPaid = false;
			return;
		}
		System.out.println("You havent't paid any amount !!!!");
	}

}
