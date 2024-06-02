package Arrays;

public class Sum_of_Array_using_forEach {

	public static void main(String[] args) {
		
		//Display sum of Array elements using forEach loop
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		for(int n:arr)
		{
			sum=sum+n;
		}
		System.out.println(sum);
	}
}
