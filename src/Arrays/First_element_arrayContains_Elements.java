package Arrays;

public class First_element_arrayContains_Elements {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		
		//Displaying first element only if the array has elements
		if(arr.length>0)
		{
			System.out.println(arr[0]);
		}
		else
		{
			System.out.println("Array is empty");
		}
	}
}
