package week1.day3;

/**
 * @author DELL AJI
 *
 */
public class Localvariable {
	public int d;
	public void addTwoNumber() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void subTwoNumber() {
		int a=10;
		int b=20;
		int d=a-b;
		System.out.println(d);
	}
	public static void main(String[] args) {
		Localvariable calc=new Localvariable();
		calc.addTwoNumber();
		calc.subTwoNumber();
	}

}
