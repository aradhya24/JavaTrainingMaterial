package com.aurionpro.acid.bankmgmt.service.input.menu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.acid.bankmgmt.service.model.BankService;

public class BankMenuService {

	private static final Scanner scanner = new Scanner(System.in);

	private final BankService bankService;

	public BankMenuService(BankService bankService) {
		this.bankService = bankService;
	}

	public void startMenuLoop() {
	   // Scanner scanner = new Scanner(System.in); // Ensure scanner is initialized

	    while (true) {
	        int choice = menuSelection();

	        try {
	            switch (choice) {
	                case 1:
	                    bankService.addAccount(bankService.connection);
	                    break;

	                case 2:
	                    ResultSet rs = BankService.viewAllAccounts(bankService.connection);
	                    rs.close();
	                    break;

	                case 3:
	                    bankService.viewAccountBalance(bankService.connection);
	                    break;

	                case 4:
	                    bankService.deleteAccount(bankService.connection);
	                    break;

	                case 5:
	                    bankService.transferFund(bankService.connection);
	                    break;
	                    
	                case 6:
	                    bankService.depositFunds(bankService.connection);
	                    break;
	                    
	                case 7:
	                    bankService.withdrawFunds(bankService.connection);
	                    break;

	                case 8:
	                    bankService.showTransactionHistory(bankService.connection);
	                    break;

	                default:
	                    System.out.println("❌ Invalid choice.");
	                    break;
	            }
	        } catch (Exception e) {
	            System.out.println("⚠️ Error: " + e.getMessage());
	        }

	        
	        System.out.print("\n👉 Do you want to Exit? Type (yes or y) to exit || press any key to continue: ");
	        //scanner.nextLine();
	        String again = scanner.nextLine().trim().toLowerCase();
	        if (again.equals("yes") || again.equals("y")) {
	            System.out.println("👋 Exiting Bank System. Goodbye!");
	            break;
	        }
	    }
	}

	public int menuSelection() {
		System.out.println("\n🏦 Welcome to Bank Management System");
		System.out.println("1. Add Bank Account");
		System.out.println("2. View All Bank Accounts");
		System.out.println("3. View Account Balance");
		System.out.println("4. Delete Account");
		System.out.println("5. Transfer Funds (Withdraw + Deposit)");
		System.out.println("6. Deposit");
		System.out.println("7. Withdraw");
		System.out.println("8. Show Transaction History");

		int choice = -1;
		while (true) {
			choice = getInput("Please select an option (1, 2, 3, 4, 5, 6, 7, 8):");
			if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7 || choice == 8) {
				break;
			} else {
				System.out.println("❌ Invalid option. Please select from 1, 2, 3, 4, 5, 6, 7, 8.");
			}
		}
		return choice;
	}

	public static int getInput(String message) {
		int input = -1;
		while (true) {
			try {
				System.out.print(message + " ");
				input = scanner.nextInt();
				scanner.nextLine(); // clear newline
				break;
			} catch (InputMismatchException e) {
				System.out.println("❌ Please enter a valid number.");
				scanner.nextLine(); // clear buffer
			}
		}
		return input;
	}
}
