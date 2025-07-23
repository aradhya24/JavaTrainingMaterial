package com.aurionpro.consumer;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;
public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> toUpperCase = msg -> System.out.println(msg.toUpperCase());
		toUpperCase.accept("dfhaga");
		
		Consumer<List<String>> printList = list -> list.forEach(System.out::println);
		printList.accept(Arrays.asList("Om" , "Srusti"));
		
		
			
	}

}
