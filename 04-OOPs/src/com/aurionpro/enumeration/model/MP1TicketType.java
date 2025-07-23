package com.aurionpro.enumeration.model;

public enum MP1TicketType {

	REGULAR(300), VIP(450), PREMIUM(1000);

	private int ticketPrice;
	
	
    //constructor
	private MP1TicketType(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
    
	//getter
	public int getPrice() {
		return ticketPrice;
	}
    //setter
	public void setPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

}
