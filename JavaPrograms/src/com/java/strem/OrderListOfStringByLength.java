package com.java.strem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderListOfStringByLength {
	public static void main(String[] args) {
		ArrayList<String> sibilings = new ArrayList<>();
		sibilings.add("Cumate");
		sibilings.add("Ramzante");
		sibilings.add("Adilabay");
		sibilings.add("Rahilabay");
		sibilings.add("Hurubay");
		sibilings.add("Buba");
		
		// Order the strings by length. If lengts are the same then order in alphabetical order.
		Comparator<String> c = (s1, s2) -> {
				 int l1 = s1.length();
				 int l2 = s2.length();
				 if(l1 < l2) return -1;
				 else if(l1 > l2) return 1;
				 else return s1.compareTo(s2);					
		};
	
		List<String> order = sibilings.stream().sorted(c).collect(Collectors.toList());
		System.out.println(order);
		

		
	}
}




