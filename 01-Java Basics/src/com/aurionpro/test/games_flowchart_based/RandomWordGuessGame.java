package com.aurionpro.test.games_flowchart_based;

import java.util.Arrays;
import java.util.Scanner;

public class RandomWordGuessGame {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter only 5 letter Secret Word :");
		String word = scanner.nextLine();

		System.out.println("\n  Welcome to Random Word Guessing Game");
		String blankSpace = "_____";

		int lives = word.length();

		char[] wordArray = word.toCharArray();
		char[] blankSpaceArray = blankSpace.toCharArray();

		while (lives > 0) {
			System.out.println("\n Guess and enter a letter : ");
			String guessedLetter = scanner.nextLine();

			if (word.contains(guessedLetter)) {

				for (int i = 0; i < word.length(); i++) {
					if (String.valueOf(wordArray[i]).equalsIgnoreCase(guessedLetter)) {
						blankSpaceArray[i] = wordArray[i];
					}
				}
				blankSpace = Arrays.toString(blankSpaceArray);
				System.out.println(blankSpace);

				if (!blankSpace.contains("_")) {
					System.out.println("\n Guessed Correct word : " + blankSpace
							+ "\n\n-------!!You Win the Game!!-------\n\n    Game Over");
					break;
				}

			} else {
				System.out.println("!! You lose a 1 live , you have " + --lives + " lives left");
				System.out.println(blankSpace);
			}

		}
		if (lives < 1) {
			System.out.println("\n!! Out of Live !! \n\n    Game Over");
		}
		scanner.close();

	}
}
