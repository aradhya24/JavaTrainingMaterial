package com.aurionpro.test.games_flowchart_based;

import java.util.Scanner;

public class TreasureIslandGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("     Welcome to Treasure Island \n Your Mission is to find the treasure.");

		System.out.println();

		System.out.println("Choose Right or Left");
		String choice = scanner.nextLine();

		if (choice.equalsIgnoreCase("left")) {

			System.out.println();

			System.out.println("Choose Swim or Wait");
			choice = scanner.nextLine();

			if (choice.equalsIgnoreCase("wait")) {

				System.out.println();
				System.out.println("Choose Door -> Red , Blue , Yellow");
				choice = scanner.nextLine();
				if (choice.equalsIgnoreCase("yellow")) {
					System.out.println("\n\n-------- You Win !-------- ");
				} else if (choice.equalsIgnoreCase("red")) {
					System.out.println("Burned by Fire \n Game Over");
				} else if (choice.equalsIgnoreCase("blue")) {
					System.out.println("Eaten by beasts \n Game Over");
				} else {
					System.out.println("Game Over.");
				}

			} else {
				System.out.println("Attacked by trout \n Game Over");
			}

		} else {
			System.out.println("Fall into a hole \n Game Over ");
		}
		scanner.close();
	}
}
