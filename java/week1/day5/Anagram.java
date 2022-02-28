package week1.day5;

public class Anagram {
	public static void main(String[] args) {
		String text1="steps";
		String text2="steps";
		if(text1.length()==text2.length()){
			System.out.println("The Given Two Strings are in Same Length");
//			char[] arr1=text1.toCharArray();
//			char[] arr2=text2.toCharArray();
//			Arrays.sort(arr1);
//			Arrays.sort(arr2);
			if(text1.equals(text2)){
				System.out.println("It is a anagaram");
			}else{
				System.out.println("It is not a anagram");
			}
		}else{
			System.out.println("The Given Two Strings are in different Length");
			//System.out.println("It is not a anagram");
		}
	}
}
