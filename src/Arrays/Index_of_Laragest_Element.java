package Arrays;

public class Index_of_Laragest_Element {

	public static void main(String[] args) {
		
		//Find the index of largest element in array
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		int largestElementIndex=0;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]>arr[largestElementIndex])
			{
				largestElementIndex=i;
			}
		}
		System.out.println("The index of largest Element:"+largestElementIndex);
		
	}
}
