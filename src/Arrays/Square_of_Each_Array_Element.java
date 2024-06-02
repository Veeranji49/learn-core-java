package Arrays;

public class Square_of_Each_Array_Element {

	public static void main(String[] args) {
		
		//Finding the Square value of Each Array Element
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<=arr.length-1; i++)
		{
			int square=arr[i]*arr[i];
			System.out.println("Square of"+arr[i]+"="+square);
		}
	}
}
