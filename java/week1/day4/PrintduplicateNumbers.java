package week1.day4;

public class PrintduplicateNumbers {
	public static void main(String[] args) {
		int[] arr = {1,4,2,45,2,4,8,6,5,19,8,5,20};
		
		System.out.println("Length Of The Is Array = " +arr.length);
		System.out.println("Then the Duplicate values are: ");
		
		for (int i = 0; i < arr.length-1; i++) 
		{
			
			for (int j = i+1; j <arr.length; j++) {
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
			
		}
	}

}
