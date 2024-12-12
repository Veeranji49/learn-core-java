package arrays;

public class Swap_the_UnSpecified_locations {

	public static void main(String[] args) {
		
		//to swap the Invalid location of array elements
		
		int[] arr= {9,1,4,2,5,2,7,5,8,6,3,1,2,3,4,5,6,7,8,9,10};
		
		int x=1,y=10;
	
		if((x>=0&&x<=arr.length-1)&&(y>=0&&y<=arr.length-1))
		{
			int temp=arr[x];
			arr[x]=arr[y];
			arr[y]=temp;
			
			for(int n:arr)
			{
				System.out.println(n);
			}
		}
		else
		{
			System.out.println("Invalid location");
		}
	}
}
