package com.aurionpro.test;

import java.util.Arrays;
import java.util.Scanner;

public class UsernameCreationFromEmail {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Email : ");
		String input = scanner.nextLine();
		System.out.println();
		
		char[] inputArray = input.toCharArray();
		
		String result = "";

		for (int i = 0; i < input.length(); i++) {
			
			if(inputArray[i] != '@') {
				result = result + inputArray[i];
			}
			else {
				break;
			}
		}
		System.out.println("Username is : " + result);

	}

}
