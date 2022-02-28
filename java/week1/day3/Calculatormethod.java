package week1.day3;

public class Calculatormethod {
	public void addTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println("The Addtion of "+a+" and "+b+" value is"+" = "+c);
	} 
	public void subTwoNumber(int c, int x) {
		int d=c-x;
		System.out.println();
		System.out.println("The Subtraction of "+c+" and "+x+" value is"+" = "+d);
	}
	public static void main(String[] args) {
		Calculatormethod val=new Calculatormethod();
		val.addTwoNumber(20,10);
		val.subTwoNumber(50,10);
	}

}
