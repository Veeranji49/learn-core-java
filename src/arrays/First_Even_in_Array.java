package arrays;

public class First_Even_in_Array {

	public static void main(String[] args) {
		
		//Display First Even in array
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
