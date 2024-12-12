package arrays;

public class Average_of_Array {

	public static void main(String[] args) {
		
		//Calculate the Average of Array Elements
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0; i<=arr.length-1; i++)
		{
			sum=sum+arr[i];
		}
		int avg=sum/arr.length;
		System.out.println(avg);
		
	}
}
