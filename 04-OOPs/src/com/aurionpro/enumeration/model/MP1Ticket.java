package com.aurionpro.enumeration.model;

public class MP1Ticket {

	private String name;
	private int price;
	MP1TicketType[] ticketType;
	MP1BookingStatus bookingStatus;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public MP1TicketType[] getTicketType() {
		return ticketType;
	}

	public void setTicketType(MP1TicketType[] ticketType) {
		this.ticketType = ticketType;
	}

	public MP1BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(MP1BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public void ticketInfo(MP1Ticket ticket, int[] ticketTypePrices) {

		System.out.println("\n------------Booking Summary------------\n");
		System.out.println("Name of Ticket holder : " + ticket.getName());

		MP1TicketType[] ticketType = MP1TicketType.values();
		System.out.println("\nSelected Seat Types ");
		for (int i = 0; i < ticketTypePrices.length; i++) {
			if (ticketTypePrices[i] != 0) {
				System.out.println(ticketTypePrices[i] + " " + ticketType[i] + "  : "
						+ (ticketTypePrices[i] * ticketType[i].getPrice()));
			}

		}
		System.out.println("\nTotal Price : " + ticket.getPrice());
		System.out.println("\nBooking Status : " + ticket.getBookingStatus());

	}

	public int calculatePrice(int[] ticketTypePrices) {
		int totalCost = 0;
		MP1TicketType[] ticketType = MP1TicketType.values();
		System.out.println("---------------------------------");
		System.out.println("Selected Seat Types ");
		for (int i = 0; i < ticketTypePrices.length; i++) {
			if (ticketTypePrices[i] != 0) {
				System.out.println(ticketTypePrices[i] + " " + ticketType[i]);
			}

			totalCost += (ticketTypePrices[i] * ticketType[i].getPrice());
		}
		return totalCost;
	}

}
