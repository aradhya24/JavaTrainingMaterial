package com.aurionpro.sort_transcation_by_amount_id_5;

import java.util.ArrayList;
import java.util.Scanner;


public class InputService {
     
	public static void getTransactionInput(Scanner scanner, ArrayList<Transaction> transactionList) {

		Double amount = 0.0;
		Integer id = 0;

		while (true) {
			System.out.print("Enter Id : ");
			try {
				id = Integer.parseInt(scanner.nextLine());
				if(Validations.negativeValueValidate(id)) {
					continue;
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Input Mismatched .... Enter id in digits only.");
			}
		}

		while (true) {
			System.out.print("Enter amount : ");
			try {
				amount = Double.parseDouble(scanner.nextLine());
				if(Validations.negativeValueValidate(amount)) {
					continue;
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Input Mismatched .... Enter amount in digits only.");
			}
		}

		transactionList.add(new Transaction(id, amount));
		System.out.println("Added Sucessfully ....");
	}
}
