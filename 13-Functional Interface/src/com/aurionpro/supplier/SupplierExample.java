package com.aurionpro.supplier;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<LocalTime> currentTime = () -> LocalTime.now();
		System.out.println(currentTime.get());

		Supplier<String> coinToss = () -> {
			return Math.random() < 0.5 ? "Heads" : "Tails";
		};

		System.out.println("Toss Result: " + coinToss.get());

		Supplier<Double> randomNumber = () -> Math.random();
		System.out.println(randomNumber.get());

		Supplier<Integer> randomIntNumber = () -> (int) (Math.random() * 1000000);
		System.out.println(randomIntNumber.get());
		
		Supplier<String> defaultCityName = () -> "Pune";
		System.out.println("Default City Name : " + defaultCityName.get());
		
		Supplier<List<String>> productList = () -> Arrays.asList("Pen" , "Pencil" , "Eraser" , "Sharpner" , "Scale");
		System.out.println("Default product list : " + Arrays.asList(productList.get()));
		
	}

}
