package com.aurionpro.example.model;

public class DeamonThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("Daemon Thread is running....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
