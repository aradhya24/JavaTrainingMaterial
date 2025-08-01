package com.aurionpro.acid.bankmgmt.service.input.menu;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.acid.bankmgmt.dao.AccountDao;
import com.aurionpro.acid.bankmgmt.dao.CustomerDao;
import com.aurionpro.acid.bankmgmt.service.input.customer.ResetPassword;
import com.aurionpro.acid.bankmgmt.service.transactionlogs.TransactionLogger;
import com.aurionpro.acid.bankmgmt.service.transactionlogs.TransactionRecord;


public class CustomerMenuService {

    public static void showCustomerMenu(Connection conn, int accountId, Scanner sc) throws SQLException {

        while (true) {
            System.out.println("\n=== Customer Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Transfer Funds");
            System.out.println("5. View Transaction History");
            System.out.println("6. Update Password");
            System.out.println("7. Logout");

            int choice = 0;

            try {
                System.out.print("Enter choice (1-7): ");
                choice = sc.nextInt();
                sc.nextLine(); // clear buffer
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                sc.nextLine(); // clear buffer
                continue;
            }

            switch (choice) {
                case 1:
                    InputService.handleDepositCustomer(conn, accountId);
                    break;
                case 2:
                    InputService.handleWithdrawCustomer(conn, accountId);
                    break;
                case 3:
                    InputService.handleViewBalanceCustomer(conn, accountId);
                    break;
                case 4:
                    InputService.handleFundTransferCustomer(conn, accountId);
                    break;
                case 5:
                    TransactionLogger.showHistoryByAccount(accountId);
                    break;
                case 6:
                	ResetPassword.resetPasswordFlow(conn, accountId);
                    break;
                case 7:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
