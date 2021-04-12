package exceptionHandling;

public class InvalidAgeException extends Exception 
{
	String msg;
	public InvalidAgeException(String msg)
	{
		this.msg=msg;
		
	}
	public String getMsg() {
		return msg;
	}
	
			

}
