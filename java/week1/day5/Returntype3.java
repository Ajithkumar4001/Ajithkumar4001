package week1.day5;

public class Returntype3 {
	public float m1() {
		System.out.println("Good");
		return (float) 36.76;
	}
	public static void main(String[] args) {
		Returntype3 r1=new Returntype3();
		r1.m1();
		System.out.println(r1.m1());
		
	}

}
