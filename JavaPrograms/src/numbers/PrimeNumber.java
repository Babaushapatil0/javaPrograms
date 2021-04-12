package numbers;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		
		findprime(5);

	}

	public static void findprime(int no) 
	{
		boolean flag=true;
		
		for(int i=2; i<no; i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("number is prime");
		} else
		{
			System.out.println("not prime");
		}
	}

}
