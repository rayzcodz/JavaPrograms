package com.java.lists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * We are reading a file and adding each word from the file into a list.
 */

public class ReadFileAndCreateWordsArray {
	public static void main(String ... ray) throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File("/Users/ry/git/JavaPrograms/JavaPrograms/src/com.java.lists/textfile.txt"));
		
		String[] words = new String[10]; //Making size = 10 because there 10 words in the file.
		int index = 0;
		
		while (scan.hasNext()) {
			String word = scan.next();
			words[index] = word;
			index += 1;
		}
		
		System.out.println(Arrays.toString(words));
		
	}

}
