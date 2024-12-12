package arrays;

public class Swapping_index_Elements_with_NextElement {

	public static void main(String[] args) {
		
		// Program to swap the index element with next element – Error if the next element is not present
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		for(int num:arr)
		{
			System.out.print("Before Swap:"+num+" ");
		}
		System.out.println();
		
		try
		{
			for(int i=0; i<=arr.length-1; i++)
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The array not had next element");
		}
		
		System.out.println("After swapping:");
		for(int x:arr)
		{
			System.out.println(x);
		}
		
	}
}
