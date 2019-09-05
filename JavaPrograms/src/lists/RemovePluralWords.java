package lists;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovePluralWords {
	
	public static ArrayList<String> removePlurals(ArrayList<String> list) {
		
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i).endsWith("s")) {
				list.remove(i);
				i--;
			}
		}
		
		return list;
	}
	

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>(Arrays.asList("Apples", "Banana", "Eggs", "Loop", "Runs", "Bans"));
		ArrayList<String> result = removePlurals(words);
		System.out.println(result);	
	}

}
