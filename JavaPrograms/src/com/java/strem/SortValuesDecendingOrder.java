package com.java.strem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortValuesDecendingOrder {
	public static void main(String[] args) {
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(90);
		grades.add(54);
		grades.add(66);
		grades.add(89);
		grades.add(100);
		grades.add(62);
		grades.add(54);
		
		//decending order: -g1.compareTo(g2) reverses the natutal ordering.
		List<Integer> descendingOrder = grades.stream()
				.sorted((g1,g2) -> -g1.compareTo(g2))
				.collect(Collectors.toList());
		//another way
		List<Integer> descendingOrder2 = grades.stream()
				.sorted((g1,g2) -> g2.compareTo(g1))
				.collect(Collectors.toList());
		System.out.println(descendingOrder);
		System.out.println(descendingOrder2);

		
	}
}




