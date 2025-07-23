package com.aurionpro.sort_transcation_by_amount_id_5;

import java.util.Comparator;

public class IdSortComparatorAscending extends AmountSortComparatorDecsending implements Comparator<Transaction> {

	@Override
	public int compare(Transaction o1, Transaction o2) {
		
		int amountCompare = super.compare(o1, o2);

		if (amountCompare != 0) {
			return amountCompare;
		}
		return o1.id - o2.id;
	}

}
