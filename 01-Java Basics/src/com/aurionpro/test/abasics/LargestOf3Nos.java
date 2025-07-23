package com.aurionpro.test.abasics;

public class LargestOf3Nos {
	public static void main(String args[]) {
		int number1 = 10, number2 = 2, number3 = 15;

		// do the code minimum by logic

		if (number1 > number2 && number1 > number3) {
			System.out.println("number1 is Greater");
		} else if (number2 > number1 && number2 > number3) {
			System.out.println("number2 is Greater");
		} else {
			System.out.println("number3 is Greater");
		}

	}
}
