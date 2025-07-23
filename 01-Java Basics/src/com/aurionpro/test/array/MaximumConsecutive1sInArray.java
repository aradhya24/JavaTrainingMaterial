package com.aurionpro.test.array;

import java.util.Scanner;

public class MaximumConsecutive1sInArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a size of an array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter a value for " + i + "th index : ");
			array[i] = scanner.nextInt();
		}
		
		int count = 0 ;
		int maxCount = 0;
		for(int i = 0 ; i < array.length ; i++) {
			
			if(array[i] == 0) {
				count = 0;
			}
			else {
				count++;
			}
			if(maxCount < count) {
				maxCount = count;
			}
		}
		System.out.println("Maximum Concecutive 1s in an array : " + maxCount);

	}

}
 