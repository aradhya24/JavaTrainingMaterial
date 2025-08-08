package com.aurionpro.food_ordering.model;

public class OrderItem {
    private MenuItem item;
    private int quantity;
    private double subtotal;

    public OrderItem(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        this.subtotal = item.getPrice() * quantity;
    }

    public MenuItem getItem() { return item; }
    public int getQuantity() { return quantity; }
    public double getSubtotal() { return subtotal; }
}
