package com.aurionpro.student_example_0;

import java.util.Comparator;

public class IdSortUsingComparatorAscending implements Comparator<Student>{


	@Override
	public int compare(Student o1, Student o2) {
		return o1.id - o2.id;
	}

}
