package com.aurionpro.test.array;

import java.util.Scanner;

public class T2DMatrix3x3RowSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter rowsize : ");
		int rowSize = scanner.nextInt();

		System.out.println("Enter colsize : ");
		int colSize = scanner.nextInt();

		int[][] matrix = new int[rowSize][colSize];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Row Sum:");
		for (int i = 0; i < rowSize; i++) {
			int sum = 0;
			System.out.println();
			for (int j = 0; j < colSize; j++) {
				sum += matrix[i][j];
			}
			System.out.print("Sum of Row " + i + " : " + sum);
		}
		
		
		System.out.println("Column Sum :");
		for (int i = 0; i < rowSize; i++) {
			int sum = 0;
			System.out.println();
			for (int j = 0; j < colSize; j++) {
				sum += matrix[j][i];
			}
			System.out.print("Sum of Col " + i + " : " + sum);
		}
	}
}
