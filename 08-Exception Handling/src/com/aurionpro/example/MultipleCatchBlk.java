package com.aurionpro.example;

public class MultipleCatchBlk {

	public static void main(String[] args) {

           String[] array = new String[2];
           
           
           try {
        	   System.out.println(array[0].length());
        	   System.out.println(array[5]);
           }
           catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
        	   System.out.println("Array Index Out of bount Exception");
           }
           catch(NullPointerException nullPointerException){
        	   System.out.println("NullPointerException");
           }
	}

}
