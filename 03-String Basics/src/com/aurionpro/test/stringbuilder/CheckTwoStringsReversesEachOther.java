package com.aurionpro.test.stringbuilder;

import java.util.Scanner;

public class CheckTwoStringsReversesEachOther {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a String 1 : ");
		StringBuilder input1 = new StringBuilder(scanner.nextLine());
		
		System.out.println("Enter a String 2 : ");
		StringBuilder input2 = new StringBuilder(scanner.nextLine());
		
		input2.reverse();
		if(input1.toString().equals(input2.toString())) {
			System.out.println("Yes , strings are reverses of each other");
		}else {
			System.out.println("No , strings are not reverses of each other");
		}
				
		

	}

}
