package com.aurionpro.test.abasics;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Number 1");
		int number1 = scanner.nextInt();

		System.out.println("Enter Number 2");
		int number2 = scanner.nextInt();

		scanner.nextLine();
		System.out.println("Enter Your Name ");
//		full line
//		String name = scanner.nextLine();

//      Only 1st Word		
//		String name = scanner.next();
		
//		1 character only	
		char ch = scanner.next().charAt(0);

		System.out.println("Addition is " + (number1 + number2));
		System.out.println("Your Name is " + ch);
		
		scanner.close();

	}
}
