package arrays;

public class Return_an_Array_from_the_method {

	//To return an array from the method
	
	public static void main(String[] args) {
		int[] x=Return_an_Array_from_the_method.display();
		System.out.println("Array elements:");
		for(int i=0; i<=x.length-1; i++)
		{
			System.out.println(x[i]);
		}
	}
	static int[] display()
	{
		int[] arr= {10,20,30,40,50};
		return arr;
	}
}
