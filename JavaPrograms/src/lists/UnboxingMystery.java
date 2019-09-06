package lists;

import java.util.ArrayList;

public class UnboxingMystery {

	public static void main(String[] args) {
		int n = 420;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(n);
		list.add(n);
		if (list.get(0) == list.get(1)) {
		    System.out.println("equal");
		} else {
		    System.out.println("unequal"); 
		}

	}
	
	/*
	 * The two list elements might store the same int but might not be the same object. 
	 * The code prints “unequal” in the current release of Java because the program creates 
	 * two different Integer objects that each store the value 420.
	 */

}
