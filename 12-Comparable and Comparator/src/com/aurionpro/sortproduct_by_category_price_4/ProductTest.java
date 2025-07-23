package com.aurionpro.sortproduct_by_category_price_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.student_example_0.Student;

public class ProductTest {

	public static void main(String[] args) {

		ArrayList<Product> productList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		Integer choice = -1;

		while (true) {

			System.out.print("\n\nChoose option : 1 -> Add Product  |  2 -> View Product (Sorted)  |  3 -> EXIT  : ");

			while (true) {
				try {
					choice = Integer.parseInt(scanner.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("Input Mismatched , enter in Digits only ....");
					System.out.print("\n\nChoose option : 1 -> Add Product  |  2 -> View Product (Sorted)  |  3 -> EXIT  : ");
				}
			}

			switch (choice) {

			case 1:
				InputService.getProductInput(scanner, productList);
				break;

			case 2:
				Collections.sort(productList, new PriceSortComparatorAscending());
				System.out.println("After sorting : " + productList);
				break;

			case 3:
				System.out.println("System exited ....");
				return;

			default:
				System.out.println("Invalid choice.....");

			}
		}
	}

}
