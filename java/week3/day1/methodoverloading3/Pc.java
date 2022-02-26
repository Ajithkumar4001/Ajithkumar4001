package methodoverloading3;

public class Pc extends Laptop{
	public void getSystemInfo(String Os2) {
		System.out.println("Another Opertaing System is:"+Os2);
	}
	public static void main(String[] args) {
		Pc obj4=new Pc();
		obj4.getSystemInfo("MAC");
		obj4.getSystemInfo("Windows 10");
	}
}
