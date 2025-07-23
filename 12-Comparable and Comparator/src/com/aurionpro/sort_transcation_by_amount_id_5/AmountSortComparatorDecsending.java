package com.aurionpro.sort_transcation_by_amount_id_5;

import java.util.Comparator;

public class AmountSortComparatorDecsending implements Comparator<Transaction>{

	@Override
	public int compare(Transaction o1, Transaction o2) {
		return o2.amount.compareTo(o1.amount);
	}

	

}
