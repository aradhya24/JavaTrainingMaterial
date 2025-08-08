package com.aurionpro.food_ordering.input_service;

import java.sql.SQLException;
import java.util.Scanner;

import com.aurionpro.food_ordering.dao.AdminDao;
import com.aurionpro.food_ordering.dao.MenuDao;
import com.aurionpro.food_ordering.model.MenuItem;

public class AdminInputService {
    private AdminDao adminDao;

    public AdminInputService(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    public void showAdminMenu(Scanner sc) throws SQLException {
        System.out.println("\n=== Admin Login ===");
        String username = InputValidator.getNonEmptyString("Username: ");
        String password = InputValidator.getNonEmptyString("Password: ");

        if (!adminDao.validateAdmin(username, password)) {
            System.out.println(" Invalid credentials.");
            return;
        }

        while (true) {
            System.out.println("\n=== Admin Panel ===");
            System.out.println("1. View Menu");
            System.out.println("2. Add Item");
            System.out.println("3. Update Availability");
            System.out.println("4. Exit Admin Panel");

            int choice = InputValidator.getValidInt("Enter choice: ", 1, 4);
            switch (choice) {
                case 1 : adminDao.viewMenuItems();break;
                case 2 :
                    String name = InputValidator.getNonEmptyString("Enter item name: ");
                    double price = InputValidator.getValidDouble("Enter price: ₹", 0);
                    adminDao.addMenuItem(name, price);
                    break;
                case 3 : 
                    int id = InputValidator.getValidInt("Enter item ID: ", 1, Integer.MAX_VALUE);
                    int availability = InputValidator.getValidInt("Available? (1=Yes, 0=No): ", 0, 1);
                    adminDao.updateAvailability(id, availability);
                break;
                case 4 : 
                    System.out.println("✅ Exiting Admin Panel.");
                    return;
                
            }
        }
    }
}