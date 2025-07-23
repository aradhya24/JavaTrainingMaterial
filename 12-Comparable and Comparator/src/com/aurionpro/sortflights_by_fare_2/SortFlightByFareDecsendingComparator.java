package com.aurionpro.sortflights_by_fare_2;

import java.util.Comparator;

public class SortFlightByFareDecsendingComparator implements Comparator<Flight>{

	@Override
	public int compare(Flight o1, Flight o2) {
		return o2.fare.compareTo(o1.fare);
	}
      
}
