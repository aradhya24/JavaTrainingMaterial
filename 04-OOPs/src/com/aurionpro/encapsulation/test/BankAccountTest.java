package com.aurionpro.encapsulation.test;

import java.util.Scanner;

import com.aurionpro.encapsulation.model.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		
		System.out.println("\n\nEnter Account details");

		System.out.print("\nEnter Account holder name :");
		String holderName = scanner.nextLine();

		System.out.print("Enter Account Number : ");
		long accountNumber = scanner.nextLong();

		System.out.print("Enter Balance : ");
		double balance = scanner.nextDouble();

		BankAccount bankAccount = new BankAccount(accountNumber, holderName, balance);

//		System.out.println("\n----------------------------------------------------");
//		for (BankAccount bankAccounts : bankAccount) {
//			bankAccounts.checkBalance();
//        	System.out.println("----------------------------------------------------");
//		}

		int choice;
		while (true) {

			System.out.println("Enter  1 -> Withdraw , 2 -> Deposit , 3 -> Check Balance , 0 -> EXIT");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter Amount Want to withdraw : ");
				double amount = scanner.nextDouble();
				if (bankAccount.withdraw(amount)) {
					bankAccount.setBalance(bankAccount.getBalance() - amount);
					System.out.println("Amount Withdrawn Successfull ...........");
				} else {
					System.out.println("Balance is Insufficient!!!!!!!!!");
				}
				break;

			case 2:
				System.out.print("Enter Amount Want to deposit : ");
				bankAccount.setBalance(bankAccount.getBalance() + scanner.nextDouble());
				System.out.println("Amount Deposited Successfull ...........");
				break;

			case 3:
				System.out.println("Current Balance is : " + bankAccount.getBalance());
				break;
				
			case 0:
				System.out.println("System exited.......");
				scanner.close();
				return;
				
			default:
				System.out.println("Wrong Choice!!!");

			}
		}

	}

}
