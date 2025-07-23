package com.aurionpro.filehandling_example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("demo.txt"));
		String line;
		while((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}

}
