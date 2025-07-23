package com.aurionpro.test.games_flowchart_based;

import java.util.Scanner;

public class CurrencyDenomination {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Currently Available Dominations are \n  2000 , 500 , 200 , 100");
		System.out.println("\nEnter Withdrawal amount : ");
		int input = scanner.nextInt();
		if (input > 50000) {
			System.out.println("\n Amount Exceeds limit of 50000");
		}
		if (input % 100 != 0) {
			System.out.println("\n Amount Should be in multiples of 100");
		} else {
			if (input / 2000 > 0) {
				System.out.println("Two Thousand : " + (input / 2000));
				input %= 2000;
			}
			if (input / 500 > 0) {
				System.out.println("Five Hundred : " + (input / 500));
				input %= 500;
			}
			if (input / 200 > 0) {
				System.out.println("Two Hundred : " + (input / 200));
				input %= 200;
			}
			if (input / 100 > 0) {
				System.out.println("One Hundred : " + (input / 100));
				input %= 100;
			}

		}
		scanner.close();

	}

}
