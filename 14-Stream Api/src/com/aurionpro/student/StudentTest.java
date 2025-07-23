
package com.aurionpro.student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("Srutsti", 65), new Student("Om", 45),
				new Student("Sahil", 25), new Student("Aradhya", 65), new Student("Tina", 32), new Student("Heena", 25));
		
		
		//filter
		System.out.println("More than 60 marks");
		studentList.stream().filter(student -> student.marks > 60).collect(Collectors.toList())
				.forEach(System.out::println);
		
		
		System.out.println("\n\nMore than 35 marks passed");
		studentList.stream().filter(student -> student.marks > 34).collect(Collectors.toList())
				.forEach(System.out::println);
		
		
		
		//map
		System.out.println("\n\n5 grace marks for student who fails");
		studentList.stream().filter( student -> student.marks < 35).map(student -> (student.marks + 5)).collect(Collectors.toList())
		.forEach(System.out::println);
		
		
		//count
		System.out.println("\n\nTotal no of passed Student more than 35: "
				+ studentList.stream().filter(student -> student.marks > 34).count());
        
		System.out.println("\n\nTotal no of passed Student more than 40: "
				+ studentList.stream().filter(student -> student.marks > 39).count());
		
		
		
		//sort
		System.out.println("\n\n 	");
		studentList.stream()
				.sorted(Comparator.comparingInt((Student s) -> s.marks).thenComparing((Student s) -> s.name))
				.forEach(System.out::println);
		
		//findFirst
		System.out.println("First student with more than 40 marks : " + studentList.stream().filter(student -> student.marks >= 40).findFirst()) ;

        //anymatch
		System.out.println("Any student with failed less than 40 marks : " + studentList.stream().anyMatch(student -> student.marks < 40)) ;
	}

}
