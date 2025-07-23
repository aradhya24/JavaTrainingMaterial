package com.aurionpro.game_character_attack;

import java.util.Scanner;

public class GameCharacterAttackTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Warrior warrior = new Warrior("Bhishma", 100);
		Archer archer = new Archer("Arjun", 100);

		int choice = 0;
		while (true) {
			System.out.print("\n\nSelect attacker Type : 1 -> Warrior | 2 -> Archer | 3 -> Exit : ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				if (warrior.isPowerRemaining()) {
					warrior.attack();
					warrior.printPowerLevel();
				}
				break;

			case 2:
				if (archer.isPowerRemaining()) {
					archer.attack();
					archer.printPowerLevel();
				}

				break;
			case 3:
				System.out.println("\nSystem exited ........");
				return;

			default:
				System.out.println("\n!!Entered wrong choice , enter Again ....");

			}

		}

	}

}
