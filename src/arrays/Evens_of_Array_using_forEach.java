package arrays;

public class Evens_of_Array_using_forEach {

	public static void main(String[] args) {
		
		//Display Even numbers using forEach loop
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		for(int n:arr)
		{
			if(n%2==0)
			{
				System.out.print(n+" ");
			}
		}
	}
}
