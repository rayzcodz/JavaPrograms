package lists;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Given an array int[] arr = {34,15,6,39,11,23} find maximum sum of any 3 consequtive 
 * elements.
 */
public class MaxSumThreeOfElements {

	public static void main(String[] args) {	
		int[] arr = {34,15,6,39,11,23};
		int size = 3;
		ArrayList<Integer> sums = new ArrayList<Integer>();

		for(int i = 0; i < arr.length - 2; i++) {
		int mysum = 0;
			for(int j=i; j < size+i; j++) {
				mysum += arr[j];
			}

			sums.add(mysum);
			//mysum = 0;

		}

		System.out.println(sums);
		Integer max = Collections.max(sums);
		System.out.print(max);

	}
}
