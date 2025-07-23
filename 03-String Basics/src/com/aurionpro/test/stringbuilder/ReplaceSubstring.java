package com.aurionpro.test.stringbuilder;

import java.util.Scanner;

public class ReplaceSubstring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a String : ");
		StringBuilder input = new StringBuilder(scanner.nextLine());
		
		System.out.println("Enter a old word to be replaced : ");
		String oldWord = scanner.nextLine();
		
		System.out.println("Enter a new word to be replace : ");
		String newWord = scanner.nextLine();

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == oldWord.charAt(0)) {

				if (input.length() - i + 1 <= oldWord.length()) {
					break;
				}
				int k = i;
				for (int j = 0; j < oldWord.length(); j++) {

					if (input.charAt(k) != oldWord.charAt(j)) {
						break;
					}
					k++;
					if (j == oldWord.length() - 1) {
						k = -1;
						break;
					}
				}
				if(k == -1) {
					input.replace(i, i + oldWord.length(), newWord);
				}
				
			}
		}
		
		

		System.out.println("After Replacing New word : " + input);

	}

}
