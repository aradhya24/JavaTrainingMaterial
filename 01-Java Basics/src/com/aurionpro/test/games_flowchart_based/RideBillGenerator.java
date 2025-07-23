package com.aurionpro.test.games_flowchart_based;

import java.util.Scanner;


public class RideBillGenerator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int bill = 0;
		System.out.println("Enter Your Height : ");
		int height = scanner.nextInt();
		if (height <= 120) {
			System.out.println("Sorry !!! You Can't Ride");
		} else {
			System.out.println("Enter your Age : ");
			int age = scanner.nextInt();

			if (age < 12) {
				bill += 5;
			} else if (age < 18 && age >= 12) {
				bill += 7;
			} else if (age > 18) {
				if (age > 45) {
					bill += 0;
				} else {
					bill += 12;
				}
			}

			System.out.println("Enter 1 if want photos and 0 if don't ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				bill += 3;
				System.out.println("$3 will be added to your bill of photos");
				break;
			case 0:
				bill += 0;
				System.out.println("!!No photos bill added");
				break;
			default:
				System.out.println("Enter Wrong Choice");
			}

		}

		System.out.println("Your Total bill is $" + bill);
		scanner.close();
	}
}
