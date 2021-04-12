package exceptionHandling;

public class Amazon 
{
	static String s="Iphone";
	static void search() throws ProductNotFound
	{
		if(s.equals(null))
		{
			System.out.println("Iphones");
		} else 
			{
			throw new ProductNotFound("not Found");
			}
	}
	
	public static void main(String[] args) 
	{
		try
		{
			search();
		} catch(ProductNotFound e)
		{
			System.out.println(e.getMsg());
		}
		
	}
	
	

}
