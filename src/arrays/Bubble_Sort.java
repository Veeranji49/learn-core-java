package arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		//Bubble sort-Ascending order
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		int n=arr.length;
		
		for(int j=0; j<n-1; j++)
		{
			for(int i=0; i<n-1; i++)
			{
				if(arr[i]>=arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		System.out.println("After Sorting:");
		for(int x:arr)
		{
			System.out.println(x);
		}
	}
}
