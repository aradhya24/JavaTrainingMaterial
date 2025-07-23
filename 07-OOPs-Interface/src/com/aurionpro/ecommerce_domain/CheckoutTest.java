package com.aurionpro.ecommerce_domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckoutTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		IPaymentGateway creditCard = new CreditCard();
		IPaymentGateway upi = new UPI();
		IPaymentGateway netBanking = new NetBanking();

		int choice = 0;

		while (true) {
			System.out.print("\nChoose Payment type : \n1 -> Pay , 2 ->Refund, 4 -> Exit : ");
			while (true) {
				try {
					choice = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input Mismatched, Enter input again ...");
					System.out.print("\nChoose Payment type : \n1 -> Pay , 2 ->Refund, 4 -> Exit : ");
					scanner.next();
				}
			}
			IPaymentGateway iPaymentGateway;
			switch (choice) {
			case 1:
				iPaymentGateway = PaymentGateWayOperations.paymentGatewayChoice(scanner, creditCard, upi, netBanking);
				PaymentGateWayOperations.paymentOperation(scanner, iPaymentGateway);
				break;

			case 2:
				iPaymentGateway = PaymentGateWayOperations.paymentGatewayChoice(scanner, creditCard, upi, netBanking);
				PaymentGateWayOperations.refundOperation(scanner, iPaymentGateway);
				break;

			case 4:
				System.out.println("Exiting...");
				scanner.close();
				return;

			default:
				System.out.println("Invalid account choice.");
			}
		}

	}

}
