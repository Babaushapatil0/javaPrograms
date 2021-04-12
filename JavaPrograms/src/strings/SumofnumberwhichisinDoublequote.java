package strings;

public class SumofnumberwhichisinDoublequote {

	public static void main(String[] args) 
	{
		String s="123";
		
		int sum=0;
		
		int no = Integer.parseInt(s); //convert String into integer
		
		while(no!=0)
		{
			int rem=no%10; //gives reminder
			sum=sum+rem;
			no=no/10; // removes digit
		}
		
		
		System.out.println(sum);
	}

}
