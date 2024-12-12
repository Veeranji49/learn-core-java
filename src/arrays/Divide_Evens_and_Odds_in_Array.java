package arrays;

public class Divide_Evens_and_Odds_in_Array {

	public static void main(String[] args) {
		
		//Dividing Even numbers and Odd numbers in array
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		int count=0;
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		int[] evens=new int[count];
		int[] odds=new int[arr.length-count];
		int x=0;
		int y=0;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]%2==0)
			{
				evens[x]=arr[i];
				x++;
			}
			else
			{
				odds[y]=arr[i];
				y++;
			}
		}
		System.out.println("Even numbers of the array:");
		for(int i=0; i<=evens.length-1; i++)
		{
			System.out.println(evens[i]);
		}
		System.out.println("Odds numbers of the array:");
		for(int i=0; i<=odds.length-1;i++)
		{
			System.out.println(odds[i]);
		}
	}
}
