package com.aurionpro.sortbyname_age_1;

import java.util.Comparator;

public class NameSortComparatorAlphabetically implements Comparator<Canditate>{

	@Override
	public int compare(Canditate o1, Canditate o2) {
		return o1.name.compareTo(o2.name);
	}

}
