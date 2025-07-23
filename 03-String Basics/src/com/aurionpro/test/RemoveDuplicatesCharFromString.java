package com.aurionpro.test;

import java.util.Scanner;

public class RemoveDuplicatesCharFromString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Input String : ");
		String input = scanner.nextLine().toLowerCase();
		System.out.println();
        
		for (int i = 0; i < input.length()-1; i++) {
            for(int j = i + 1; j < input.length(); j++) {
            	if(input.charAt(i) == input.charAt(j)) {
            		if(j < input.length()-1) {
            			input = input.substring(0, j) + input.substring(j+1);
            		}
            		else {
            			input = input.substring(0, j);
            		}
            	}
            }
		}

		System.out.println("After removing repeated characters in string : " + input);

	}

}
