package array;

public class AddingtwoArrayelements {

	public static void main(String[] args) 
	{
		int arr[]={3,5,7};
		int arr1[]={4,6,8};
		int sum1=0;
		int sum[]=new int[arr.length];
		for (int i = 0; i < arr1.length; i++) 
		{
			sum[i]=arr[i]+arr1[i];
			sum[i]=sum1;
		}
		
		for (int k = 0; k < arr.length; k++) 
		{
			System.out.println(sum[k]);
		}
	}
}
