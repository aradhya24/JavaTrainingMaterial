package com.aurionpro.static_example.test;

public class Example {

	static void showStatic() {
		System.out.println("This is static method");
	}

	void showNonStatic() {
		System.out.println("This is non static method");
	}

	public static void main(String[] args) {
		
		showStatic();
		
		
		Example example = new Example();
		example.showNonStatic();

	}

}
