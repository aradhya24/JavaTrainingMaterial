package com.aurionpro.static_example.test;

public class Counter {
	
	static private int value;
	
	static void increment() {
		System.out.println("Value : " + ++value);
	}

	public static void main(String[] args) {
		increment();
		increment();
		increment();
		
		increment();
		increment();
		
		increment();
		increment();
		increment();

	}

}
