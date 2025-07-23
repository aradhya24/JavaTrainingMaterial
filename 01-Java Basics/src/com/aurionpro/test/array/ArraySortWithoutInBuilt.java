package com.aurionpro.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortWithoutInBuilt {

	public static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

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

		for (int i = 0; i < size; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = i; j < size; j++) {
				if (array[j] < min) {
					swap(array, i, j);
					min = array[i];
				}
			}
		}

		System.out.println("Sorted Array : \n" + Arrays.toString(array));

	}

}
