package com.java.strem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IncreaseEachIntegerUsingMap {
	public static void main(String[] args) {
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(0);
		grades.add(4);
		grades.add(6);
		grades.add(8);
		grades.add(10);
		grades.add(12);
		grades.add(14);
		//we add map function below since we have to increase each value
		List<Integer> newGrades = grades.stream()
				.map(eachGrade -> eachGrade + 5)
				.collect(Collectors.toList());
		System.out.println(newGrades);
	}
}


