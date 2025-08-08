package com.aurionpro.food_ordering.input_service;

import java.util.Scanner;

public class InputValidator {
    private static final Scanner sc = new Scanner(System.in);

    public static int getValidInt(String prompt, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            try {
                value = Integer.parseInt(sc.nextLine());
                if (value >= min && value <= max) return value;
                else System.out.println("❌ Please enter a number between " + min + " and " + max);
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Please enter a number.");
            }
        }
    }

    public static double getValidDouble(String prompt, double min) {
        double value;
        while (true) {
            System.out.print(prompt);
            try {
                value = Double.parseDouble(sc.nextLine());
                if (value >= min) return value;
                else System.out.println("❌ Value must be at least " + min);
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Enter a decimal value.");
            }
        }
    }

    public static String getNonEmptyString(String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = sc.nextLine().trim();
            if (input.isEmpty()) System.out.println("❌ Input cannot be empty.");
        } while (input.isEmpty());
        return input;
    }

    public static String getValidPaymentMode() {
        while (true) {
            String input = getNonEmptyString("Enter Payment Mode (Cash/UPI): ").toLowerCase();
            if (input.equals("cash") || input.equals("upi")) return input.toUpperCase();
            System.out.println("❌ Invalid payment mode. Try again.");
        }
    }
}
