package Arrays;

public class Print_FirstIndex_Even_Array {

	public static void main(String[] args) {
		
		//find the index value of first even number==2
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		int firstIndex=-1;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]%2==0)
			{
				firstIndex=i;
				break;
			}
		}
		if(firstIndex!=-1)
		{
			System.out.println(firstIndex);
		}
		else
		{
			System.out.println("No elements found");
		}
	}
}
