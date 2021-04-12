package numbers;

public class SumOfDigitsOfGivenNumber {

	public static void main(String[] args) 
	{
		findsumofdigits(123);

	}

	public static void findsumofdigits(int no) 
	{
		int sum=0;
		
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		
		System.out.println(sum);
	}

}
