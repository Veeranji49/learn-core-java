package Arrays;

import java.util.Scanner;

public class Integer_Array_with_Input_Size {

	public static void main(String[] args) {

		// create integer array with given input size.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}
