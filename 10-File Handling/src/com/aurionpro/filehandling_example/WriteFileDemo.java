package com.aurionpro.filehandling_example;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {
     
	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("D:\\Aradhya\\demo.txt" , true);
		writer.append("\n Hello ..\n I am Aradhya Dange");
		writer.close();
		
		System.out.println("write operation done successfully....");
	}
}
