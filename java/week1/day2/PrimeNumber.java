package week1.day2;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int a=num.nextInt();
		int count=0;
		
		for(int i=1;i<=a;i++){
			int answer=a%i;
			if(answer==0){
				count++;
			}
		}if(count==2){
			System.out.println("The Given Number -> "+a+" is PrimeNumber ");
		}else{
			System.out.println("The Given Number -> "+a+" is Not a Prime Number");
		}
	}
}