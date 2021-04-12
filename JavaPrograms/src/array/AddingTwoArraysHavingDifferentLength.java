package array;

public class AddingTwoArraysHavingDifferentLength 
{

	public static void main(String[] args) 
	{
		int [] arr={1,2,3,7};
		
		int [] arb={4,5,6,8,9};
		
		int count=arr.length;
		if(arr.length<arb.length)
		{
			count=arb.length;
		}
		
		int []c=new int [count];
		
		if(arr.length==arb.length)
		{
			for(int i=0; i<arr.length; i++)
			{
				c[i]=arr[i]+arb[i];
				System.out.println(c[i]);
			}
		} else if (arr.length>arb.length)
		{
			for(int i=0; i<arb.length; i++)
			{
				c[i]=arr[i]+arb[i];
				System.out.println(c[i]);
			}
			
			for(int i=arb.length; i<arr.length; i++)
			{
				c[i]=arr[i];
				System.out.println(c[i]);
			}
		} else {
					for(int i=0; i<arr.length; i++)
					{
						c[i]=arr[i]+arb[i];
						System.out.println(c[i]);
					}
			
				}
		
				for(int i=arr.length; i<arb.length; i++)
				{
					c[i]=arb[i];
					System.out.println(c[i]);
				}
		
		

	}

}
