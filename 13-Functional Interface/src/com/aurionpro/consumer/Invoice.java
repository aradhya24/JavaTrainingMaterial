package com.aurionpro.consumer;

public class Invoice {
	String itemName;
	Integer quantity;
	Double price;
	
	
	public Invoice(String itemName, Integer quantity, Double price) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}


	@Override
	public String toString() {
		return "ItemName : " + itemName + ", Quantity : " + quantity + ", Price : " + price ;
	}
    
	
	
}
