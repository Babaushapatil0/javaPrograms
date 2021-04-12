package strings;

public class SeparateCharNumandSpecialchar 
{

	public static void main(String[] args) 
	{
		String s="123@nsAndjs4556";
		
		char[] d = s.toCharArray();
		
		String alpha="";
		String inte="";
		String special="";
		
		
		for (int i = 0; i < d.length; i++) 
		{
			if(d[i]>=65&&d[i]<=122)
			{
				
				alpha=alpha+d[i];
				
			} 
			
			else if (Character.isDigit(d[i]))
			{
				
				inte=inte+d[i];
				
			} 
			else {
				
					special=special+d[i];
					
				 }
					
			
		}
		
		System.out.println(alpha);
		System.out.println(inte);
		System.out.println(special);
	}
}
