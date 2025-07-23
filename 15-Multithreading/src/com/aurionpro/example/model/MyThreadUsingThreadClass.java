package com.aurionpro.example.model;

public class MyThreadUsingThreadClass extends Thread{
      
	@Override
	public void run() {
		System.out.println("My Thread using thread class : Thread = " + Thread.currentThread().getName());
	}
}
