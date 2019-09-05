package lists;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveStars {
	
	public static void addStars(ArrayList<String> list ) {
		
		for (int i = list.size() - 1; i >= 0; i = i - 2) {
			list.remove(i);
			//i+=2;
		}
		
		System.out.println(list);
		
	}
	
	public static void main(String... s) {
		ArrayList<String> mylist = new ArrayList<>(Arrays.asList("Apples", "*", "Banana", "*", "Eggs", "*", "Loop", "*", "Runs", "*", "Bans", "*"));
		addStars(mylist);
	}

}
