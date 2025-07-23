package com.aurionpro.test;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfCharacterInString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String input = scanner.nextLine().toLowerCase();
		System.out.println();
		
		char[] inputArray = input.toCharArray();
		Arrays.sort(inputArray);
		int count = 1;
		for(int i = 1 ; i < inputArray.length ; i++) {
			if(inputArray[i] != inputArray[i-1]) {
				System.out.println(inputArray[i-1] + " : " + count);
				count = 1;
			}
			else {
				count++;
			}
			if(i == inputArray.length-1) {
				System.out.println(inputArray[i] +" : "+ count);
			}
			
		}
        
	}

}
