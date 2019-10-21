package com.java.strem;

import java.util.ArrayList;

public class NoOfFailedStudentsUsingCount {
	public static void main(String[] args) {
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(90);
		grades.add(54);
		grades.add(66);
		grades.add(89);
		grades.add(100);
		grades.add(62);
		grades.add(54);
		//we add map function below since we have to increase each value
		long noOfFailedStudents = grades.stream().filter(grade -> grade < 70).count();
		System.out.println(noOfFailedStudents);
	}
}


