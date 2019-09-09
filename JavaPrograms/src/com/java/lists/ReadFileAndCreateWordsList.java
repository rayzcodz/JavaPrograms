package com.java.lists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFileAndCreateWordsList {

	public static void main(String[] args) {
		
		Scanner scan = null;
		
		try {
			scan = new Scanner(new File("/Users/ry/git/JavaPrograms/JavaPrograms/src/com.java.lists/textfile.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		ArrayList<String> words = new ArrayList<String>();
		
		while (scan.hasNext()) {
			String word = scan.next();
			words.add(word);
		}
		
		System.out.println(words);
	
	}

}
