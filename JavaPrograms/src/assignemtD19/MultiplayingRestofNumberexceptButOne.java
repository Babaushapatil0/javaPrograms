package assignemtD19;

public class MultiplayingRestofNumberexceptButOne {

	public static void main(String[] args) 
	{
		findMulti(1234);
	}
		
		private static void findMulti(int number ) 
		{
			
			
			String num = Integer.toString(number);
			String trimnum1 = num.substring(1);
			String trimnum2 = num.substring(2);
			String trimnum3 = num.substring(3);
			
			int number1 = Integer.parseInt(trimnum1);
			int multi=1;
			while(number1!=0)
			{
				int rem=number1%10;
				multi=multi*rem;
				number1=number1/10;
			}
			System.out.println(multi);
		
		
	}

}
