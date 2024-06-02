package Arrays;

public class Swap_Specified_Locations {

	public static void main(String[] args) {
		
		//To Swap the specified location of Array elements
		
		int[] arr= {1,2,3,4,5,5,6,7,8,9};
		
		int x=7,y=3;
		
		if((x>=0&&x<=9)&&(y>=0&&y<=9))
		{
		
			int temp=arr[x];
			arr[x]=arr[y];
			arr[y]=temp;
			
			System.out.println("After swap:");
			for(int z:arr)
			{
				System.out.println(z);
			}
		
		}
		else
		{
			System.out.println("The elements are not found");
		}
	}
}
