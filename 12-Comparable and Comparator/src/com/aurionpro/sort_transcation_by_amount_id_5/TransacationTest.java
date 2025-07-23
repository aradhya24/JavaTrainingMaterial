package com.aurionpro.sort_transcation_by_amount_id_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.student_example_0.Student;

public class TransacationTest {

	public static void main(String[] args) {

		ArrayList<Transaction> transactionList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		Integer choice = -1;

		while (true) {

			System.out.print("\n\nChoose option : 1 -> Add Transaction  |  2 -> View Transactions (Sorted)  |  3 -> EXIT  : ");

			while (true) {
				try {
					choice = Integer.parseInt(scanner.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("Input Mismatched , enter in Digits only ....");
					System.out.print("\n\nChoose option : 1 -> Add Transaction  |  2 -> View Transactions (Sorted)  |  3 -> EXIT  : ");
				}
			}

			switch (choice) {

			case 1:
				InputService.getTransactionInput(scanner, transactionList);
				break;

			case 2:
				Collections.sort(transactionList, new IdSortComparatorAscending());
				System.out.println("After sorting : " + transactionList);
				break;

			case 3:
				System.out.println("System exited ....");
				return;

			default:
				System.out.println("Invalid choice.....");

			}
		}
	}

}
