package com.aurionpro.example.model;

public class DynamicPriority extends Thread{

	
	public DynamicPriority(String name , int priority) {
		setName(name);
		setPriority(priority);
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(getName() + " : "+ i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
