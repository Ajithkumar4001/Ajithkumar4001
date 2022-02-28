package week3.MethodOverriding;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("1000");
	}
	public static void main(String[] args) {
		AxisBank r1=new AxisBank();
		r1.deposit();
		r1.savings();
		r1.fixed();
	}

}
