package com.aurionpro.payement_gateway;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PaymentOperations {
    
	static Double getAmount(Scanner scanner) {
		Double amount = 0.0;
		System.out.print("Enter amount to be processed : ");
		while (true) {
			try {
				amount = scanner.nextDouble();
				while(amount < 0) {
					System.out.print("Negative value not allowed ,Enter input again :");
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Input Mismatched, Enter input again:");
				scanner.next();
			}
		}
		return amount;
	}
}
