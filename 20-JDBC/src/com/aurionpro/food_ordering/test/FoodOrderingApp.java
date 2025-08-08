package com.aurionpro.food_ordering.test;


import com.aurionpro.food_ordering.dao.AdminDao;
import com.aurionpro.food_ordering.dao.CustomerDao;
import com.aurionpro.food_ordering.dao.DeliveryPartnerDao;
import com.aurionpro.food_ordering.dao.MenuDao;
import com.aurionpro.food_ordering.dao.OrderDao;
import com.aurionpro.food_ordering.model.DeliveryPartner;
import com.aurionpro.food_ordering.model.MenuItem;
import com.aurionpro.food_ordering.model.Order;
import com.aurionpro.food_ordering.model.OrderItem;
import com.aurionpro.food_ordering.input_service.AdminInputService;
import com.aurionpro.food_ordering.input_service.InputValidator;
import com.aurionpro.food_ordering.input_service.CustomerInputService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class FoodOrderingApp {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root")) {
            AdminDao adminDao = new AdminDao(conn);
            MenuDao menuDao = new MenuDao(conn);
            OrderDao orderDao = new OrderDao(conn);
            DeliveryPartnerDao deliveryDao = new DeliveryPartnerDao(conn);
            CustomerDao customerDao = new CustomerDao();

            AdminInputService adminService = new AdminInputService(adminDao);
            CustomerInputService customerService = new CustomerInputService(menuDao, orderDao, deliveryDao, customerDao);
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n=== Food Ordering System ===");
                System.out.println("1. Admin Login");
                System.out.println("2. Customer Order");
                System.out.println("3. Exit");

                int choice = InputValidator.getValidInt("Choose option: ", 1, 3);
                switch (choice) {
                    case 1 : adminService.showAdminMenu(sc); break;
                    case 2 : customerService.showCustomerMenu(); break;
                    case 3 : 
                        System.out.println("Thank you for using the Food Ordering System!");
                        return;
                    
                }
            }
        } catch (SQLException e) {
            System.out.println("❌ Database error: " + e.getMessage());
        }
    }
}
