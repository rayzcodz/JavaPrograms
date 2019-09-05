package lists;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStars {
	
	public static void addStars(ArrayList<String> list ) {
		
		for (int i = 1; i <= list.size(); i = i + 2) {
			list.add(i, "*");
			//i+=2;
		}
		
		System.out.println(list);
		
	}
	
	public static void main(String... s) {
		ArrayList<String> mylist = new ArrayList<>(Arrays.asList("Apples", "Banana", "Eggs", "Loop", "Runs", "Bans"));
		addStars(mylist);
	}

}
