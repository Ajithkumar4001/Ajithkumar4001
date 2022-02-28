package week1.day4;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		int [] numbers= {1,2,3,5,6,7,8};
		//Sorting OF Numbers in array
		 Arrays.sort(numbers);
		 for (int i = 1; i < numbers.length; i++) {
			 if (numbers[i-1]!=i) {
				System.out.println("The Missing Element is = "+i);
				break;
			 }
		 }
	}
}
