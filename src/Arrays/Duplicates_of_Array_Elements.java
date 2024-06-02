package Arrays;

public class Duplicates_of_Array_Elements {

	public static void main(String[] args) {
		
		//Finding the duplicates in the array
		
		int[] arr= {1,2,3,4,5,6,7,8,9,11,111,12,12,2};
		
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=i+1; j<=arr.length-1; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					arr[j]=0;
					break;
				}
				
			}
		}
	}
}
