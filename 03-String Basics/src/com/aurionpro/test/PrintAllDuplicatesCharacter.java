package com.aurionpro.test;

import java.util.Scanner;

public class PrintAllDuplicatesCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Input String : ");
		String input = scanner.nextLine().toLowerCase();
		System.out.println();
        System.out.print("Duplicate Characters are : ");
		for (int i = 0; i < input.length()-1; i++) {
			boolean isDuplicateCharacter = false;
            for(int j = i + 1; j < input.length(); j++) {
            	if(input.charAt(i) == input.charAt(j)) {
            		isDuplicateCharacter = true;
            		if(j < input.length()-1) {
            			input = input.substring(0, j) + input.substring(j+1);
            		}
            		else {
            			input = input.substring(0, j);
            		}
            	}
            }
            if(isDuplicateCharacter) {
            	System.out.print(input.charAt(i) + ", ");
            }
		}

	}

}
