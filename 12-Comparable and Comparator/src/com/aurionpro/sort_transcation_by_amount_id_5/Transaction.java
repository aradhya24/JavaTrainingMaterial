package com.aurionpro.sort_transcation_by_amount_id_5;

public class Transaction {
    
	protected Integer id;
	protected Double amount;
	
	
	public Transaction(Integer id, Double amount) {
		this.id = id;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "\n Id : " + id + ", Amount : " + amount;
	}
	
	
}
