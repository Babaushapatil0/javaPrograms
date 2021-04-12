package array;

public class SwappingElementsinArrayWhenkeyis2 
{
	public static void main(String[] args) 
	{
		int arr[]={10,20,30,40,50};
		
		for(int i=0; i<2; i++) //key=2
		{
			for(int j=0; j<arr.length-1; j++)
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
		for (int k = 0; k < arr.length; k++) 
		{
			System.out.println(arr[k]);
		}
	}
}
