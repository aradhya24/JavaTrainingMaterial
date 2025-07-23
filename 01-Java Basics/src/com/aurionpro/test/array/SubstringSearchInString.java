package com.aurionpro.test.array;

import java.util.Scanner;

public class SubstringSearchInString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a String : ");
		String string = scanner.nextLine();

		System.out.println("Enter a Substring to find : ");
		String subString = scanner.nextLine();

		char[] stringArray = string.toCharArray();
		char[] subStringArray = subString.toCharArray();
		boolean isSubstringAvail = true;

		for (int i = 0; i < string.length(); i++) {
			if (stringArray[i] == subStringArray[0] && stringArray.length - i >= subStringArray.length - i) {
				for (int j = i; j < subStringArray.length; j++) {
					if (stringArray[j] != subStringArray[j]) {
						isSubstringAvail = false;
						break;
					}
				}
				if (isSubstringAvail) {
					System.out.println("Substring is available at position : " + i);
					break;
				}
			}
		}
		System.out.println("Substring is Not Available in String");
		scanner.close();
	}
}
