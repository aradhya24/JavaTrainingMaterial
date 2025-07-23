package com.aurionpro.example.test;

import com.aurionpro.example.model.DeamonThread;

public class DaemonThreadTest {
    public static void main(String[] args) {
		DeamonThread deamonThread = new DeamonThread();
		
		deamonThread.setDaemon(true);
		deamonThread.start();

        System.out.println("Main thread is complete...........");

        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread ended.");
	}
}
