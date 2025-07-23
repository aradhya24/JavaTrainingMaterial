package com.aurionpro.test.abasics;

import java.util.Scanner;

public class Calculator {
	
	public static int addition(int number1 , int number2) {
		return number1 + number2;
	}
	public static int subtraction(int number1 , int number2) {
		return number1 - number2;
	}
	public static int multiplication(int number1 , int number2) {
		return number1 * number2;
	}
	public static int division(int number1 , int number2) {
		return number1 / number2;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number1 : ");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter Number2 : ");
		int number2 = scanner.nextInt();
		
		
		System.out.println("\nWhat operation you want to perform \nEnter the choice\n1.Addtion  2.Subtraction  3.Multiplication  4.Division");
		int choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Addition = " + addition(number1,number2));
			break;

		case 2:
			System.out.println("Subtraction = " + subtraction(number1,number2));
			break;

		case 3:
			System.out.println("Multiplication = " + multiplication(number1,number2));
			break;

		case 4:
			System.out.println("Division = " + division(number1,number2));
			break;

		default:
			System.out.println("Wrong Choice");

		}
		scanner.close();
	}
}
