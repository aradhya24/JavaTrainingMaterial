package com.aurionpro.enumeration.test;

import java.util.Scanner;

import com.aurionpro.enumeration.model.MP1BookingStatus;
import com.aurionpro.enumeration.model.MP1Ticket;

public class MP1TicketBookingSystem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("-------Welcome to Movie Ticket Booking System--------\n\n");

		System.out.print("Enter Username : ");
		String name = scanner.nextLine();
		System.out.println();

		int[] ticketTypePrices = new int[3];
		int i = 4;
		while (i != 0) {
			System.out.println("--------------------");
			System.out.println("   Ticket type \n");
			System.out.println("1 . Regular (Rs 300)  \n2 . VIP (Rs 450) \n3 . PREMIUM (1000) \n0 . EXIT");
			System.out.print("Enter Choice : ");
			int choice = scanner.nextInt();
			if (choice == 0) {
				break;
			}
			ticketTypePrices[choice - 1]++;
			i = choice;
		}
		MP1Ticket ticket = new MP1Ticket();

		int totalPrice = ticket.calculatePrice(ticketTypePrices);

		scanner.nextLine();
		System.out.println("---------------------------------");
		System.out.println("\n         Booking Status\nConfirmed | Pending | Cancelled");
		System.out.print(" Enter status : ");
		String bookingStatus = scanner.nextLine().toUpperCase();

		ticket.setBookingStatus(MP1BookingStatus.valueOf(bookingStatus));
		ticket.setName(name);
		ticket.setPrice(totalPrice);

		ticket.ticketInfo(ticket, ticketTypePrices);
	}

}
