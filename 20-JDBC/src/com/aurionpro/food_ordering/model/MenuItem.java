package com.aurionpro.food_ordering.model;

public class MenuItem {
    private int itemId;
    private String itemName;
    private double price;
    private boolean available;

    public MenuItem(int itemId, String itemName, double price, boolean available) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.available = available;
    }

    public int getItemId() { return itemId; }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return available; }
}