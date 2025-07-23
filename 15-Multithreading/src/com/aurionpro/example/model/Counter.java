package com.aurionpro.example.model;

public class Counter extends Thread{
     
	public static int count = 0;
	
	public void countProtection() {
	    synchronized (Counter.class) {
	        count++;
	    }
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			countProtection();
		}
	}
	
}
