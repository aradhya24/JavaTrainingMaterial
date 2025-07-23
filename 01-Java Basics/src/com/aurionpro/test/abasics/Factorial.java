package com.aurionpro.test.abasics;

public class Factorial {
	public static void main(String[] args) {
		int limit = 7;
		int fact = 1;
		for (int i = 1; i <= limit; i++) {
			fact = fact * i;
			System.out.println(fact);
		}
	}
}
