package com.aurionpro.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsPalindrome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a size of an array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter a value for " + i + "th index : ");
			array[i] = scanner.nextInt();
		}

		System.out.println("\nOriginal Array is : \n" + Arrays.toString(array));

		int left = 0 , right = size-1;
		while(left < right) {
			if(array[left] == array[right]) {
				left++;
				right--;
			}
			else {
				System.out.println("----------Array is Not Palindrome-----------");
				break;
			}
		}
		if(left >= right) {
			System.out.println("-----------------Array is Palindrome------------------");
		}
		
		

	}

}
