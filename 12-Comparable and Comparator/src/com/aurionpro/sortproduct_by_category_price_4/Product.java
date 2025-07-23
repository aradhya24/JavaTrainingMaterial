package com.aurionpro.sortproduct_by_category_price_4;

public class Product {
    
	protected String category;
	protected String name;
	protected Double price;
	
	public Product(String category, String name, Double price) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nCategory : " + category + ", Name : " + name + ", Price : " + price ;
	}
	
	
	
	
}
