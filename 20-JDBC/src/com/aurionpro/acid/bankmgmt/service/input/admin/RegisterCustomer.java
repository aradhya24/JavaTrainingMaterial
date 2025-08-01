package com.aurionpro.acid.bankmgmt.service.input.admin;

import java.sql.Connection;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.acid.bankmgmt.dao.UserDao;

public class RegisterCustomer {

    public static void promptUserRegistration(Connection connection) {
        Scanner scanner = new Scanner(System.in);
        String name = "", password = "", phone = "";
        String role = "CUSTOMER";

        System.out.println("\n=== Customer Registration ===");

        try {
            // Name
            while (true) {
                System.out.print("Enter Full Name (min 4 characters): ");
                name = scanner.nextLine().trim();
                if (name.length() >= 4 && name.matches("[a-zA-Z\\s]+")) break;
                System.out.println(" Invalid name. Use at least 4 alphabetic characters.");
            }

            // Password
            while (true) {
                System.out.print("Enter Password (min 4 characters): ");
                password = scanner.nextLine().trim();
                if (password.length() >= 4) break;
                System.out.println(" Password must be at least 4 characters.");
            }

            // Phone number
            while (true) {
                System.out.print("Enter 10-digit Phone Number: ");
                phone = scanner.nextLine().trim();
                if (phone.matches("\\d{10}")) break;
                System.out.println(" Invalid phone number. Must be exactly 10 digits.");
            }

            // Create account in bank_account and get generated accountId
            int accountId = UserDao.createBankAccount(connection, name);

            // Register user with the accountId
            UserDao.registerUser(connection, name, password, phone, role, accountId);

        } catch (Exception e) {
            System.out.println("❌ Error during registration: " + e.getMessage());
        }
    }
}
