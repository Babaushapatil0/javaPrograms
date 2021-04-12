package numbers;

public class StrongNumber 
{
	public static void main(String[] args) 
	{
		int no=145;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+findfact(rem);
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println(sum+" its strong Number");
		} else {
					System.out.println(sum+" its not strong number");
				}
	}

	private static int findfact(int no) 
	{
		int fact=1;
		for(int i=1; i<=no; i++)
		{
			fact=fact*i;
		}
		
		return fact;
	}

}
