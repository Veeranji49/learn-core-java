package arrays;

public class Merging_Arrays {

	public static void main(String[] args) {
		
		//To Merging the Arrays
		
		int[] a= {1,2,3,4,5,6,7};
		int[] b= {9,11,13,15,82,24};
		int[] c= {73,25,29,27,4,91,81};
		int[] d= {82,71,61,51,42,55};
		int m=a.length;
		int n=b.length;
		int o=c.length;
		int p=d.length;
		
		int[] f=new int[m+n+o+p];
		
		for(int i=0; i<=m-1; i++)
		{
			f[i]=a[i];
		}
		for(int i=0; i<=n-1; i++)
		{
			f[i+m]=b[i];
		}
		for(int i=0; i<=o-1; i++)
		{
			f[i+m+n]=c[i];
		}
		for(int i=0; i<=p-1; i++)
		{
			f[i+m+n+o]=d[i];
		}
		System.out.println("After merging the array:");
		for(int i=0; i<=f.length-1; i++)
		{
			System.out.print(f[i]+" ");
		}
		
	}
}
