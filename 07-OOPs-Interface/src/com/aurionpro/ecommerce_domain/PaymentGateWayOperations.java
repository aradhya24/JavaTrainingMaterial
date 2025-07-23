package com.aurionpro.ecommerce_domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PaymentGateWayOperations {

	static void paymentOperation(Scanner scanner, IPaymentGateway paymentGateway) {

		if (paymentGateway == null) {
			return;
		}

		System.out.print("\nEnter Amount for Payment : ");
		while (true) {
			try {
				double amount = scanner.nextDouble();
				while (negativeAmountValidate(amount)) {
					System.out.print("\nEnter Amount for Payment again : ");
					amount = scanner.nextDouble();
				}
				paymentGateway.pay(amount);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Input Mismatched, Enter input again:");
				System.out.print("\nEnter Amount for Payment again : ");
				scanner.next();
			}
		}
	}

	static void refundOperation(Scanner scanner, IPaymentGateway paymentGateway) {
		if (paymentGateway == null) {
			return;
		}
		paymentGateway.refund();
	}

	public static IPaymentGateway paymentGatewayChoice(Scanner scanner ,  IPaymentGateway creditCard, IPaymentGateway upi, IPaymentGateway netBanking) {

		int choice = 0;
		while (true) {
			System.out.print("\nChoose Payment Gateway : \n1 -> Credit Card, 2 -> UPI, 3 -> Net Banking, 4 -> Back : ");

			while (true) {
				try {
					choice = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input Mismatched, Enter input again:");
					System.out.print(
							"\nChoose Payment Gateway : \n1 -> Credit Card, 2 -> UPI, 3 -> Net Banking, 4 -> Back : ");
					scanner.next();
				}
			}

			switch (choice) {
			case 1:
				return creditCard;

			case 2:
				return upi;

			case 3:
				return netBanking;

			case 4:
				return null;

			default:
				System.out.println("Invalid  choice.");
			}
			return null;
		}

	}

	static Boolean negativeAmountValidate(Double amount) {
		if (amount < 0) {
			System.out.println("Negative amount not Allowed ...");
			return true;
		}
		return false;
	}

}
