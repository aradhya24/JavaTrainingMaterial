package com.aurionpro.acid.bankmgmt.service.model;

import java.sql.Connection;
import java.util.Scanner;

import com.aurionpro.acid.bankmgmt.dao.UserDao;

public class LoginService {

    private Connection conn;
    private String role;

    public LoginService(Connection conn, String role) {
        this.conn = conn;
        this.role = role;
    }

    public Object promptLogin(Scanner sc) {
        String username = "";
        while (username.isEmpty()) {
            System.out.print("Enter Username: ");
            username = sc.nextLine().trim();
            if (username.isEmpty()) {
                System.out.println("❌ Username cannot be empty.");
            }
        }


        String password;
        while (true) {
            System.out.print("Enter Password: ");
            password = sc.nextLine().trim();
            if (!password.isEmpty())
                break;
            System.out.println("❌ Password cannot be empty.");
        }

        try {
            String dbRole = UserDao.getRoleByUsername(conn, username);
            if (dbRole == null || !dbRole.equalsIgnoreCase(role)) {
                System.out.println("❌ Role mismatch. Expected: " + role + ", Found: " + dbRole);
                return null;
            }

            boolean isValid = UserDao.validateCredentials(conn, username, password);
            if (!isValid) {
                System.out.println("❌ Invalid username or password.");
                System.out.print("Forgot password? (yes/no): ");
                String choice = sc.nextLine().trim();
                if (choice.equalsIgnoreCase("yes")) {
                    handleForgotPassword(sc, username);
                }
                return null;
            }

            System.out.println("✅ Login successful as " + role);

            if (role.equalsIgnoreCase("ADMIN")) {
                return username; // Admin doesn't need accountId
            }

            Integer accountId = UserDao.getAccountIdByUsername(conn, username);
            if (accountId != null) {
                return accountId;
            } else {
                System.out.println("❌ Account ID not found for this customer.");
                return null;
            }

        } catch (Exception e) {
            System.out.println("❌ Error during login: " + e.getMessage());
            return null;
        }
    }

    private void handleForgotPassword(Scanner sc, String username) {
        try {
            System.out.print("Enter Registered Phone Number: ");
            String phone = sc.nextLine().trim();

            if (!phone.matches("\\d{10}")) {
                System.out.println("❌ Invalid phone number. Must be 10 digits.");
                return;
            }

            System.out.print("Enter New Password: ");
            String newPass = sc.nextLine().trim();

            if (newPass.isEmpty()) {
                System.out.println("❌ Password cannot be empty.");
                return;
            }

            boolean reset = UserDao.resetPassword(conn, username, phone, newPass);
            if (reset) {
                System.out.println("🔁 Password reset successful. Please login again.");
            } else {
                System.out.println("❌ Reset failed. Check your username or phone number.");
            }
        } catch (Exception e) {
            System.out.println("❌ Error during password reset: " + e.getMessage());
        }
    }
}
