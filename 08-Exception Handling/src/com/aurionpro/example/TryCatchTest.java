package com.aurionpro.example;

public class TryCatchTest {

	public static void main(String[] args) {

       int num = 10;
       try {
    	   num /= 0;
       }
       catch(Exception e){
    	   e.printStackTrace();
       }

	}

}
