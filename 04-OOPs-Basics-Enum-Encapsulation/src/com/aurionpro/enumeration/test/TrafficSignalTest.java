package com.aurionpro.enumeration.test;

import com.aurionpro.enumeration.model.TrafficSignal;

public class TrafficSignalTest {
	
	public static void getAction(TrafficSignal trafficSignal) {
		switch(trafficSignal) {
		     
		case RED:
			System.out.println("Stop");
			break;
			
		case YELLOW:
			System.out.println("Get Ready");
			break;
			
		case GREEN:
			System.out.println("Go");
			break;
		}
	}

	public static void main(String[] args) {
		getAction(TrafficSignal.YELLOW);

	}

}
