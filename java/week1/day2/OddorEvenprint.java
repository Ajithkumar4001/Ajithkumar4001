package week1.day2;

public class OddorEvenprint {
	public static void main(String[] args) {
		for (int i=0; i <= 10 ; i++) {
			//>>If Condition to use check and print the value
			//Condtion is num is divided by %operator ==0 to check
			if (i%2==0) {
				System.out.println("--------------------");
				System.out.println("Even Number"+" = "+i);
			}else if (i%2!=0) {
				System.out.println("--------------------");
				System.out.println("ODD  Number"+" = "+i);
			}
		}	
	}
}
