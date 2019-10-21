package com.java.strem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMaxNumber {
	public static void main(String[] args) {
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(90);
		grades.add(54);
		grades.add(66);
		grades.add(89);
		grades.add(100);
		grades.add(62);
		grades.add(54);
		
		//get the min number
		Integer min = grades.stream().min((g1, g2) -> g1.compareTo(g2)).get();
		System.out.println(min);
		
		Integer max = grades.stream().max((g1, g2) -> g1.compareTo(g2)).get();
	
	
		
	}
}





