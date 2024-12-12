package arrays;

public class Last_is_prime {
	public static void main(String[] args) {
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		int n=arr[arr.length-1];
		int count=0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println("It is prime number");
		}
		else
		{
			System.out.println("It is not prime number");
		}
	}
}
