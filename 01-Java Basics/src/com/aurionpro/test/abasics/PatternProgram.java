package com.aurionpro.test.abasics;

import java.util.Scanner;

public class PatternProgram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length : ");
		int length = scanner.nextInt();
		System.out.println();

		for (int i = 1; i <= length; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
		}

	}

}
