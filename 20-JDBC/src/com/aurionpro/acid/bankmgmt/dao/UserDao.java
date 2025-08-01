package com.aurionpro.acid.bankmgmt.dao;


import java.sql.*;

public class UserDao {

	public static String generateUsername(String name, String phone) {
	    String prefix = name.length() >= 4 ? name.substring(0, 4).toLowerCase() : name.toLowerCase();
	    String suffix = phone.length() >= 4 ? phone.substring(phone.length() - 4) : phone;
	    return prefix + suffix;
	}


    public static void registerUser(Connection connection, String name, String password, String phone, String role, int accountId) {
        String username = generateUsername(name, phone);
        String query = "INSERT INTO users (username, password, phone_number, role, account_id) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, phone);
            stmt.setString(4, role);
            stmt.setInt(5, accountId);

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println(" Registration successful. Your username is: " + username);
            } else {
                System.out.println(" Registration failed. Please try again.");
            }

        } catch (SQLException e) {
            System.out.println(" SQL Error during registration: " + e.getMessage());
        }
    }

    
    
    public static int createBankAccount(Connection connection, String accountHolderName) {
        String insertQuery = "INSERT INTO bank_account (account_name, balance, status) VALUES (?, ?, ?)";
        int generatedId = -1;

        try (PreparedStatement stmt = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, accountHolderName);
            stmt.setDouble(2, 0.0); // default balance
            stmt.setString(3, "ACTIVE");

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        generatedId = rs.getInt(1);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(" SQL Error in createBankAccount: " + e.getMessage());
        }

        return generatedId;
    }






    public static String login(Connection connection, String username, String password) throws SQLException {
        String query = "SELECT role FROM users WHERE username = ? AND password = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("role");
                }
            }
        }
        return null;
    }
    
    
    public static boolean verifyUserPhone(Connection connection, String accountId, String phone) {
        String query = "SELECT accountId FROM users WHERE  phone_number = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, phone);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println(" Phone Number Matched...");
                    return true;
                } else {
                    System.out.println(" phone number do not match any user.");
                    return false;
                }
            }
        } catch (SQLException e) {
            System.out.println(" Error verifying user: " + e.getMessage());
            return false;
        }
    }

    
    public static boolean verifyUserPassword(Connection connection, int accountId, String password) {
        String query = "SELECT password FROM users WHERE account_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, accountId); // use int if accountId is numeric
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String storedPassword = rs.getString("password");
                    if (storedPassword.equals(password)) {
                        System.out.println(" Password verified successfully.");
                        return true;
                    } else {
                        System.out.println(" Incorrect password.");
                        return false;
                    }
                } else {
                    System.out.println(" No user found with account ID: " + accountId);
                    return false;
                }
            }
        } catch (SQLException e) {
            System.out.println(" Error verifying password: " + e.getMessage());
            return false;
        }
    }

    
    public static void updatePassword(Connection connection, int accountId, String newPassword) {
        String query = "UPDATE users SET password = ? WHERE accountId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, newPassword);
            stmt.setInt(2, accountId);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println(" Password reset successfully for Account ID: " + accountId);
            } else {
                System.out.println(" No user found with Account ID: " + accountId);
            }
        } catch (SQLException e) {
            System.out.println(" Error updating password: " + e.getMessage());
        }
    }

    
    
    
    public static Integer getAccountIdIfCredentialsValid(Connection conn, String username, String password) {
        String query = "SELECT account_id FROM users WHERE username = ? AND password = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("account_id");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error checking credentials: " + e.getMessage());
        }
        return null;
    }
    
    
    public static boolean validateCredentials(Connection conn, String username, String password) {
        String query = "SELECT 1 FROM users WHERE username = ? AND password = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next(); // valid if found
            }
        } catch (SQLException e) {
            System.out.println("Error validating credentials: " + e.getMessage());
        }
        return false;
    }
    
    public static Integer getAccountIdByUsername(Connection conn, String username) {
        String query = "SELECT account_id FROM bank_account b JOIN users u ON b.user_id = u.user_id WHERE u.username = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("account_id");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error getting account ID: " + e.getMessage());
        }
        return null;
    }




    public static String getRoleByUsername(Connection connection, String username) {
        String query = "SELECT role FROM users WHERE username = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("role");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving role: " + e.getMessage());
        }
        return null;
    }

    

    public static boolean resetPassword(Connection connection, String username, String phone, String newPassword) throws SQLException {
        String query = "UPDATE users SET password = ? WHERE username = ? AND phone_number = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, newPassword);
            stmt.setString(2, username);
            stmt.setString(3, phone);
            return stmt.executeUpdate() > 0;
        }
    }
}
