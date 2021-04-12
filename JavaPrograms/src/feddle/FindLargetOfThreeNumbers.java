package feddle;

public class FindLargetOfThreeNumbers {

	public static void main(String[] args) 
	{
		int [] arr={1,10,7,8,9};
		
		for(int i=0; i<arr.length; i++ )
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
	
		System.out.println("First max "+arr[0]);
		System.out.println(("second max "+arr[1]));
		System.out.println("Third max "+arr[2]);
	}

}
