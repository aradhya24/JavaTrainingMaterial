package com.aurionpro.acid.bankmgmt.service.transactionlogs;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TransactionRecord implements Serializable {
    private int senderId;
    private int receiverId;
    private double amount;
    private String status;
    private String type; // NEW: DEPOSIT, WITHDRAW, TRANSFER
    private LocalDateTime timestamp;

    public TransactionRecord(int senderId, int receiverId, double amount, String status, String type) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.amount = amount;
        this.status = status;
        this.type = type;
        this.timestamp = LocalDateTime.now();
    }

    public int getSenderId() { return senderId; }
    public int getReceiverId() { return receiverId; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }
    public String getType() { return type; }
    public LocalDateTime getTimestamp() { return timestamp; }

    @Override
    public String toString() {
        String base = "🕒 " + timestamp + " | ₹" + amount + " | Type: " + type + " | Status: " + status;
        switch (type) {
            case "TRANSFER":
                base += " | From: " + senderId + " → To: " + receiverId;
                break;
            case "DEPOSIT":
                base += " | Account: " + receiverId;
                break;
            case "WITHDRAW":
                base += " | Account: " + senderId;
                break;
        }
        return base;
    }
}
