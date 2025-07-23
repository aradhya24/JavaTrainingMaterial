package com.aurionpro.encapsulation.test;

import java.util.Scanner;

import com.aurionpro.encapsulation.model.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of products : ");
		int numberOfProducts = scanner.nextInt();
		Product[] product = new Product[numberOfProducts];

		for (int i = 0; i < numberOfProducts; i++) {
			scanner.nextLine();
			System.out.println("\n\nEnter Product " + (i + 1) + " product details");

			System.out.print("\nEnter product name :");
			String productName = scanner.nextLine();

			System.out.print("Enter product price : ");
			int price = scanner.nextInt();

			System.out.print("Enter product quantity : ");
			int quantity = scanner.nextInt();

//			product[i] = new Product(productName, price, quantity);
			
			product[i] = new Product();
			
			product[i].setProductName(productName);
			product[i].setQuantity(quantity);
			
			while(!product[i].setPrice(price)) {
				System.out.print("!!Price is less than 0 ,Enter product price again : ");
				price = scanner.nextInt();
			}
			product[i].setPrice(price);
			
		}
		System.out.println("\n----------------------------------------------------");
		for (Product products : product) {
        	System.out.println("Total cost : " + products.calculateTotal());
        	System.out.println("----------------------------------------------------");
		}

	}

}
