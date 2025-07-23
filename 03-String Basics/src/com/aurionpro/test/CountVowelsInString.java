package com.aurionpro.test;

import java.util.Scanner;

public class CountVowelsInString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String input = scanner.nextLine();
		System.out.println();
		char[] inputArray = input.toLowerCase().toCharArray();
		int count = 0; 
		for(int i = 0 ; i < input.length() ; i++) {
			if(inputArray[i] == 'a' || inputArray[i] == 'e' || inputArray[i] == 'i' || inputArray[i] == 'o' || inputArray[i] == 'u') {
				count++;
			}
		}
		
		System.out.print("Number of Vowels in String : " + count);

	}

}
