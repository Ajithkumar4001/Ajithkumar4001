package week1.day3;

public class Calculator2 {
	public void addTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println("The Addtion of A and B value is"+" = "+c);
	} 
	public void subTwoNumber(int c, int x) {
		int d=c-x;
		System.out.println();
		System.out.println("The Subtraction of A and B value is"+" = "+d);
	}
	public static void main(String[] args) {
		Calculator2 val=new Calculator2();
		val.addTwoNumber(20,10);
		val.subTwoNumber(50,10);
	}

}
