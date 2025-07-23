package com.aurionpro.test;

import java.util.Scanner;

public class ReplaceSpacesWithHyphen {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String input = scanner.nextLine();
		System.out.println();

		String replacedString = "";

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				replacedString += '-';
			} else {
                replacedString += input.charAt(i);
			}
		}
		
		System.out.print("After Replacing Spaces With hypen : " + replacedString);

	}

}
