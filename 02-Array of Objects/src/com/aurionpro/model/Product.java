package com.aurionpro.model;

public class Product {
	String productName;
	int price;

	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}

	public void productPriceLessthan1000() {
		if (price < 1000) {
			System.out.println("Product name : " + productName + "\nPrice : " + price);
			System.out.println("----------------------------------------------------");
		}
	}
}
