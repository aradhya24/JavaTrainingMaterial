package com.aurionpro.acid.bankmgmt.service.transactionlogs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionLogger {
    private static final String FILE_NAME = "transactions.ser";

    public static void logTransaction(TransactionRecord record) {
        List<TransactionRecord> records = readTransactions();
        records.add(record);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(records);
        } catch (IOException e) {
            System.err.println("❌ Failed to log transaction: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<TransactionRecord> readTransactions() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<TransactionRecord>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    public static void showHistoryByAccount(int accountId) {
        List<TransactionRecord> all = readTransactions();
        boolean found = false;
        for (TransactionRecord record : all) {
            if (record.getSenderId() == accountId || record.getReceiverId() == accountId) {
                System.out.println(record);
                found = true;
            }
        }
        if (!found) {
            System.out.println("⚠️ No transactions found for Account ID: " + accountId);
        }
    }
}
