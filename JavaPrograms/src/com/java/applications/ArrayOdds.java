package com.java.applications;

import java.util.Arrays;

/*
 * Write code that creates an array named odds and stores all odd numbers between 
 * -6 and 16 into it using a for loop. Make the array's size exactly large enough 
 * to store the numbers.
 * 
 * Given: int[] odds = [-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]
 * Output: int[] odds = [-5,-3,-1,1,3,5,7,9,11,13,15]
 * 						  0  1  2 3 4 5 6 7 8   9 10 
 * 					-5 = 2 * 0 - 5
 * 					-3 = 2 * 1 - 5
 */



public class ArrayOdds {
	public static void main(String[] s) {
		
		
		int arrLength = 0;
		for(int i = -6; i < 16; i++) {
			if(i % 2 != 0) {
				arrLength += 1;
			}
			
//			if(i % 2 == 1) {
//				arrLength += 1;
//			}	
			
		}
		
		
		int[] odds = new int[arrLength];
		for(int i = 0; i < arrLength; i++) {
			odds[i] = 2 * i - 5;
		}
		
		System.out.println(Arrays.toString(odds));
		System.out.println(arrLength);
		
	}
}
