package com.java.strem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortListIntegers {
	public static void main(String[] args) {
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(90);
		grades.add(54);
		grades.add(66);
		grades.add(89);
		grades.add(100);
		grades.add(62);
		grades.add(54);
		//we add sort function below since we have to increase each value
		List<Integer> sortedGrades = grades.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedGrades);
		
		//decending order
		
	}
}



