package iii__Behavioural.b__Mediator;

import java.util.*;

public class ATCTower implements ATCMediator {
	private boolean canLand;
	private List<Flight> flights = new ArrayList<>();

	public void registerFlight(Flight flight) {
		flights.add(flight);
	}

	public boolean isLandingAllowed() {
		return canLand;
	}

	public void setLandingStatus(boolean status) {
		canLand = status;
	}
}
