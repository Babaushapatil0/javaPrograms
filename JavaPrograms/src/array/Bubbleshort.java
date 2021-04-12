package array;

public class Bubbleshort {

	public static void main(String[] args) 
	{
		
		int arr[]={20,30,40,10};
		
		// Ascending
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j]) // if you put > it will be ascending order
								  // if you put < it will be descending order
					              // for descending arr[0]--> Max
								  // arr[1]-->2nd Max
					              // arr[2]-->3rd Max
								  // for descending arr[arr.length-1]--> least
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int k=0; k<arr.length; k++)
		{
			System.out.println(arr[k]);
		}
			System.out.println(" now decreasing order starts");
			
		// Desceinding
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j]) // if you put > it will be ascending order
								  // if you put < it will be descending order
					              // for descending arr[0]--> max
								  // for descending arr[arr.length-1]--> least
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		for(int k=0; k<arr.length; k++)
		{
			System.out.println(arr[k]);
		}
		
		System.out.println("First max");
			System.out.println(arr[0]);
		
		System.out.println("Second max");
			System.out.println(arr[1]);
		
		System.out.println("third max");
			System.out.println(arr[2]);
			
		System.out.println("least");
		System.out.println(arr[arr.length-1]);
		
		System.out.println("second least");
		System.out.println(arr[arr.length-2]);
		
		System.out.println("Third least");
		System.out.println(arr[arr.length-3]);
		
	}

}
