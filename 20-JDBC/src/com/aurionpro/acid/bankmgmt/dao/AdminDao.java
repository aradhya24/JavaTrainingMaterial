package com.aurionpro.acid.bankmgmt.dao;

import java.sql.*;

public class AdminDao {

	public static void deactivateAccount(Connection conn, int accountId) {
		String query = "UPDATE bank_account SET status = 'INACTIVE' WHERE account_id = ?";

		try (PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setInt(1, accountId);
			int rows = stmt.executeUpdate();

			if (rows > 0) {
				System.out.println(" Account ID " + accountId + " has been deactivated.");
			} else {
				System.out.println(" No account found with ID " + accountId + " or it is already inactive.");
			}

		} catch (SQLException e) {
			System.out.println(" SQL Error while deactivating account: " + e.getMessage());
		}
	}

	// public static boolean activateAccount(Connection conn, int accountId) throws
	// SQLException {
	// String query = "UPDATE bank_account SET status = 'ACTIVE' WHERE account_id =
	// ?";
	// try (PreparedStatement stmt = conn.prepareStatement(query)) {
	// stmt.setInt(1, accountId);
	// return stmt.executeUpdate() > 0;
	// }
	// }

	public static void updateAccountHolder(Connection conn, int accountId, String newName) {
		String query = "UPDATE bank_account SET account_holder = ? WHERE account_id = ?";

		try (PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, newName);
			stmt.setInt(2, accountId);
			int rows = stmt.executeUpdate();

			if (rows > 0) {
				System.out.println(" Account holder name updated successfully for Account ID: " + accountId);
			} else {
				System.out.println(" Update failed. No matching account found with ID: " + accountId);
			}

		} catch (SQLException e) {
			System.out.println(" SQL Error while updating account holder name: " + e.getMessage());
		}
	}

	public static ResultSet viewAllAccountHolders(Connection connection) throws SQLException {
		String selectQuery = "SELECT account_id, account_holder,status FROM bank_account";
		ResultSet rs = null;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(selectQuery);

			System.out.println("\n📋 List of All Account Holders:");
			System.out.println("----------------------------------------");
			System.out.printf("%-10s %-20s\n", "AccountID", "Holder Name");

			while (rs.next()) {
				int id = rs.getInt("account_id");
				String name = rs.getString("account_holder");
				if (rs.getString("status").equals("ACTIVE")) {
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
		String selectQuery = "SELECT account_id, account_holder, status FROM bank_account";
		ResultSet rs = null;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(selectQuery);

			System.out.println("\n List of All Account Holders:");
			System.out.println("---------------------------------------------");
			System.out.printf("%-10s %-30s\n", "AccountID", "Holder Name");

			while (rs.next()) {
				int id = rs.getInt("account_id");
				String name = rs.getString("account_holder");
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
	
	
	public static String getAccountHolderName(Connection conn, int accountId) {
        String query = "SELECT account_holder FROM bank_account WHERE account_id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, accountId);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("account_holder");
                }
            }

        } catch (SQLException e) {
            System.out.println(" SQL Error while fetching account holder name: " + e.getMessage());
        }

        return null; 
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

	// public static void viewAllTransactions(Connection conn) throws SQLException {
	// String query = "SELECT * FROM transaction_log ORDER BY transaction_time
	// DESC";
	// try (Statement stmt = conn.createStatement(); ResultSet rs =
	// stmt.executeQuery(query)) {
	// while (rs.next()) {
	// System.out.printf("Account ID: %d, Amount: %.2f, Type: %s, Status: %s, Time:
	// %s\n",
	// rs.getInt("account_id"),
	// rs.getDouble("amount"),
	// rs.getString("type"),
	// rs.getString("status"),
	// rs.getTimestamp("transaction_time"));
	// }
	// }
	// }
}
