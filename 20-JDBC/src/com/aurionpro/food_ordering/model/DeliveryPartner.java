package com.aurionpro.food_ordering.model;

public class DeliveryPartner {
    private int partnerId;
    private String name;
    private String contact;

    public DeliveryPartner(int partnerId, String name, String contact) {
        this.partnerId = partnerId;
        this.name = name;
        this.contact = contact;
    }

    public int getPartnerId() { return partnerId; }
    public String getName() { return name; }
    public String getContact() { return contact; }
}
