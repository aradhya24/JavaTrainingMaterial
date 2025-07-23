package com.aurionpro.test.abasics;

public class ReverseNumber {
	public static void main(String[] args) {
		int number = 134;
		int reverseNumber = 0;
		while (number > 0) {
			int rev = number % 10;
			reverseNumber = 10 * reverseNumber + rev;
			number /= 10;
		}
		System.out.println("Reverse Number = " + reverseNumber);
	}
}
