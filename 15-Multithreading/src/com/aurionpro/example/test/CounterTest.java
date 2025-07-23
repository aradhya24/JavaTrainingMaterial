package com.aurionpro.example.test;

import com.aurionpro.example.model.Counter;

public class CounterTest {

	public static void main(String[] args) throws InterruptedException {
        
		Thread t1 = new Thread(new Counter());
		Thread t2 = new Thread(new Counter());
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("Final count : " +  Counter.count);
	}

}
