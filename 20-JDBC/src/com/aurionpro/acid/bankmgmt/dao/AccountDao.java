package com.aurionpro.acid.bankmgmt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.aurionpro.acid.bankmgmt.service.transactionlogs.TransactionLogger;
import com.aurionpro.acid.bankmgmt.service.transactionlogs.TransactionRecord;

public class AccountDao {

	public void addAccountHolder(Connection connection, String accountHolderName, double initialBalance)
			throws SQLException {
		String insertQuery = "INSERT INTO bank_account (account_name, balance, status) VALUES (?, ?, ?)";
		try (PreparedStatement pstmt = connection.prepareStatement(insertQuery)) {
			pstmt.setString(1, accountHolderName);
			pstmt.setDouble(2, initialBalance);
			pstmt.setString(3, "ACTIVE");
			int rowsInserted = pstmt.executeUpdate();
			if (rowsInserted == 1) {
				System.out.println("✅ Account created successfully for " + accountHolderName);
			} else {
				throw new SQLException("Account creation failed.");
			}
		}
	}

	public void deleteAccountHolder(Connection connection, int accountId) throws SQLException {
		String updateQuery = "UPDATE bank_account SET status = ? WHERE account_id = ?";
		try (PreparedStatement pstmt = connection.prepareStatement(updateQuery)) {
			pstmt.setString(1, "INACTIVE"); // Set status
			pstmt.setInt(2, accountId);     // Use index 2 for account ID

			int rowsUpdated = pstmt.executeUpdate();
			if (rowsUpdated == 1) {
				System.out.println("✅ Account ID " + accountId + " marked as INACTIVE successfully.");
			} else {
				throw new SQLException("❌ Account not found or status could not be updated.");
			}
		}
	}

	public static ResultSet viewAllAccountHolders(Connection connection) throws SQLException {
		String selectQuery = "SELECT account_id, account_name,status FROM bank_account";
		ResultSet rs = null;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(selectQuery);

			System.out.println("\n📋 List of All Account Holders:");
			System.out.println("----------------------------------------");
			System.out.printf("%-10s %-20s\n", "AccountID", "Holder Name");

			while (rs.next()) {
				int id = rs.getInt("account_id");
				String name = rs.getString("account_name");
				if(rs.getString("status").equals("ACTIVE")) {
					System.out.printf("%-10d %-20s\n", id, name);
				}
				
			}
			System.out.println("----------------------------------------\n");
		} catch (Exception e) {
			System.out.print("Error : ");
			e.printStackTrace();
		}
		return rs;
	}

	
	public static ResultSet viewAllAccountHoldersTransactionHistory(Connection connection) throws SQLException {
		String selectQuery = "SELECT account_id, account_name, status FROM bank_account";
		ResultSet rs = null;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(selectQuery);

			System.out.println("\n📋 List of All Account Holders:");
			System.out.println("---------------------------------------------");
			System.out.printf("%-10s %-30s\n", "AccountID", "Holder Name");

			while (rs.next()) {
				int id = rs.getInt("account_id");
				String name = rs.getString("account_name");
				String status = rs.getString("status");

				if ("INACTIVE".equalsIgnoreCase(status)) {
					name += " (INACTIVE)";
				}

				System.out.printf("%-10d %-30s\n", id, name);
			}
			System.out.println("---------------------------------------------\n");
		} catch (Exception e) {
			System.out.print("Error : ");
			e.printStackTrace();
		}
		return rs;
	}

	
	public static double getAccountBalance(Connection connection, int accountId) throws SQLException {
		String query = "SELECT balance FROM bank_account WHERE account_id = ?";
		try (PreparedStatement stmt = connection.prepareStatement(query)) {
			stmt.setInt(1, accountId);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return rs.getDouble("balance");
				} else {
					throw new SQLException("❌ Account ID " + accountId + " not found.");
				}
			}
		}
	}

	public static boolean isALLAccountIdPresent(Connection connection, int accountId) throws SQLException {
		String query = "SELECT 1 FROM bank_account WHERE account_id = ?";
		try (PreparedStatement stmt = connection.prepareStatement(query)) {
			stmt.setInt(1, accountId);
			try (ResultSet rs = stmt.executeQuery()) {
				return rs.next(); // true if accountId exists
			}
		}
	}
	
	
	public static boolean isAccountIdPresent(Connection connection, int accountId) throws SQLException {
	    String query = "SELECT 1 FROM bank_account WHERE account_id = ? AND status = 'ACTIVE'";
	    try (PreparedStatement stmt = connection.prepareStatement(query)) {
	        stmt.setInt(1, accountId);
	        try (ResultSet rs = stmt.executeQuery()) {
	            return rs.next(); // true if ACTIVE accountId exists
	        }
	    }
	}


	public boolean depositFunds(Connection connection, int accountId, double amount) {
	    boolean isSuccess = false;
	    try {
	        if (!isAccountIdPresent(connection, accountId)) {
	            System.out.println("Account ID " + accountId + " does not exist.");
	            return false;
	        }

	        String query = "UPDATE bank_account SET balance = balance + ? WHERE account_id = ?";
	        PreparedStatement stmt = connection.prepareStatement(query);
	        stmt.setDouble(1, amount);
	        stmt.setInt(2, accountId);

	        int rows = stmt.executeUpdate();
	        if (rows > 0) {
	            System.out.println("Amount ₹" + amount + " deposited to Account ID " + accountId);
	            isSuccess = true;
	        }
	    } catch (SQLException e) {
	        System.out.println("Error in deposit: " + e.getMessage());
	    } finally {
	        String status = isSuccess ? "SUCCESS" : "FAILED";
	        TransactionLogger.logTransaction(new TransactionRecord(accountId, -1, amount, status, "DEPOSIT"));
	    }
	    return isSuccess;
	}


	public boolean withdrawFunds(Connection connection, int accountId, double amount) {
	    boolean isSuccess = false;
	    try {
	        if (!isAccountIdPresent(connection, accountId)) {
	            System.out.println("Account ID " + accountId + " does not exist.");
	            return false;
	        }

	        double currentBalance = getAccountBalance(connection, accountId);
	        if (currentBalance < amount) {
	            System.out.println("Insufficient balance. Current: ₹" + currentBalance);
	            return false;
	        }

	        String query = "UPDATE bank_account SET balance = balance - ? WHERE account_id = ?";
	        PreparedStatement stmt = connection.prepareStatement(query);
	        stmt.setDouble(1, amount);
	        stmt.setInt(2, accountId);

	        int rows = stmt.executeUpdate();
	        if (rows > 0) {
	            System.out.println("Amount ₹" + amount + " withdrawn from Account ID " + accountId);
	            isSuccess = true;
	        }
	    } catch (SQLException e) {
	        System.out.println("Error in withdrawal: " + e.getMessage());
	    } finally {
	        String status = isSuccess ? "SUCCESS" : "FAILED";
	        TransactionLogger.logTransaction(new TransactionRecord(accountId, -1, amount, status, "WITHDRAW"));
	    }
	    return isSuccess;
	}



}
