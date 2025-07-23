package com.aurionpro.test;

import java.util.Scanner;

public class CountDigtsCharacterSpecialInString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Input String : ");
		String input = scanner.nextLine();
		System.out.println();

		int letters = 0, digits = 0, specialCharacter = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 'A' && input.charAt(i) <= 'z') {
				letters++;
			} else if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				digits++;
			} else {
				specialCharacter++;
			}
		}
		System.out.println("Letters : " + letters + ", Digits : " + digits + ", Special Character : " + specialCharacter);

	}

}
