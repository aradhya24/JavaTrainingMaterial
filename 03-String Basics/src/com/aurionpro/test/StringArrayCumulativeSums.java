package com.aurionpro.test;

import java.util.Scanner;

public class StringArrayCumulativeSums {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of strings : ");
		int size = scanner.nextInt();
		scanner.nextLine();
		int[] array = new int[size];
		int sum = 0;
		for(int i = 0 ; i < size ; i++) {
			System.out.println("Enter the String " + (i+1) + " : ");
			String str = scanner.nextLine();
			sum += str.length();
		}
		System.out.print("\n\nSum of All String in Cumulative : " + sum);
	}

}
