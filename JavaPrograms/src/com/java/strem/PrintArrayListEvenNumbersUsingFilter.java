package com.java.strem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintArrayListEvenNumbersUsingFilter {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(0);
		l1.add(4);
		l1.add(6);
		l1.add(8);
		l1.add(10);
		l1.add(12);
		l1.add(14);
		//we add filter function below to select even numbers
		List<Integer> l2 = l1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);
	}
}