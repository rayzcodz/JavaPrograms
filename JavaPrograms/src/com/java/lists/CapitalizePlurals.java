package com.java.lists;

import java.util.ArrayList;

public class CapitalizePlurals {
	
	static void capitalizePlurals(ArrayList<String> words) {
		
		for(int i = 0; i < words.size(); i++ ) {
			if(words.get(i).endsWith("s")) {
				words.set(i, words.get(i).substring(0, 1).toUpperCase()+words.get(i).substring(1));

			}
		}
		
		System.out.println(words);
		
	}

	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("anas");
		list.add("anad");
		list.add("nana");
		list.add("nanas");
		list.add("manas");
		list.add("anat");
		
		capitalizePlurals(list);
		
		
	}
}
