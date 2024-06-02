package Arrays;

public class Higher_than_Average {

	public static void main(String[] args) {
		
		//Program to print Array elements with higher than the average
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		for(int i=0; i<=arr.length-1; i++)
		{
			sum=sum+arr[i];
		}
		int avg=sum/arr.length;
		
		for(int x:arr)
		{
			if(x>avg)
			{
				System.out.println(x);
			}
		}
	}
}
