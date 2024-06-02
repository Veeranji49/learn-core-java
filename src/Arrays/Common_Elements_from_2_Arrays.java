package Arrays;

public class Common_Elements_from_2_Arrays {

	public static void main(String[] args) {
	
		//Find the common elements  from two arrays
		
		int[] arr= {1,2,3,4,5,6,7,8};
		int[] brr= {5,6,7,8,9,2,7,2,8};
		
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=brr.length-1; j++)
			{
				if(arr[i]==brr[j])
				{
					System.out.println("The common elements:"+arr[i]);
					
				}
			}
		}
	}
}
