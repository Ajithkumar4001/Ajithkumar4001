package week1.day2;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int a=scan.nextInt(); 
		
		int fact=1;
		for (int i = a;i>1 ; i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of the given number is = "+fact);
	}
}
//5!=5*4*3*2*1=120
//logic 5 to 1 
//	fact=1
//	for (i=a;i>1;i--) {
//		fact=fact*i;
//	}