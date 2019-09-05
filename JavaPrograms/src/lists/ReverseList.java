package lists;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseList {
	
	
	public ArrayList<String> reverse(ArrayList<String> words) {
		ArrayList<String> reversedWords = new ArrayList<>();
		
		for(int i = words.size() - 1; i >= 0; i--) {
			reversedWords.add(words.get(i));
		}
		
		return reversedWords;
		
	}
	

	static public void main(String something []) {
		
		ReverseList rl = new ReverseList(); //we have to create this object so that we can use above method
		ArrayList<String> wordsList = new ArrayList<String>(Arrays.asList("Anna", "Manna", "Xasha", "Kola", "Zona")); //This is the list we will reverse
		ArrayList<String> result = rl.reverse(wordsList);
		System.out.println(result);
		
	}
}
