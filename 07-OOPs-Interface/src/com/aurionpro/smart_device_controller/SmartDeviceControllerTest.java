package com.aurionpro.smart_device_controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SmartDeviceControllerTest {
	public static void main(String[] args) {
		 IControllable controllable ;
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 int choice = 0;
		 
		 while(true) {
			 System.out.print("\nChoose Smart control device : \n 1 -> Light, 2 -> Fan, 3 -> Speaker, 4 -> TV, 5 -> EXIT : ");
		     
		     while (true) {
					try {
						choice = scanner.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.print("Input Mismatched, Enter input again :");
						System.out.print("\nChoose Smart control device : \n 1 -> Light, 2 -> Fan, 3 -> Speaker, 4 -> TV, 5 -> EXIT : ");
						scanner.next();
					}
				}
		     
		     switch(choice) {
		     
		     case 1:
		    	  controllable = new Light();
		    	  DeviceOperationsSelection.deviceOperationSelection(scanner, controllable , "LIGHT");
		    	  break;
		     
		     case 2:
		    	 controllable = new Fan();
		    	 DeviceOperationsSelection.deviceOperationSelection(scanner, controllable , "FAN");
		    	 break;
		    
		     case 3:
		    	 controllable = new Speaker();
		    	 DeviceOperationsSelection.deviceOperationSelection(scanner, controllable , "SPEAKER");
		    	 break;
		    
		     case 4:
		    	 controllable = new Tv();
		    	 DeviceOperationsSelection.deviceOperationSelection(scanner, controllable , "TV");
		    	 break;
		    
		     case 5:
					System.out.println("Exiting...");
					scanner.close();
					return;

			 default:
					System.out.println("Invalid input choice.");
		    	 
		     }
		 
		 }
	}
}
