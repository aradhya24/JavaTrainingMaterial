package com.aurionpro.test.stringbuilder;

import java.util.Scanner;

public class RemoveAllSpaces {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		StringBuilder input = new StringBuilder(scanner.nextLine());
		
		System.out.println("Before Removing Space : " + input);
		
		for(int i = 0 ; i < input.length(); i++) {
			if(input.charAt(i) == ' ') {
				input.deleteCharAt(i);
			}
		}
		
		System.out.println("Before Removing Space : " + input);

	}

}
