package com.aurionpro.sortproduct_by_category_price_4;

import java.util.Comparator;

public class PriceSortComparatorAscending extends CategorySortComparatorAtoZ implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {

		int categoryCompare = super.compare(o1, o2);
        
		if(categoryCompare == 0) {
			return o1.price.compareTo(o2.price);
		}
		return categoryCompare;
	}

}
