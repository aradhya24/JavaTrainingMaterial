package com.aurionpro.test.abasics;

public class PrePostIncrementExample {
	public static void main(String[] args) {
		System.out.println("Increment");
		int number1 = 10;
		// Pre Increment
		int number2 = ++number1;
		System.out.println("Pre Increment");
		System.out.println("Number1 is  " + number1);
		System.out.println("Number2 is  " + number2);

		int number3 = 10;
		// Post Increment
		int number4 = number3++;
		System.out.println("Pre Increment");
		System.out.println("Number3 is  " + number3);
		System.out.println("Number4 is  " + number4);
		System.out.println();System.out.println();

		System.out.println("Decrement");
		int number5 = 10;
		// Pre Decrement
		int number6 = --number5;
		System.out.println("Pre Decrement");
		System.out.println("Number5 is  " + number5);
		System.out.println("Number6 is  " + number6);

		int number7 = 10;
		// Post Decrement
		int number8 = number7--;
		System.out.println("Post Decrement");
		System.out.println("Number7 is  " + number7);
		System.out.println("Number8 is  " + number8);

	}
}
