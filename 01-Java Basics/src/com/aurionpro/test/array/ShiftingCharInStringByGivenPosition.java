package com.aurionpro.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftingCharInStringByGivenPosition {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter String : " );
		String string = scanner.nextLine();
		
		System.out.println("Enter position in number want to shift :");
		int position = scanner.nextInt();
		
		char[] stringArray = string.toCharArray();
		
		for(int i = 0 ; i < stringArray.length ; i++) {
			stringArray[i] += position;
		}
		
		System.out.println("\nOutput of Incremented String is : " + Arrays.toString(stringArray));
		
		scanner.close();
	}

}
