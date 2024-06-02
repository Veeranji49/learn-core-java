package Arrays;

public class Reverse_Array_Without_using_second_Array {

	public static void main(String[] args) {
		
		//To Reverse the array without using second array
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println("Reverseing the array:");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
}
