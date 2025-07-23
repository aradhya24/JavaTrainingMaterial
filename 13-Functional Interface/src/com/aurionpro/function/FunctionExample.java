package com.aurionpro.function;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		Function<Integer, String> toStringExample = num -> ("Number : " + num.toString());
		System.out.println(toStringExample.apply(31));

		System.out.println("\n\nLength of String");
		Function<String, Integer> getStringLength = name -> name.length();
		System.out.println("Aradhya : " + getStringLength.apply("Aradhya"));
		System.out.println("Om : " + getStringLength.apply("Om"));
		System.out.println("Srushti : " + getStringLength.apply("Srushti"));

		System.out.println("\n\nTemperature Converter");
		Function<Double, Double> temperatureConverter = temperature -> ((temperature * 1.8) + 32);
		System.out.println("C : 0  to F : " + temperatureConverter.apply(0.0));
		System.out.println("C : 20 to F : " + temperatureConverter.apply(20.0));
		System.out.println("C : 37 to F : " + temperatureConverter.apply(37.0));

		System.out.println("\n\nStudent Grade Generator");
		Function<List<Integer>, List<String>> studentMarksGeneratorList = list -> {
			List<String> listStr = new ArrayList<>();
			for (Integer marks : list) {
				if (marks >= 75) {
					listStr.add("A");
				} else if (marks >= 50) {
					listStr.add("B");
				} else {
					listStr.add("Fail");
				}
			}
			return listStr;
		};

		List<Integer> marksList = Arrays.asList(90, 65, 40, 77, 55, 33);
		List<String> grades = studentMarksGeneratorList.apply(marksList);

		System.out.println("Marks: " + marksList);
		System.out.println("Grades: " + grades);
	}
}
