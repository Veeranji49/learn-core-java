package arrays;

public class Last_is_Positive {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		if(arr[arr.length-1]>=0)
		{
			System.out.println("It is positive");
		}
		else
		{
			System.out.println("Not positive");
		}
	}
}
