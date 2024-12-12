package arrays;

public class First_isGreater_Second {

	public static void main(String[] args) {
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		int x=arr[0];
		int y=arr[1];
		if(arr.length>=2)
		{
			if(x>y)
			{
				System.out.println("First is greater than second");
			}
			else
			{
				System.out.println("First is Not greater than second");
			}
		}
		else
		{
			System.out.println("Length is less than 2 elements");
		}
	}
}
