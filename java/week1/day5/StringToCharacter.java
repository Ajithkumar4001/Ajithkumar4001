package week1.day5;

public class StringToCharacter {
	public static void main(String[] args) {
		String text="AJITH";
		
		char[] array=text.toCharArray();
		for(int i=0;i<text.length();i++)
		{
			System.out.println(array[i]);
		}
	}

}
