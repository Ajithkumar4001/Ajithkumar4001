package week3.org.system;

public class Desktop extends Computer{
	public void desktopSize() {
	System.out.println("FHD+");	
	}
	public static void main(String[] args) {
		Computer o=new Computer();
		o.computerModel();
		Desktop o1=new Desktop();
		o1.desktopSize();
	}
}
