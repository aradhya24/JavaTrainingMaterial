package com.aurionpro.acid.bankmgmt.dao;


import java.sql.*;

public class CustomerDao {

    public static boolean deposit(Connection conn, int accountId, double amount) throws SQLException {
        String query = "UPDATE bank_account SET balance = balance + ? WHERE account_id = ? AND status = 'ACTIVE'";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setDouble(1, amount);
            stmt.setInt(2, accountId);
            return stmt.executeUpdate() > 0;
        }
    }

    public static boolean withdraw(Connection conn, int accountId, double amount) throws SQLException {
        String checkBalance = "SELECT balance FROM bank_account WHERE account_id = ? AND status = 'ACTIVE'";
        try (PreparedStatement stmt = conn.prepareStatement(checkBalance)) {
            stmt.setInt(1, accountId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next() && rs.getDouble("balance") >= amount) {
                    String update = "UPDATE bank_account SET balance = balance - ? WHERE account_id = ?";
                    try (PreparedStatement updateStmt = conn.prepareStatement(update)) {
                        updateStmt.setDouble(1, amount);
                        updateStmt.setInt(2, accountId);
                        return updateStmt.executeUpdate() > 0;
                    }
                }
            }
        }
        return false;
    }

    public static double checkBalance(Connection conn, int accountId) throws SQLException {
        String query = "SELECT balance FROM bank_account WHERE account_id = ? AND status = 'ACTIVE'";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, accountId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("balance");
                }
            }
        }
        return -1;
    }
    
    
    

//    public static void viewMyTransactions(Connection conn, int accountId) throws SQLException {
//        String query = "SELECT * FROM transaction_log WHERE account_id = ? ORDER BY transaction_time DESC";
//        try (PreparedStatement stmt = conn.prepareStatement(query)) {
//            stmt.setInt(1, accountId);
//            try (ResultSet rs = stmt.executeQuery()) {
//                while (rs.next()) {
//                    System.out.printf("Amount: %.2f, Type: %s, Status: %s, Time: %s\n",
//                            rs.getDouble("amount"),
//                            rs.getString("type"),
//                            rs.getString("status"),
//                            rs.getTimestamp("transaction_time"));
//                }
//            }
//        }
//    }
}
