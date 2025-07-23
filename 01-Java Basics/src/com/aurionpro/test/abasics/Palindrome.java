package com.aurionpro.test.abasics;

public class Palindrome {
	public static void main(String args[]) {
		int number = 132;
		int originalNumber = number;
		int reverseNumber = 0;
		while (number > 0) {
			int rev = number % 10;
			reverseNumber = 10 * reverseNumber + rev;
			number /= 10;
		}

		if (originalNumber == reverseNumber) {
			System.out.println(originalNumber + " Number is Palindrome");

		} else {
			System.out.println(originalNumber + " Number is not Palindrome");
		}
	}
}
