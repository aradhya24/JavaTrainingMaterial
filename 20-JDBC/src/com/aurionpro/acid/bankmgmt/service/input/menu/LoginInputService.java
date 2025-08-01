package com.aurionpro.acid.bankmgmt.service.input.menu;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.aurionpro.acid.bankmgmt.service.model.LoginService;

public class LoginInputService {

    public static void handleLoginFlow(Connection conn, Scanner sc) throws SQLException {
    	
    	int choice = -1;
        while (true) {
            System.out.println("\n=== Welcome to Bank Management System ===");
            System.out.println("Select Login Type:");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("3. Exit");

            
            System.out.print("Enter choice (1-3): ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("❌ Input cannot be empty. Please enter 1, 2, or 3.");
                continue;
            }

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Please enter a number (1-3).");
                continue;
            }

            switch (choice) {
                case 1:
                case 2: {
                    String role = (choice == 1) ? "ADMIN" : "CUSTOMER";
                    LoginService loginService = new LoginService(conn, role);
                    Object loginResult = loginService.promptLogin(sc);
                    if (loginResult != null) {
                        if (role.equals("ADMIN")) {
                            MenuService.redirectToAdminMenu(conn, sc);
                        } else {
                            MenuService.redirectToCustomerMenu(conn, (Integer) loginResult, sc);
                        }
                    } else {
                        System.out.println("⚠ Login failed. Please try again.");
                    }
                    break;
                }
                case 3:
                    System.out.println("👋 Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("❌ Invalid choice. Please select 1, 2, or 3.");
            }
        }
    }
}
