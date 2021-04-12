package feddle;

public class NumberPalliandrome 
{
	public static void main(String[] args) 
	{
		int no=0;
		
		boolean flag=true;
		
		for(int i=2; i<no; i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("number is prime");
		} else {
					System.out.println("number is not prime");
				}
		
	}
}
