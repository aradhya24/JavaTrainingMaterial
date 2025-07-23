package com.aurionpro.test.array;

import java.util.Scanner;

public class SecondMostMaximumInArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a size of an array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < size ; i++) {
			System.out.println("Enter a value for " + i + "th index : " );
			array[i] = scanner.nextInt();
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		int secondMax = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < size ; i++) {
			if(array[i] < max && array[i] > secondMax ) {
				secondMax = array[i];
				if(secondMax == Integer.MIN_VALUE && i == size-1) {
					System.out.println("There is no Second MaxValue in array");
				}
			}
		}
		
		System.out.println("Maximum Value in an array is : " + secondMax);
		scanner.close();

	}

}
