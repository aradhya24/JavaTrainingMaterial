package com.aurionpro.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Cherrry");
		System.out.println(list);
		
		list.add("Guava");
		System.out.println("New fruit added : " + list);
		
		list.add(2, "Litchi");
		System.out.println("New fruit added at 2nd pos : " + list);
		
		System.out.println("length of list : " + list.size());
		
		System.out.println("Index of Mango element : " + list.lastIndexOf("Mango"));
		
		System.out.println(" Is list contains cherry : " + list.contains("Cherry"));
		
		System.out.println("Element at 0 pos deleted : " + list.remove(0) + " List : "+ list);
		
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Mango" , "Coconut"));

	}

}
