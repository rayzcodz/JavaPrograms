package lists;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class CompareTo {
	
	public static void main(String[] args) {
		
		String a = "A";
		String b = "B";
		String c = "C";
		
		if(a.compareTo(b) < 1) {
			System.out.println(-1);
		}
		
		
		//binary search method because it calls compareTo internally
		String[] arr = {"al","zod", "bob", "dan", "cari", "dan", "mike"};
		//using binarySearch method find 
		System.out.println(Arrays.binarySearch(arr, "dan"));
		
		//TreeSet/TreeMap use compareTo internally for ordering.
		TreeSet<String> tset = new TreeSet<>();
		
		for(String word : arr) {
			tset.add(word);
		}
		
		System.out.println(tset);
		
//		TreeMap<String, Integer> tmap = new TreeMap<>();
//		tmap.put("USA", 1000);
//		System.out.println(tmap); //{USA=1000}
		


		

		
	}	
}
