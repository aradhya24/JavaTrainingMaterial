package com.aurionpro.static_example.test;

public class ConfigTest {
    
	static private double version;
	
	static {
		version = 1.3;
	}
	
	public static void main(String[] args) {
		System.out.println("version" + version);

	}

}
