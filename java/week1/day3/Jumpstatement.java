package week1.day3;

public class Jumpstatement {
	public static void main(String[] args) {
		for (int i=1; i<=5;i++) {
			if (i==3) { 
				//break;
				System.out.println("Three");
				continue;
			}
			if(i==5)
			{
				//System.out.println("Five");
				continue;  //it exits the current line only
			}
			if(i==17)
			{
				break;  //it exits the loop
			}
			System.out.println(i);
		}
		
	}

}
