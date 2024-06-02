package Arrays;

public class Missing_Number_in_Array {

	public static void main(String[] args) {
		
		//Finding the missing number in the array
		
		int[] arr= {1,2,4,5,6,7,8,2,9};
		int missing=arr[0];
		for(int i=1; i<=arr.length-1; i++)
		{
			if(++missing!=arr[i])
			{
				System.out.println("Missing elements:"+missing);
				break;
			}
		}
	}
}
