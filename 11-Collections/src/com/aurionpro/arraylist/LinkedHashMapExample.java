
package com.aurionpro.arraylist;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(2 , "Aradhya");
		map.put(1, "Om");
		map.put(3, "Srushti");
		
		System.out.println(map);
		
		System.out.println("Length : " + map.size());
		
		System.out.println("Map contains key 2 : " + map.containsKey(2));
		
		System.out.println("Replace aradhya with dange : " + map.replace(1, "Aradhya", "Dange"));
		
		System.out.println("Is map contains 'Om' value :  " + map.containsValue("Om"));
		
		System.out.println("map.keySet : " + map.keySet());
		
		System.out.println("map.values : " + map.values());
		
		System.out.println("map.putIfAbsent (4,shree) : " + map.putIfAbsent(4, "shree"));
		System.out.println("map.putIfAbsent (4,shree) : " + map.putIfAbsent(4, "shree"));
		System.out.println(map);
		
		System.out.println("map.entrySet() : " + map.entrySet());
		
		System.out.println("map.remove(2) : " + map.remove(2));
		System.out.println(map);
	}
}
