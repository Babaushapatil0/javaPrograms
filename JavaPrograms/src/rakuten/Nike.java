package rakuten;

public interface Nike 
{
	void shoes();
	void Bags();
}
abstract class Akshay implements Nike
{
	public void shoes()
	{
		System.out.println("mett mettili hoditini");
	}
	
	public static void main(String[] args)
	{
		Nike n=new Akshay() 
		{
			
			@Override
			public void Bags() 
			{
			
				System.out.println("hi");
				
			}
		};
		
		n.shoes();
		n.Bags();
	}
}
