package com.aurionpro.example.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
           
		ExecutorService cachedService = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++) {
			Callable<String> task = () -> {
				return "Result from thread : " + Thread.currentThread().getName();
			};
			Future<String> result = cachedService.submit(task);
			System.out.println(result.get());
			
		}
	}

}
