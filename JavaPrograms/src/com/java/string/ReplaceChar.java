package com.java.string;

/*
 * Write a Java program to get a string from a given string where all occurrences of its 
 * first char have been changed to '$', except the first char itself.
 */

public class ReplaceChar {
	
	public static void main(String ... ray) {
		
		String name = "americana banana";
		String newName = name.substring(0,1) + name.substring(1).replace('a', '$');
		System.out.println(newName);
		
	}

}
