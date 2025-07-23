package com.aurionpro.test.stringbuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
		
    	StringBuilder sb1 = new StringBuilder("Hello");
    	System.out.println(sb1);
    	sb1.append(" World");
    	System.out.println(sb1);
    	System.out.println(sb1.capacity());
	}
}
