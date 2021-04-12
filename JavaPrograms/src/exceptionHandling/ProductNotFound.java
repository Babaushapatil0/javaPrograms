package exceptionHandling;

public class ProductNotFound extends Exception
{
	String msg;
	public ProductNotFound(String msg) 
	{
		// TODO Auto-generated constructor st
		
		this.msg=msg;
	}
	public String getMsg() {
		return msg;
	}
	
	

}
