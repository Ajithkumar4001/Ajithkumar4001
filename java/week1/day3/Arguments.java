package week1.day3;

import java.util.Scanner;

public class Arguments {
	public void addTwoNumber(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Arguments val=new Arguments();
		
		Scanner given=new Scanner(System.in);
		
		System.out.println("Enter The Number = ");
		int first=given.nextInt();
		
		System.out.println("Enter The Number = ");
		int second=given.nextInt();
		System.out.println(+first +" + " +second);
		val.addTwoNumber(first, second);
	}
}
