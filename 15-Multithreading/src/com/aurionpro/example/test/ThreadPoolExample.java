package com.aurionpro.example.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
		ExecutorService fixedService = Executors.newFixedThreadPool(2);
		ExecutorService cachedservice = Executors.newCachedThreadPool();
		
		Runnable task1 = ()-> System.out.println("Task 1 by : " + Thread.currentThread().getName());
		Runnable task2 = ()-> System.out.println("Task 2 by : " + Thread.currentThread().getName());
		Runnable task3 = ()-> System.out.println("Task 3 by : " + Thread.currentThread().getName());
		Runnable task4 = ()-> System.out.println("Task 4 by : " + Thread.currentThread().getName());
		
		
		fixedService.submit(task1);
		fixedService.submit(task2);
		fixedService.submit(task3);
		
		cachedservice.submit(task4);
		cachedservice.submit(task1);
	}
}
