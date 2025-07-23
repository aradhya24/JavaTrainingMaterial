package com.aurionpro.example.test;

import com.aurionpro.example.model.MyThreadUsingRunnable;
import com.aurionpro.example.model.MyThreadUsingThreadClass;

public class MyThreadTest {
       public static void main(String[] args) {
    	   
		MyThreadUsingThreadClass t1 = new MyThreadUsingThreadClass();
		t1.start();
		
		Thread t2 = new Thread(new MyThreadUsingRunnable());
		t2.start();
		
		
	}
}
