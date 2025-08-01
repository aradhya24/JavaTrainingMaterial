package com.aurionpro.acid.bankmgmt.service.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.aurionpro.acid.bankmgmt.service.transactionlogs.TransactionLogger;
import com.aurionpro.acid.bankmgmt.service.transactionlogs.TransactionRecord;

public class TransferFund {

	private static Connection connection;

	public TransferFund(Connection connection) {
		this.connection = connection;
	}

	// Transfer Funds from one account to another
	public void transferFunds(int fromAccount, int toAccount, double transferAmount, double expectedTotalBalance) {
		boolean isSuccess = false;

		try {
			connection.setAutoCommit(false);

			checkSenderAccountBalance(transferAmount, fromAccount);
			debitFromSenderAccount(transferAmount, fromAccount);
			creditToSenderAccount(transferAmount, toAccount);
			totalBalanceConsistency(expectedTotalBalance);

			connection.commit();
			isSuccess = true;
			System.out.println("✅ Transfer successful from account " + fromAccount + " to " + toAccount);
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException ex) {
				System.err.println("❌ Rollback also failed: " + ex.getMessage());
			}
			System.err.println("❌ Transfer failed. Reason: " + e.getMessage());
		} finally {
			try {
				connection.setAutoCommit(true);
			} catch (SQLException e) {
				System.err.println("❌ Failed to reset auto-commit: " + e.getMessage());
			}

			// Log transaction
			String status = isSuccess ? "SUCCESS" : "FAILED";
			TransactionLogger.logTransaction(new TransactionRecord(fromAccount, toAccount, transferAmount, status,"TRANSFER"));
		}
	}

	// Checking sender account balance
	public Boolean checkSenderAccountBalance(double transferAmount, int fromAccount) throws SQLException {

		PreparedStatement checkBalanceStmt = connection
				.prepareStatement("SELECT balance FROM bank_account WHERE account_id = ?");
		checkBalanceStmt.setInt(1, fromAccount);
		ResultSet balanceResult = checkBalanceStmt.executeQuery();

		if (!balanceResult.next()) {
			throw new SQLException("ICICI account not found.");
		}

		double currentBalance = balanceResult.getDouble("balance");
		if (currentBalance < transferAmount) {
			throw new SQLException("Insufficient funds in ICICI account.");
		}

		return true;
	}

	// Debit from sender Account
	public Integer debitFromSenderAccount(double transferAmount, int fromAccount) throws SQLException {
		PreparedStatement debitStmt = connection
				.prepareStatement("UPDATE bank_account SET balance = balance - ? WHERE account_id = ?");
		debitStmt.setDouble(1, transferAmount);
		debitStmt.setInt(2, fromAccount);
		int debitResult = debitStmt.executeUpdate();
		if (debitResult != 1)
			throw new SQLException("Debit failed.");

		return debitResult;
	}

	// Credit to Reciever Account
	public Integer creditToSenderAccount(double transferAmount, int toAccount) throws SQLException {
		PreparedStatement creditStmt = connection
				.prepareStatement("UPDATE bank_account SET balance = balance + ? WHERE account_id = ?");
		creditStmt.setDouble(1, transferAmount);
		creditStmt.setInt(2, toAccount);
		int creditResult = creditStmt.executeUpdate();
		if (creditResult != 1) {
			throw new SQLException("Credit failed.");
		}
		return creditResult;
	}

	// get total balance consistency
	public static double totalBalanceConsistency() throws SQLException {
		Statement checkStmt = connection.createStatement();
		ResultSet rs = checkStmt.executeQuery("SELECT SUM(balance) AS total FROM bank_account");
		double total = 0.0;
		if (rs.next()) {
			total = rs.getDouble("total");
		}
		return total;
	}

	// Check total balance consistency
	public static boolean totalBalanceConsistency(double expectedTotalBalance) throws SQLException {
		Statement checkStmt = connection.createStatement();
		ResultSet rs = checkStmt.executeQuery("SELECT SUM(balance) AS total FROM bank_account");
		if (rs.next()) {
			double total = rs.getDouble("total");
			if (total != expectedTotalBalance) {
				throw new SQLException("Inconsistent total funds!");
			}
		}
		return true;
	}

}
