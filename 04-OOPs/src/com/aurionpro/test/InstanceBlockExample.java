package com.aurionpro.test;

public class InstanceBlockExample {
	
	
	public InstanceBlockExample() {
		System.out.println("Constructor");
	}
	
	String name;

	public static void main(String[] args) {
		InstanceBlockExample obj = new InstanceBlockExample();
		obj.name = "Om";
		System.out.println("Aradhya");
		System.out.println("Name in main blk : " + obj.name);
		

	}

	{
		name = "Aradhya";
		System.out.println("Name in instance blk : " + name);
	}
	static {
		System.out.println("Static blk");
	}
}
