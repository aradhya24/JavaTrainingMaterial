package com.aurionpro.banking_domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountOperations {

	static void savingAccountOperation(Scanner scanner, IAccountOperations savingAccount) {

		int choiceTransaction = 0;
		while (true) {

			System.out.print(
					"\nChoose transaction Type : \n1 -> Deposit, 2 -> Withdraw ( Limit : Rs 10000), 3 -> Check Balance, 4 -> Back : ");

			while (true) {
				try {
					choiceTransaction = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input Mismatched, Enter input again:");
					System.out.print(
							"\nChoose transaction Type : \n1 -> Deposit, 2 -> Withdraw ( Limit : Rs 10000), 3 -> Check Balance, 4 -> Back : ");
					scanner.next();
				}
			}

			switch (choiceTransaction) {
			case 1:
				System.out.print("Enter Amount for Deposit: ");
				while (true) {
					try {
						double amount = scanner.nextDouble();
						while (negativeAmountValidate(amount)) {
							System.out.print("Enter Amount for Deposit again : ");
							amount = scanner.nextDouble();
						}
						savingAccount.deposit(amount);
						break;
					} catch (InputMismatchException e) {
						System.out.println("Input Mismatched..");
						System.out.print("Enter Amount for Deposit again : ");
						scanner.next();
					}
				}
				break;

			case 2:
				System.out.print("Enter Amount to Withdraw (Limit: Rs 10000): ");
				while (true) {
					try {
						double amount = scanner.nextDouble();
						while (negativeAmountValidate(amount)) {
							System.out.print("Enter Amount for Withdraw(Limit: Rs 10000) again : ");
							amount = scanner.nextDouble();
						}
						while (isMultiplesOf100(amount)) {
							savingAccount.withdraw(amount);
							break;
						}
						break;
					} catch (InputMismatchException e) {
						System.out.println("Input Mismatched ..");
						System.out.print("Enter Amount to Withdraw (Limit: Rs 10000): ");
						scanner.next();
					}
				}
				break;

			case 3:
				savingAccount.checkBalance();
				break;

			case 4:
				return;

			default:
				System.out.println("Invalid transaction choice.");
			}

		}
	}

	static void currentAccountOperation(Scanner scanner, IAccountOperations currentAccount) {

		int choiceTransaction = 0;
		while (true) {

			System.out.print(
					"\nChoose transaction Type : \n1 -> Deposit, 2 -> Withdraw , 3 -> Check Balance, 4 -> Back : ");

			while (true) {
				try {
					choiceTransaction = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input Mismatched, Enter input again ...");
					System.out.print(
							"\nChoose transaction Type : \n1 -> Deposit, 2 -> Withdraw , 3 -> Check Balance, 4 -> Back : ");
					scanner.next();
				}
			}

			switch (choiceTransaction) {
			case 1:
				System.out.print("\nEnter Amount for Deposit : ");
				while (true) {
					try {
						double amount = scanner.nextDouble();
						while (negativeAmountValidate(amount)) {
							System.out.print("\nEnter Amount for Deposit again : ");
							amount = scanner.nextDouble();
						}
						currentAccount.deposit(amount);
						break;
					} catch (InputMismatchException e) {
						System.out.println("Input Mismatched, Enter input again:");
						System.out.print("\nEnter Amount for Deposit: ");
						scanner.next();
					}
				}
				break;

			case 2:
				System.out.print("\nEnter Amount to Withdraw : ");
				while (true) {
					try {
						double amount = scanner.nextDouble();
						while (negativeAmountValidate(amount)) {
							System.out.print("\nEnter Amount for Witdraw again : ");
							amount = scanner.nextDouble();
						}
						while (isMultiplesOf100(amount)) {
							currentAccount.withdraw(amount);
							break;
						}

						break;
					} catch (InputMismatchException e) {
						System.out.println("Input Mismatched, Enter input again:");
						System.out.print("\nEnter Amount for Witdraw again : ");
						scanner.next();
					}
				}
				break;

			case 3:
				currentAccount.checkBalance();
				break;
			case 4:
				return;

			default:
				System.out.println("Invalid transaction choice.");
			}

		}
	}

	static void loanAccountOperation(Scanner scanner, IAccountOperations loanAccount) {

		int choiceTransaction = 0;
		while (true) {

			System.out.print("\nChoose transaction Type : \n1 -> Withdraw , 2 -> Check Balance, 4 -> Back : ");

			while (true) {
				try {
					choiceTransaction = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input Mismatched, Enter input again...");
					System.out.print("\nChoose transaction Type : \n1 -> Withdraw , 2 -> Check Balance, 4 -> Back : ");
					scanner.next();
				}
			}

			switch (choiceTransaction) {

			case 1:
				System.out.print("\nEnter Amount to Withdraw (Max Avail Loan : 10000): ");
				
				while (true) {
					try {
						double amount = scanner.nextDouble();
						
						while (negativeAmountValidate(amount)) {
							System.out.print("\nEnter Amount for Withdraw again (Max Avail Loan : 10000) : ");
							amount = scanner.nextDouble();
						}
						
						while (isMultiplesOf100(amount)) {
							loanAccount.withdraw(amount);
							break;
						}
						
						break;
					} catch (InputMismatchException e) {
						System.out.println("Input Mismatched, Enter input again:");
						System.out.print("\nEnter Amount for Withdraw again (Max Avail Loan : 10000) : ");
						scanner.next();
					}
				}
				break;

			case 2:
				loanAccount.checkBalance();
				break;
			case 4:
				return;

			default:
				System.out.println("Invalid transaction choice.");
			}

		}
	}

	static Boolean negativeAmountValidate(Double amount) {
		if (amount < 0) {
			System.out.println("Negative amount not Allowed ...");
			return true;
		}
		return false;
	}

	static Boolean isMultiplesOf100(Double amount) {
		if (amount % 100 == 0) {
			return true;
		}
		System.out.println("Amount should be in multiples of 100 ...");
		return false;
	}

}
