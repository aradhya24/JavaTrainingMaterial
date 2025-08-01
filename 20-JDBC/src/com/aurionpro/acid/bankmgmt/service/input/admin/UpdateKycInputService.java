package com.aurionpro.acid.bankmgmt.service.input.admin;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.aurionpro.acid.bankmgmt.dao.AdminDao;
import com.aurionpro.acid.bankmgmt.service.input.menu.InputService;

public class UpdateKycInputService {

    private static final Scanner scanner = new Scanner(System.in);

    public static void promptKycUpdate(Connection conn) {
        System.out.println("\n===  KYC Update - Account Holder Name ===");

        try {
            int accountId = InputService.getValidAccountId(conn);

            String currentName = AdminDao.getAccountHolderName(conn, accountId);
            if (currentName == null) {
                System.out.println(" No account found with ID: " + accountId);
                return;
            }
            System.out.println("Current Name: " + currentName);

            String newName;
            while (true) {
                System.out.print("Enter New Name (min 4 characters): ");
                newName = scanner.nextLine().trim();
                if (newName.length() >= 4 && newName.matches("[a-zA-Z\\s]+")) break;
                System.out.println(" Invalid name. Try again.");
            }

            AdminDao.updateAccountHolder(conn, accountId, newName);

        } catch (SQLException e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }
}
