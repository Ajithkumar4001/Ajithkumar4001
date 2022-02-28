package week1.day2;

import java.util.Scanner;

public class PositiveNumber {
	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int a=num.nextInt();
		
		if (a>=0) {
			System.out.println("The number "+a+" is Positive");
		}
		else {
			System.out.println("The "+a+" is Negative");
		}
	}
}
