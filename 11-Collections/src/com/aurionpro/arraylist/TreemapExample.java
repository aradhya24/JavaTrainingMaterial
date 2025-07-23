package com.aurionpro.arraylist;

import java.util.TreeMap;

public class TreemapExample {

	public static void main(String[] args) {
		
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(2, "Aradhya");
		map.put(1, "Om");
		map.put(3, "Srushti");
		map.put(5, "Ramesh");
		map.put(4, "Suresh");
		
		System.out.println(map);
		
		System.out.println("get(3): " + map.get(3));

		System.out.println("size(): " + map.size());
		
		System.out.println("containsKey(2): " + map.containsKey(2));
		
		System.out.println("containsValue(\"Om\"): " + map.containsValue("Om"));
		
		System.out.println("firstKey(): " + map.firstKey());
		
		System.out.println("lastKey(): " + map.lastKey());
		
		System.out.println("higherKey(2): " + map.higherKey(2));
		
		System.out.println("lowerKey(2): " + map.lowerKey(2));
		
		System.out.println("ceilingKey(2): " + map.ceilingKey(2));
		
		System.out.println("floorKey(2): " + map.floorKey(2));
		
		System.out.println("keySet(): " + map.keySet());
		
		System.out.println("values(): " + map.values());
		
		System.out.println("entrySet(): " + map.entrySet());
		
		System.out.println("descendingMap(): " + map.descendingMap());
		
		System.out.println("subMap(1, 4): " + map.subMap(1, 4));
		
		System.out.println("headMap(4): " + map.headMap(4));
		
		System.out.println("tailMap(4): " + map.tailMap(4));

		System.out.println("isEmpty(): " + map.isEmpty());
		
		System.out.println("remove(3): " + map.remove(3));
		System.out.println(map);
		
		map.clear();
		System.out.println("clear(): " + map);

	}

}
