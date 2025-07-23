package com.aurionpro.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class EvenLeftOddRight {
    
	public static void swap(int[] array , int left , int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a size of an array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for(int i = 0 ; i < size ; i++) {
			System.out.println("Enter a value for " + i + "th index : " );
			array[i] = scanner.nextInt();
		} 
		
		int left = 0 , right = size-1;
		System.out.println("\nOriginal Array is : \n" + Arrays.toString(array));
		while(left < right) {
			if(array[left] % 2 != 0) {
				if(array[right] % 2 == 0) {
					swap(array , left , right);
				}
				else {
					right--;
				}
			}
			else {
				left++;
			}
		}
		
		System.out.println("\nAfter Even Odd seperation Array is : \n" + Arrays.toString(array));

	}

}
