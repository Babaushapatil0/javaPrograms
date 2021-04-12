package array;

public class AddingTwoArraysHavingDifferentLength1 
{
	public static void main(String[] args) 
	{
		int a[]={1,2};
		int b[]={1,2,4};
		
		int count=a.length;
		int c[]=new int [count];
		if(a.length<b.length)
		{
			count=b.length;
		}
		
		for(int i=0; i<count; i++)
		{
			try
			{
				c[i]=a[i]+b[i];
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				c[i]=a[i];
			}
			
			System.out.println(c[i]);
		}
		
		
	}

}
