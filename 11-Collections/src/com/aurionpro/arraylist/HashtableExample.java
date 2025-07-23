package com.aurionpro.arraylist;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

	public static void main(String[] args) {
		
		Hashtable< Integer,String> table = new Hashtable<Integer, String>();
	
		table.put(2 , "Aradhya");
		table.put(1, "Om");
		table.put(10, "Ten");
		table.put(5, "Five");
		table.put(7, "Seven");
		table.put(25, "TwentyFive");
		table.put(17, "Seventeen");
		table.put(9, "Nine");
		table.put(6, "Six");
		System.out.println(table);

		table.put(3, "Srushti");
		
		System.out.println(table);
		
		System.out.println("Length : " + table.size());
		
		System.out.println("Table contains key 2 : " + table.containsKey(2));
		
		System.out.println("Replace aradhya with dange : " + table.replace(1, "Aradhya", "Dange"));
		
		System.out.println("Is Table contains 'Om' value :  " + table.containsValue("Om"));
		
		System.out.println("Table.keySet : " + table.keySet());
		
		System.out.println("Table.values : " + table.values());
		
		System.out.println("Table.putIfAbsent (4,shree) : " + table.putIfAbsent(4, "shree"));
		System.out.println("Table.putIfAbsent (4,shree) : " + table.putIfAbsent(4, "shree"));
		System.out.println(table);
		
		System.out.println("Table.entrySet() : " + table.entrySet());
		
		System.out.println("Table.remove(2) : " + table.remove(2));
		System.out.println(table);
	    

	}

}
