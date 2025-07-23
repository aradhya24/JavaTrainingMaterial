package com.aurionpro.test.abasics;

public class SumOfDigitOfNumber {
	public static void main(String[] args) {
		int number = 132;
		int sum = 0;
		while (number > 0) {
			int rev = number % 10;
			sum = sum + rev;
			number /= 10;
		}
		System.out.println("Sum of a number  is = " + sum);
	}
}
