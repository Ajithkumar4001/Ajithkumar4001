package week1.day2;

public class FactorialNumber {
	public static void main(String[] args) {
		int a=4, fact=1;
		for (int i = 1;i<=a ; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of the given number is = "+fact);
	}
}
