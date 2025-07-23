package com.aurionpro.example.test;

import com.aurionpro.example.model.DynamicPriority;

public class DynamicPriorityTest {

	public static void main(String[] args) {
		
		new DynamicPriority("T1", 4).start();
		new DynamicPriority("T2", 6).start();
		new DynamicPriority("T3", 9).start();
		new DynamicPriority("T4", 2).start();
		new DynamicPriority("T5", 1).start();
		
	}

}
