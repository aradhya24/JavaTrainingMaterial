package com.aurionpro.ecommerce_domain;

public class NetBanking implements IPaymentGateway {

	static Boolean isAmountPaid = false;
    static Double amount;
	@Override
	public void pay(Double amount) {
		NetBanking.amount = amount;
		isAmountPaid = true;
		System.out.println("Successfully paid amount Rs. " + amount + "   | Payment Gateway : NetBanking");
	}

	@Override
	public void refund() {
		if (isAmountPaid) {
			System.out.println("Sucessfully refunded Amount Rs. " + amount + "   | Payment Gateway : NetBanking");
			NetBanking.amount = 0.0;
			isAmountPaid = false;
			return;
		}
		System.out.println("You havent't paid any amount !!!!");
	}

}
