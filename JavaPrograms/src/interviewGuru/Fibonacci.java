package interviewGuru;

public class Fibonacci {
	
	/*
	 * 
	 * Printing Fibonacci Series
	 * 
	 */

	public static void main(String[] args) 
	{
		findfib(0,1);
	}

	public static void findfib(int fib1, int fib2) 
	{
		System.out.print(fib1+" "+fib2+" ");
		
		for(int i=0; i<=10; i++ )
		{
			int fib3=fib1+fib2;
			
			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
		}
	}

}
