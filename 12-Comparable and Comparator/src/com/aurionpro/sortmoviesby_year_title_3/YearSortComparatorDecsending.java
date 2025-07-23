package com.aurionpro.sortmoviesby_year_title_3;

import java.util.Comparator;

public class YearSortComparatorDecsending implements Comparator<Movies>{

	@Override
	public int compare(Movies o1, Movies o2) {
		return o2.year - o1.year;
	}

	

}
