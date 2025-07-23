package com.aurionpro.test.abasics;

public class SwapTwoNoWithout3rdDigit {
	public static void main(String[] args) {
		int number1 = 10, number2 = 5;
		System.out.println("Number1 = " + number1 + " Number2 = " + number2);

		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("After swapping ");
		System.out.println("Number1 = " + number1 + " Number2 = " + number2);
	}
}
