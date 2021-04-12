package numbers;

public class SumOfFactorialOfGivenNumber {

	public static void main(String[] args) 
	{
		int no=153;
		int sum=0;
		
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+factorial(rem);
			no=no/10;
		}
		System.out.println(sum);
	}
	
	static int factorial(int no)
	{
		int fact=1;
		for(int i=no; i>=1; i--)
		{
			fact=fact*i;
		}
		
		return fact;
	}

}
