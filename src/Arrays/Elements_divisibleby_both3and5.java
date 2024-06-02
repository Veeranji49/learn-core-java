package Arrays;

public class Elements_divisibleby_both3and5 {

	public static void main(String[] args) {
		
		//Display elements that are divisible by both 3 and 5
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]%3==0)
			{
				System.out.println(" divisible by 3:"+arr[i]);
			}
			else if(arr[i]%5==0)
			{
				System.out.println("Divisible by 5="+arr[i]);
			}
			else
			{
				System.out.println("The elements not divisible by both 3 and 5");
			}
		}
		
	}
}
