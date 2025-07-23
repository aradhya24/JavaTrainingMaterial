package com.aurionpro.sortbyname_age_1;

import java.util.Comparator;

public class AgeSortComparatorAscending extends NameSortComparatorAlphabetically implements Comparator<Canditate> {

	@Override
	public int compare(Canditate o1, Canditate o2) {

		if (super.compare(o1, o2) != 0) {
			return super.compare(o1, o2);
		}
		return o1.age - o2.age;
	}

}
