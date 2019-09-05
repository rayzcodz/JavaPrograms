package lists;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersect {
	
	public static void getintersect(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> intersection = new ArrayList<>();
		
		if(a.size() > b.size()) {
			for(Integer n : a) {
				if(b.contains(n)) {
					intersection.add(n);
				}
			}
		}
		
		else {
			for(Integer m : b) {
				if(a.contains(m)) {
					intersection.add(m);
				}
			}
		}
		
		System.out.println(intersection);
			
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));
		ArrayList<Integer> listb = new ArrayList<>(Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));
		getintersect(lista, listb);

	}

}
