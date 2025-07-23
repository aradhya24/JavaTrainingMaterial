package com.aurionpro.electricity_billing_system;

public class BillingService {

	static void printAllBills(ResidentialCustomer[] residentialCustomers) {
		for (ResidentialCustomer residentialCustomer : residentialCustomers) {
			residentialCustomer.printBill();
		}
	}

	static void printAllBills(CommercialCustomer[] commercialCustomers) {
		for (CommercialCustomer commercialCustomer : commercialCustomers) {
			commercialCustomer.printBill();
		}
	}

}
