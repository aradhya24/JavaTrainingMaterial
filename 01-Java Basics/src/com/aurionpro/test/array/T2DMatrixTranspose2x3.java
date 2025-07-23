package com.aurionpro.test.array;

import java.util.Scanner;

public class T2DMatrixTranspose2x3 {

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
		
		System.out.println("Original Matrix :");
		for(int i = 0 ; i < rowSize ; i++) {
			System.out.println();
			for(int j = 0 ; j < colSize ; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
		}
		
		System.out.println("\nTranspose Matrix");
		int[][] newMatrix = new int[colSize][rowSize];
		for (int i = 0; i < colSize; i++) {
			System.out.println();
			for (int j = 0; j < rowSize; j++) {
				newMatrix[i][j] = matrix[j][i];
				System.out.print(newMatrix[i][j] + " ");
			}
		}
		
		
		

	}

}
