package com.aurionpro.filehandling_example;

import java.io.File;

public class DeleteFileDemo {
  public static void main(String[] args) {
	File file = new File("demo.txt");
	
	if(file.delete()) {
		System.out.println("Succesfully deleted " + file.getName());
	}
	else {
		System.out.println("File doesn't exists...");
	}
	
	
}
}
