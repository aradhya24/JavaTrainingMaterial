package com.aurionpro.test.abasics;

public class PrintOdd1to100 {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.println(" " + i);
			}
		}
	}
}
