package arrays;

public class Passing_Array_to_Method {

	public static void main(String[] args) {
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		Passing_Array_to_Method.display(arr);
		
	}
   static void display(int[] x)
   {
	   System.out.println("Array element:");
	   for(int i=0; i<=x.length-1;i++)
	   {
		   System.out.print(x[i]+" ");
	   }
   }
}
