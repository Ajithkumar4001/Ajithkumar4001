package week1.day4;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		int[] a={55,25,35,45,75};
		
		Arrays.sort(a);
		
		for (int i = a.length-1; i >=0; i--) {
			System.out.println(a[i]);
		}
	}

}
