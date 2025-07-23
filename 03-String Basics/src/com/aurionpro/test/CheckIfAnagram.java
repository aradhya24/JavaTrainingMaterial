package com.aurionpro.test;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfAnagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String 1 : ");
		String input1 = scanner.nextLine();
		System.out.println();
		System.out.print("Enter the String 2 : ");
		String input2 = scanner.nextLine();
		System.out.println();

		char[] inputArray1 = input1.toCharArray();
		char[] inputArray2 = input2.toCharArray();
		Arrays.sort(inputArray1);
		Arrays.sort(inputArray2);
		
		boolean isAnagram = true;
		
		for(int i = 0 ; i < inputArray1.length ; i++) {
			if(inputArray1[i] != inputArray2[i]) {
				System.out.println("These two strings are Not Anagram");
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram) {
			System.out.println("These two strings are Anagram");
		} 

	}

}
