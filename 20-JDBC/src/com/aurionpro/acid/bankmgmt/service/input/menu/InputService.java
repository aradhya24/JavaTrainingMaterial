package com.aurionpro.acid.bankmgmt.service.input.menu;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.aurionpro.acid.bankmgmt.dao.AccountDao;
import com.aurionpro.acid.bankmgmt.service.model.BankService;
import com.aurionpro.acid.bankmgmt.service.model.TransferFund;

public class InputService {

	public static Scanner scanner = new Scanner(System.in);
	
	

	public static void handleFundTransfer(Connection connection) throws SQLException {

		System.out.println("\n======== Sender Account ========");
		int senderId = getValidAccountId(connection);

		System.out.println("\n======== Receiver Account ========");
		int receiverId = getValidAccountId(connection);

		if (senderId != receiverId) {
			// System.out.print("\nEnter amount to transfer: ");
			double amount = getDoubleInput();

			new TransferFund(connection).transferFunds(senderId, receiverId, amount,
					TransferFund.totalBalanceConsistency());
		} else {
			System.out.println("\nSorry , Sender and Reciever should be dfferent");
		}
	}

	public static void handleFundTransferCustomer(Connection connection, int senderId) throws SQLException {


		System.out.println("\n======== Receiver Account ========");
		int receiverId = getValidAccountId(connection);

		if (senderId != receiverId) {
			double amount = getDoubleInput();

			new TransferFund(connection).transferFunds(senderId, receiverId, amount,
					TransferFund.totalBalanceConsistency());
		} else {
			System.out.println("\nSorry , Sender and Reciever should be dfferent");
		}
	}
	
	
	
	public static void handleAddAccount(Connection connection) throws SQLException {

		System.out.print("\nEnter Account Holder Name: ");
		String accountHolderName = new Scanner(System.in).nextLine();

		// System.out.print("Enter Initial Balance: ");
		double initialBalance = getDoubleInput();

		new AccountDao().addAccountHolder(connection, accountHolderName, initialBalance);
	}

	public static void handleDeleteAccount(Connection connection) throws SQLException {
		System.out.println("\nDelete Account");
		int accountId = getValidAccountId(connection);

		new AccountDao().deleteAccountHolder(connection, accountId);
	}

	
	
	public static void handleViewBalance(Connection connection) throws SQLException {
		int accountId = getValidAccountId(connection); // This should be your utility method for safe input
		double balance = AccountDao.getAccountBalance(connection, accountId);
		System.out.println(" Balance for Account ID " + accountId + ": ₹" + String.format("%.2f", balance));
	}
	
	public static void handleViewBalanceCustomer(Connection connection, int accountId) throws SQLException {
		double balance = AccountDao.getAccountBalance(connection, accountId);
		System.out.println(" Balance for Account ID " + accountId + ": ₹" + String.format("%.2f", balance));
	}

	
	
	public static int getValidAccountId(Connection connection) throws SQLException {
		while (true) {
			BankService.viewAllAccounts(connection);
			int accountId = getInput(); // Your existing input method with validation

			if (AccountDao.isAccountIdPresent(connection, accountId)) {
				return accountId;
			} else {
				System.out.println("❌ Account ID " + accountId + " does not exist. Please try again.");
			}
		}
	}
	
	public static int getValidAccountIdCustomer(Connection connection , int accountId) throws SQLException {
		
			if (AccountDao.isAccountIdPresent(connection, accountId)) {
				return accountId;
			} else {
				System.out.println("❌ Account ID " + accountId + " does not exist. Please try again.");
			}
		return 0;
	}
	
	public static int getValidAccountIdTransaction(Connection connection) throws SQLException {
		while (true) {
			BankService.viewAllAccountsTransactionHistory(connection);
			int accountId = getInput(); // Your existing input method with validation

			if (AccountDao.isALLAccountIdPresent(connection, accountId)) {
				return accountId;
			} else {
				System.out.println("❌ Account ID " + accountId + " does not exist. Please try again.");
			}
		}
	}

	
	
	private static int getInput() {
		while (true) {
			// System.out.print("Enter a valid number: ");
			try {
				System.out.print("\nEnter Account ID: ");
				int input = Integer.parseInt(scanner.nextLine().trim());
				if (input <= 0) {
					System.out.println("Number must be positive. Try again.");
					continue;
				}
				return input;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter digits only.");
				
			}
		}
	}

	private static double getDoubleInput() {
		while (true) {
			// System.out.print("Enter a valid amount: ");
			try {
				System.out.print("Enter amount : ");
				double input = Double.parseDouble(scanner.nextLine().trim());
				if (input <= 0) {
					System.out.println("Amount must be greater than 0. Try again.");
					continue;
				}
				return input;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a valid decimal or whole number.");
			}
		}
	}

	

	public static void handleDeposit(Connection connection) throws SQLException {
		int accountId = getValidAccountId(connection);
		double amount;

		while (true) {
			amount = getDoubleInput();
			if (amount % 100 == 0) {
				break;
			} else {
				System.out.println("❌ Amount must be in multiples of 100. Try again.");
			}
		}

		boolean success = new AccountDao().depositFunds(connection, accountId, amount);
		if (success) {
			System.out.println("Deposit successful.");
		} else {
			System.out.println(" Deposit failed.");
		}
	}
	
	public static void handleDepositCustomer(Connection connection , int accountId) throws SQLException {
		double amount;

		while (true) {
			amount = getDoubleInput();
			if (amount % 100 == 0) {
				break;
			} else {
				System.out.println("❌ Amount must be in multiples of 100. Try again.");
			}
		}

		boolean success = new AccountDao().depositFunds(connection, accountId, amount);
		if (success) {
			System.out.println("Deposit successful.");
		} else {
			System.out.println(" Deposit failed.");
		}
	}

	public static void handleWithdraw(Connection connection) throws SQLException {
		int accountId = getValidAccountId(connection);
		double amount;

		while (true) {
			amount = getDoubleInput();
			if (amount % 100 == 0) {
				break;
			} else {
				System.out.println("❌ Amount must be in multiples of 100. Try again.");
			}
		}
		
		boolean success = new AccountDao().withdrawFunds(connection, accountId, amount);
		if (success) {
			System.out.println("Withdrawal successful.");
		} else {
			System.out.println("Withdrawal failed.");
		}
	}
	
	public static void handleWithdrawCustomer(Connection connection , int accountId) throws SQLException {
		double amount;

		while (true) {
			amount = getDoubleInput();
			if (amount % 100 == 0) {
				break;
			} else {
				System.out.println("❌ Amount must be in multiples of 100. Try again.");
			}
		}
		
		boolean success = new AccountDao().withdrawFunds(connection, accountId, amount);
		if (success) {
			System.out.println("Withdrawal successful.");
		} else {
			System.out.println("Withdrawal failed.");
		}
	}

}
