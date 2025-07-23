package com.aurionpro.test;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String input = scanner.nextLine();
		System.out.println();
		char[] inputArray = input.toCharArray();
		
		for(int i = 0 ; i < input.length()/2 ; i++) {
			char temp = inputArray[i];
			inputArray[i] = inputArray[inputArray.length-1-i];
			inputArray[inputArray.length-1-i] = temp;
		}
        System.out.println("Reversed String is : " + Arrays.toString(inputArray));
	}

}
