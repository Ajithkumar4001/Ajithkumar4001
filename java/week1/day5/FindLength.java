package week1.day5;

import java.util.Scanner;

public class FindLength {
	public void lengthOfTheString(String name) {
		int value= name.length();
		System.out.println("Length of the string1:"+value);
	}
	public void stringToChar(String name) {
		char[] tochar=name.toCharArray();
		System.out.println("String to char:");
		for(int i=0;i<name.length();i++)
		{
			System.out.println(tochar[i]);
		}
	}
	public void compare(String name, String name1)
	{
		System.out.println(name.equalsIgnoreCase(name1));
	}
	public static void main(String[] args) {
		//create a method
		FindLength given=new FindLength();
		//to get the string from user
		Scanner get=new Scanner(System.in);
		System.out.println("Enter the Name:");
		String val=get.nextLine();
		String val1=get.nextLine();
		//call the methods
		given.lengthOfTheString(val);
		given.lengthOfTheString(val1);
		given.stringToChar(val);
		given.compare(val, val1);
	}

}
