package week1.day2;

import java.util.Scanner;

public class ConvertNumber {

	public static void main(String[] args) {
		Scanner val=new Scanner(System.in);
		System.out.println("Enter a value = ");
		int zero=val.nextInt();
		
//		int a = 0;
		int b;
		if (zero<0) {
			b=zero*(-1);
			System.out.println("This Number is Convert into a Positive value = "+b);
		}else if(zero==0){
			System.out.println("This Number is = "+zero);
		}else {
			System.out.println("This Number is Convert into a Negative value");
		}
	}

}
