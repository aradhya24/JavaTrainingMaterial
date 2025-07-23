package com.aurionpro.test.abasics;

public class ArmstrongNo {
	public static void main(String[] args) {
		int number = 153;
		int originalNumber = number;
		int sum = 0;
		while (number > 0) {
			int rev = number % 10;
			sum = sum + (rev * rev * rev);
			number /= 10;
		}
		if (sum == originalNumber) {
			System.out.println("Number is ArmStrong");
		} else {
			System.out.println("Number is not ArmStrong");
		}
	}
}
