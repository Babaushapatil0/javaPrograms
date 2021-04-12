package assignemtD19;

public class MultiplayingRestofNumberexceptButOne1 
{
	// input 1234
	
	/*
	 * Output should be
	 * 24
	 * 12
	 * 8
	 * 6
	 */
	
	public static void main(String[] args) 
	{
		int n=1234;
		int n1=n;
		int count=0;
		while(n1!=0)
		{
			count++;
			n1=n1/10;
		}
		System.out.println(count);
		for(int i=1; i<=count; i++)
		{
			int multi=1;
			n1=n;
			for(int j=1; j<=count; j++)
			{
				int dig=n1%10;
				if(i!=j)
				{
					//multi=multi*j; for1234
					multi=multi*dig;
				}
				
				n1=n1/10;
			}
			
			System.out.println(multi);
		}
		
		
	}
}
