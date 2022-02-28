package week1.day2;

import java.util.Scanner;

public class NestedifProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=sc.nextInt();
		if (a > 0) {
			System.out.println(+a+ " " +"is Positive");
		} else if (a < 0) {
			System.out.println(+a+ " "+"is Negative");
		} else {
			System.out.println(+a+ " "+"is Nuteral");
		}
	}
}
