package com.aurionpro.example.model;

public class MyThreadUsingRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("My thread using Runnable : Thread = " + Thread.currentThread().getName());
	}
 
}
