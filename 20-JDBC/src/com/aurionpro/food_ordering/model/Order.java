package com.aurionpro.food_ordering.model;

import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<OrderItem> items;
    private double totalAmount;
    private double discount;
    private double finalAmount;
    private String paymentMode;
    private DeliveryPartner partner;

    public Order(int orderId, Customer customer, List<OrderItem> items, double totalAmount,
                 double discount, double finalAmount, String paymentMode, DeliveryPartner partner) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        this.totalAmount = totalAmount;
        this.discount = discount;
        this.finalAmount = finalAmount;
        this.paymentMode = paymentMode;
        this.partner = partner;
    }

    public void printInvoice() {
        System.out.println("\n===== INVOICE =====");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("\nItems:");
        for (OrderItem item : items) {
            System.out.println("- " + item.getItem().getItemName() + " x " + item.getQuantity()
                    + " = ₹" + item.getSubtotal());
        }
        System.out.println("Total: ₹" + totalAmount);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
        System.out.println("Payment Mode: " + paymentMode);
        System.out.println("Delivery Partner: " + partner.getName());
        System.out.println("====================\n");
    }
}
