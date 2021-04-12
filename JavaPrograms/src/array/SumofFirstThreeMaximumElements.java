package array;

public class SumofFirstThreeMaximumElements {

	public static void main(String[] args) 
	
	{
		// First bubblesort in descending order
		
		int arr[]={20,30,40,10};
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		
		// initialize sum equals to zero
		
		// Summation of 3 maxium numbers
		int sumMAX=0;
		int sumMin=sumMAX;
		for (int k=0; k<3; k++) 
		{
			sumMAX=sumMAX+arr[k];
		}
		
		System.out.println(sumMAX);
		
		System.out.println("========================================");
		
		// summation of 3 least numbers
		 
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		for (int k=0; k<3; k++) 
		{
			sumMin=sumMin+arr[k];
		}
		
		System.out.println(sumMin);
	}

}
