package com.aurionpro.sortmoviesby_year_title_3;

import java.util.Comparator;

public class TitleSortComparatorAscending extends YearSortComparatorDecsending implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		
		int yearCompare = super.compare(o1, o2);

		if (yearCompare != 0) {
			return yearCompare;
		}
		return o1.title.compareTo(o2.title);
	}

}
