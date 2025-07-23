package com.aurionpro.test.abasics;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 36;
		int count = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				count++;
				if (count > 0) {
					System.out.println("Number is Not Prime");
					break;
				}
			}
		}
		if (count == 0) {
			System.out.println("Number is Prime");
		}
	}
}
