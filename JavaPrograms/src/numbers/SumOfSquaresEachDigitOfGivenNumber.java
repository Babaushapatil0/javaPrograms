package numbers;

public class SumOfSquaresEachDigitOfGivenNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		SumofSquares(143);

	}

	private static void SumofSquares(int no) 
	{
		int sum=0;
		
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem*rem;
			no=no/10;
		}
		
		System.out.println(sum);
	}
	
}
