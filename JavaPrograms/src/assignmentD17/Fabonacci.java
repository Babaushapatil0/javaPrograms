package assignmentD17;

public class Fabonacci {

	public static void main(String[] args) 
	{
		findfibo(0,1);

	}

	public static void findfibo(int fib1, int fib2) 
	{
		int fib3=0;
		System.out.print(fib1+" "+fib2+" ");
		
		for (int i = 0; i < 10; i++) 
		{
			fib3=fib1+fib2;
			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
		}
	}
}
