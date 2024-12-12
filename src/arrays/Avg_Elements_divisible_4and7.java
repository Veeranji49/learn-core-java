package arrays;

public class Avg_Elements_divisible_4and7 {

	public static void main(String[] args) {
		
		//Find the average of array elements that are divisible by 4 and 7
		
		int[] arr= {9,9,9,9,9,9};
		
		int sum=0;
		for(int i=0; i<=arr.length-1; i++)
		{
			sum=sum+arr[i];
		}
		int avg=sum/arr.length;
		
		if(avg%3==0)
		{
			System.out.println("Divisible by 3:"+avg);
		}
		else if(avg%6==0)
		{
			System.out.println("Divisible by 6:"+avg);
		}
		else if(avg%9==0)
		{
			System.out.println("divisible by 9:"+avg);
		}
		else
		{
			System.out.println("Not divisible ");
		}
		
	}
}
