package exceptionHandling;

public class Mainclass 
{
	public static void main(String[] args) 
	{
		System.out.println("mainstarts");
		try{
			
			int arr[]={1,2};
			System.out.println(arr[8]);
			int a=1/0;

			
		}catch(ArrayIndexOutOfBoundsException e)
		
		{
			System.out.println("handled");
		} catch (ArithmeticException e)
		{
			System.out.println("adrressed");
		}
		finally{
			System.out.println("mainn starts");
		}
		
		
	}

}
