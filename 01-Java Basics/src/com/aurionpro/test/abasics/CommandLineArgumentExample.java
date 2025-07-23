package com.aurionpro.test.abasics;

public class CommandLineArgumentExample {

	public static void main(String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		System.out.println("Addition of two number are " + (number1 + number2));
		System.out.println("My name is " + args[2]);
	}

}
