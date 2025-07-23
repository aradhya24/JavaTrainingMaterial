package com.aurionpro.filehandling_example;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
	
      public static void main(String[] args) throws IOException {
    	  
    	  File file = new File("demo.txt");
      
    	  if(file.createNewFile()) {
    		  System.out.println("File created Sucessfully");
    	  }
    	  else {
    		  System.out.println("File already exists");
    	  }
      }
     
}
