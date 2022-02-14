package week1.day1;

public class Mobile {
	String mobileName="samsung";
	int mobileNumber=97862525;
	short mobilePrice=20000;
	float mobileRange=12.9876f;
	double longfrequency=234567.098752;
	//long imeiNumber=2564225543645555;
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		String mobileName2 = mob.mobileName;
		System.out.println("Mobile Name   = "+mobileName2);
		System.out.println("Mobile Number = "+mob.mobileNumber);
		System.out.println("Mobile Price  = "+mob.mobilePrice);
		System.out.println("Mobile Range  = "+mob.mobileRange);
		//System.out.println(mob.longFrequency);
	}
}
