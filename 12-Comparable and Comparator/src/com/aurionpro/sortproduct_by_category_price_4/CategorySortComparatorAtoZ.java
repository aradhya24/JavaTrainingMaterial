package com.aurionpro.sortproduct_by_category_price_4;

import java.util.Comparator;

public class CategorySortComparatorAtoZ implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.category.compareTo(o2.category);
	}

	

	

}
