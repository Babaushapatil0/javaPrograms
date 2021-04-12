package array;

public class SwappingElementsinArray {

	public static void main(String[] args) 
	{
		int arr[]={10,20,30,40,50};
		
		
			for (int i = 0 ; i < arr.length-1; i++) 
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			
			for (int k = 0; k < arr.length; k++) 
			{
				System.out.println(arr[k]);
			}

	}

}
