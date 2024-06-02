package Arrays;

import java.util.Scanner;

public class First_Occurance_of_Array_Elements {

	public static void main(String[] args) {
		
		//finding the first Occurance of the array element
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element:");
		int num=sc.nextInt();
		boolean found=false;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]==num)
			{
				System.out.println("First Occurance :"+i);
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Element not found");
		}
	}
}
