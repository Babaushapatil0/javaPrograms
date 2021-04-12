package exceptionHandling;

public class Shaadidotcom 
{
	static void submit() throws InvalidAgeException
	{
		int age=20;
		if(age>21)
		{
			System.out.println("happy married life");
		} else { throw new InvalidAgeException("invalid age");
				}
		
	}
	
	public static void main(String[] args) 
	{
		try{
		submit();
		} catch(InvalidAgeException e)
		{
			System.out.println(e.getMsg());
		}
	}
	

}
