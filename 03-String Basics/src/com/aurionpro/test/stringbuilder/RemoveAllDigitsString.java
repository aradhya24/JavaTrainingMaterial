package com.aurionpro.test.stringbuilder;

import java.util.Scanner;

public class RemoveAllDigitsString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a String : ");
		StringBuilder input = new StringBuilder(scanner.nextLine());

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9' ) {
				input.deleteCharAt(i);
				i--;
			}
		}

		System.out.println("After Removing digit : " + input);

	}

}
