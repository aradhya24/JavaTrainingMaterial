package com.aurionpro.enumeration.test;

enum Laptop {
	Macbook(2000) , HP(1500) , Lenovo, DEll(1200) ;
	
	private int price;
	
	Laptop(int price) {
		this.price = price;
		System.out.println("parametric");
	}
	
	Laptop(){
		this.price = 500;
		System.out.println("default");
	}

	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

public class EnumConstructor {

	public static void main(String[] args) {
		
		Laptop[] laptops = Laptop.values();
		for(Laptop laptop : laptops) {
			System.out.println(laptop + " : " + laptop.getPrice());
		}

	}

}
