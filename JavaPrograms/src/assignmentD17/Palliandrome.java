package assignmentD17;

public class Palliandrome {

	public static void main(String[] args) 
	{
		
		String s="malayalam";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println(s+" is palliandrome ");
		} else {
					System.out.println("its not palliandrome");
				}
	}

}
