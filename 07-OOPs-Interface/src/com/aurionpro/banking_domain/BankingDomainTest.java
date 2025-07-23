package com.aurionpro.banking_domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingDomainTest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		IAccountOperations savingAccount = new SavingAccount();
		IAccountOperations currentAccount = new CurrentAccount();
		IAccountOperations loanAccount = new LoanAccount();
         
	    int choice = 0;
	    
		while (true) {
			System.out.print(
					"\nChoose Account Type : \n1 -> Saving Account, 2 -> Current Account, 3 -> Loan Account, 4 -> Exit : ");
			while (true) {
				try {
					choice = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input Mismatched, Enter input again");
					System.out.print(
							"\nChoose Account Type : \n1 -> Saving Account, 2 -> Current Account, 3 -> Loan Account, 4 -> Exit : ");
					scanner.next();
				}
			}

			switch (choice) {
			case 1:
				AccountOperations.savingAccountOperation(scanner, savingAccount);
				break;

			case 2:
				AccountOperations.currentAccountOperation(scanner, currentAccount);
				break;

			case 3:
				AccountOperations.loanAccountOperation(scanner, loanAccount);
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
