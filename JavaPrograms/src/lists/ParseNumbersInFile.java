package lists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ParseNumbersInFile {
	
	static public void main(String args []) throws FileNotFoundException { //just playing with main method for fun
		File file = new File("/Users/ry/git/JavaPrograms/JavaPrograms/src/lists/fileofnumbers.txt"); //Assigning file path to file variable 
		
		Scanner scan = new Scanner(file); //Reading the file
		ArrayList<Integer> numbers = new ArrayList<>(); //Creating array list to hold the numbers in the file
		
		while(scan.hasNext()) {
			int number = scan.nextInt();
			numbers.add(number);
		}
		
		System.out.println(numbers);
		
		//Get the average of the numbers
		int sum = 0;
		for(int n : numbers) {
			sum += n;
		}
		
		double average = sum / numbers.size();
		System.out.println("Average = " + average);

		//Get the highest and lowest number.
		Integer min = Collections.min(numbers);
		System.out.println("Min = " + min);
		
		//Get the highest and lowest number.
		Integer max = Collections.max(numbers);
		System.out.println("Max = " + max);

	}

}
