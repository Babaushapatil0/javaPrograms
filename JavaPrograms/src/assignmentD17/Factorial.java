package assignmentD17;

public class Factorial {

	public static void main(String[] args) 
	{
		findfact(5);
	}
     public static void findfact(int no)	
     {
		int fact=1;
		
		for (int i= no; i>0; i--) 
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
	}
}
