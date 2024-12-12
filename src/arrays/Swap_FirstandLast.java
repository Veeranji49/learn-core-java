package arrays;

public class Swap_FirstandLast {

	public static void main(String[] args) {
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		if(arr.length>=2)
		{
			int temp=arr[0];
			arr[0]=arr[arr.length-1];
			arr[arr.length-1]=temp;
			
			System.out.println("After swapping:");
			for(int x:arr)
			{
				System.out.print(x);
			}
		}
		else
		{
			System.out.print("The array contains less than two elements");
		}
	}
}
