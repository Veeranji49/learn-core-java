package arrays;

public class Sum_of_Even_Numbers {

	public static void main(String[] args) {

		//Calculate the sum of Even elements of Array
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.print(sum+" ");
	}
}
