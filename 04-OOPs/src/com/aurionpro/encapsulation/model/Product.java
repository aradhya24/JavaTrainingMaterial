package com.aurionpro.encapsulation.model;

public class Product {

	String productName;
	int price;
	int quantity;
	
	

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public boolean setPrice(int price) {
		if(price > 0) {
			this.price = price;
			return true;
		}
		return false;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

//	public Product(String productName, int price , int quantity) {
//		this.productName = productName;
//		this.price = price;
//		this.quantity = quantity;
//	}
    
	public int calculateTotal() {
		System.out.println("Product name : " + productName + ", Quantity : " +quantity+ ", Price : " + price );
		return price * quantity;
	}
	
}
