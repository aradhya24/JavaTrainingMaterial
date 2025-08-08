package com.aurionpro.food_ordering.input_service;

import com.aurionpro.food_ordering.model.Order;
import com.aurionpro.food_ordering.model.OrderItem;
import com.aurionpro.food_ordering.dao.CustomerDao;
import com.aurionpro.food_ordering.dao.DeliveryPartnerDao;
import com.aurionpro.food_ordering.dao.MenuDao;
import com.aurionpro.food_ordering.dao.OrderDao;
import com.aurionpro.food_ordering.model.*;

import java.sql.SQLException;
import java.util.*;

public class CustomerInputService {
    private MenuDao menuDao;
    private OrderDao orderDao;
    private DeliveryPartnerDao deliveryDao;
    private CustomerDao customerDao;

    public CustomerInputService(MenuDao menuDao, OrderDao orderDao, DeliveryPartnerDao deliveryDao, CustomerDao customerDao) {
        this.menuDao = menuDao;
        this.orderDao = orderDao;
        this.deliveryDao = deliveryDao;
        this.customerDao = customerDao;
    }

    public void showCustomerMenu() throws SQLException {
        System.out.println("\n=== Welcome Customer ===");
        String name = InputValidator.getNonEmptyString("Enter your name: ");
        String contact = InputValidator.getNonEmptyString("Enter contact number: ");
        Customer customer = customerDao.insertCustomer(name, contact);
        if (customer == null) {
            System.out.println("Could not register customer.");
            return;
        }

        List<MenuItem> menuItems = menuDao.getAllAvailableItems();
        if (menuItems.isEmpty()) {
            System.out.println(" No available items to order.");
            return;
        }

        List<OrderItem> orderItems = new ArrayList<>();
        System.out.println("\n--- Available Menu ---");
        for (MenuItem item : menuItems) {
            System.out.println("ID: " + item.getItemId() + ", " + item.getItemName() + " - ₹" + item.getPrice());
        }

        while (true) {
            int itemId = InputValidator.getValidInt("Enter item ID to order (0 to finish): ", 0, Integer.MAX_VALUE);
            if (itemId == 0) break;
            MenuItem item = menuDao.getItemById(itemId);
            if (item == null) {
                System.out.println(" Invalid or unavailable item.");
                continue;
            }
            int quantity = InputValidator.getValidInt("Enter quantity: ", 1, 100);
            orderItems.add(new OrderItem(item, quantity));
        }

        if (orderItems.isEmpty()) {
            System.out.println(" No items selected. Order cancelled.");
            return;
        }

        String paymentMode = InputValidator.getValidPaymentMode();
        DeliveryPartner partner = deliveryDao.getRandomAvailablePartner();
        if (partner == null) {
            System.out.println(" No delivery partner available.");
            return;
        }

        Order order = orderDao.placeOrder(customer, orderItems, paymentMode, partner);
        order.printInvoice();
    }
}