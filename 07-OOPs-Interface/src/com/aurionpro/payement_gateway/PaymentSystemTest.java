package com.aurionpro.payement_gateway;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.ecommerce_domain.CreditCard;
import com.aurionpro.ecommerce_domain.IPaymentGateway;
import com.aurionpro.ecommerce_domain.NetBanking;
import com.aurionpro.ecommerce_domain.PaymentGateWayOperations;
import com.aurionpro.ecommerce_domain.UPI;

public class PaymentSystemTest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		CreditCardPayment creditCardPayment = new CreditCardPayment();
		DebitCardPayment debitCardPayment = new DebitCardPayment();
		UpiPayments upiPayments = new UpiPayments();

		while (true) {

			int choice = 0;
			System.out.print("\nChoose Payment Gateway : \n1 -> Credit Card, 2 -> UPI, 3 -> Debit Card, 4 -> Back : ");

			while (true) {
				try {
					choice = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input Mismatched, Enter input again:");
					System.out.print("\nChoose Payment Gateway : \n1 -> Credit Card, 2 -> UPI, 3 -> Debit Card, 4 -> Back : ");
					scanner.next();
				}
			}

			switch (choice) {
			case 1:
				creditCardPayment.processPayment(PaymentOperations.getAmount(scanner));
				break;

			case 2:
				upiPayments.processPayment(PaymentOperations.getAmount(scanner));
				break;

			case 3:
				debitCardPayment.processPayment(PaymentOperations.getAmount(scanner));
				break;

			case 4:
				System.out.println("System exited ....");
				return;

			default:
				System.out.println("Invalid  choice.");
			}
		}
	}
}
