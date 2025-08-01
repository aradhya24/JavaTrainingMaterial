package com.aurionpro.acid.bankmgmt.service.input.menu;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.acid.bankmgmt.dao.AdminDao;
import com.aurionpro.acid.bankmgmt.service.input.admin.RegisterCustomer;
import com.aurionpro.acid.bankmgmt.service.input.admin.UpdateKycInputService;


public class AdminMenuService {

    public static void showAdminMenu(Connection conn, Scanner sc) throws SQLException {

        while (true) {
            System.out.println("\n=== Admin Menu ===");
            System.out.println("1. Add Account");
            System.out.println("2. Deactivate Account");
            System.out.println("3. Freeze Account");
            System.out.println("4. Update KYC");
            System.out.println("5. View All Transactions");
            System.out.println("6. Deposit to Customer Account");
            System.out.println("7. Withdraw from Customer Account");
            System.out.println("8. Logout");

            int choice = 0;

            try {
                System.out.print("Enter choice (1-8): ");
                choice = sc.nextInt();
                sc.nextLine(); // clear newline
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a number between 1 and 8.");
                sc.nextLine(); // clear buffer
                continue;
            }

            switch (choice) {
                case 1:
                    RegisterCustomer.promptUserRegistration(conn);
                    break;
                case 2:
                    AdminDao.deactivateAccount(conn, InputService.getValidAccountId(conn));
                    break;
                case 3:
                    System.out.println("Freeze Account - coming soon");
                    break;
                case 4:
                    UpdateKycInputService.promptKycUpdate(conn);
                    break;
                case 5:
                    AdminDao.viewAllAccountHolders(conn);
                    break;
                case 6:
                	InputService.handleDeposit(conn);
                    break;
                case 7:
                	InputService.handleWithdraw(conn);
                    break;
                case 8:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
