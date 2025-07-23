package com.aurionpro.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfTimesNumberRepeatedInArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a size of an array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter a value for " + i + "th index : ");
			array[i] = scanner.nextInt();
		}

		Arrays.sort(array);
		int count = 1;
		for (int i = 1; i < array.length; i++) {

			if(array[i] != array[i-1]) {
				System.out.println(array[i-1] + " : " + count);
				count = 1;
				if(i == array.length-1) {
					System.out.println(array[i] + " : " + count);
				}
			}
			else if(i == array.length-1) {
				count++;
				System.out.println(array[i] + " : " + count);
			}
			else {
				count++;
			}
			
		}
		

		scanner.close();

	}

}
