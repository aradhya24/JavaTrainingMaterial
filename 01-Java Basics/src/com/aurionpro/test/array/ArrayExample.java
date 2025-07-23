package com.aurionpro.test.array;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a size of an array : ");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		
		for(int i = 0 ; i < size ; i++) {
			System.out.println("Enter a value for " + i + "th index : " );
			array[i] = scanner.nextInt();
		}
		
		System.out.println();
		for(int result : array) {
			System.out.println(result);
		}
		scanner.close();
	}

}
