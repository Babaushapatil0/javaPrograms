package practice;

public class TY 
{
	public static void main(String[] args) 
	{
		int arr[]={2,5,6};
		int arb[]={2,5,6};
		
		int arc[]=new int [arr.length];
		for(int i=0; i<arc.length; i++)
		{
			arc[i]=arr[i]+arb[i];
		}
		for(int i=0; i<arc.length; i++)
		{
			System.out.println(arc[i]);
		}
	}

}
