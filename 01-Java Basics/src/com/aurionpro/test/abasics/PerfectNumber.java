package com.aurionpro.test.abasics;

public class PerfectNumber {
	public static void main(String[] args) {
		int number = 6;
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			System.out.println("Number is Perfect Number");
		} else {
			System.out.println("Number is not Perfect Number");
		}
	}
}
