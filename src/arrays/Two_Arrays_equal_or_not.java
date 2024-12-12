package arrays;

import java.util.Arrays;

public class Two_Arrays_equal_or_not {

	public static void main(String[] args) {
		
		//Checking two arrays are equal or not
		
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,5,6,7,8};
		String s1=Arrays.toString(a);
		String s2=Arrays.toString(b);
		if(s1.equals(s2))
		{
			System.out.println("The two arrays are equal");
		}
		else
		{
			System.out.println("Not equal");
		}
	}
}
