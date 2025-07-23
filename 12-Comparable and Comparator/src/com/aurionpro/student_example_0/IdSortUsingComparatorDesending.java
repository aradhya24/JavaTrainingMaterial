package com.aurionpro.student_example_0;

import java.util.Comparator;

public class IdSortUsingComparatorDesending implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o2.id - o1.id;
	}

}
