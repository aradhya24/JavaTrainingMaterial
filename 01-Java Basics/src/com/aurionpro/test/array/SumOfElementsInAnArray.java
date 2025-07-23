package com.aurionpro.test.array;

import java.util.Scanner;

public class SumOfElementsInAnArray {
	
	
	public static int sumOfElementsInAnArray() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a size of an array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		int sum = 0;
		for(int i = 0 ; i < size ; i++) {
			System.out.println("Enter a value for " + i + "th index : " );
			array[i] = scanner.nextInt();
			sum += array[i];
		}
		scanner.close();
		
		return sum;
		
	}

	public static void main(String[] args) {
		
		
		System.out.println("Sum of Elements in an array is : " + sumOfElementsInAnArray());
		

	}

}
