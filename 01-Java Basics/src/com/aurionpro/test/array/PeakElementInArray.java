package com.aurionpro.test.array;

import java.util.Scanner;

public class PeakElementInArray {
    public static void main(String[] args) {
		
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter a size of an array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter a value for " + i + "th index : ");
			array[i] = scanner.nextInt();
		}
		
		
		System.out.println("\nPeaked Elements are : ");
		for(int i = 0 ; i < array.length ; i++) {
			if(i == 0 && array[0] > array[1]) {
				System.out.println(array[i]);
			}
			else if(i == size-1 && array[size-1] > array[size-2]) {
				System.out.println(array[i]);
			}
			else {
				if(array[i-1] < array[i] && array[i+1] < array[i]) {
					System.out.println(array[i]);
				}
			}
		}
		scanner.close();
	}
}
