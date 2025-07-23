package com.aurionpro.test.stringbuilder;

import java.util.Scanner;

public class CountOccurencesOfWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a String : ");
		StringBuilder input = new StringBuilder(scanner.nextLine());

		System.out.println("Enter a Word to Count : ");
		String word = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			
			if (input.charAt(i) == word.charAt(0)) {

				if (input.length() - i + 1 <= word.length()) {
					break;
				}
				int k = i;
				for (int j = 0; j < word.length(); j++) {

					if (input.charAt(k) != word.charAt(j)) {
						break;
					}
					k++;
					if (j == word.length() - 1) {
						count++;
					}
				}
			}
		}
		System.out.println("Occurences of Word " + word + " is : " + count);

	}
}
