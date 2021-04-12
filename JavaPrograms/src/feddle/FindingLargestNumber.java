package feddle;

public class FindingLargestNumber 
{
	public static void main(String[] args) 
	{
		int no=24253;
		int f=0;
		int s=0;
		int t=0;
		
		while(no!=0)
		{
			int rem=no%10;
			
			if(f<rem)
			{
				t=s;
				s=f;
				f=rem;
			} else if(s<rem)
			{
				t=s;
				s=rem;
			} else if(t<rem)
			{
				t=rem;
			}
			
			no=no/10;
			
		}
		System.out.println(f);
		System.out.println(s);
		System.out.println(t);
	}

}
