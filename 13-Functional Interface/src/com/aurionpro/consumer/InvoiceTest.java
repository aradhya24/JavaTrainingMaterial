package com.aurionpro.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class InvoiceTest {

	public static void main(String[] args) {
		

		
		Consumer<ArrayList<Invoice>> invoiceFormatter = list -> list.forEach(System.out::println);
		
		ArrayList<Invoice> invoices = new ArrayList<>(Arrays.asList(
                new Invoice("Pen", 20, 200.00),
                new Invoice("Eraser", 50, 150.00),
                new Invoice("Sharpener", 10, 30.00)
        ));

        invoiceFormatter.accept(invoices);
 
	}

}
