package arrays;

public class Smallest_Element {

	public static void main(String[] args) {
		
		//Finding the smallest element in an array
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		int small=arr[0];
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		System.out.println(small);
	}
}
