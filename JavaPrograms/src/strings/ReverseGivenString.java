package strings;

public class ReverseGivenString 
{
	
	public static void main(String[] args) 
	{
		// By CharAt method
		
		String s1="india";
		String rev="";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev=rev+s1.charAt(i);
		}
		
		System.out.print(rev);
		
		System.out.println(" ");
		
		
		// without rev method
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			System.out.print(s1.charAt(i));
		}
		
		System.out.println(" ");
		
		// tocharaway
		char ch[]=s1.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			rev=ch[i]+rev;
		}
		System.out.println(rev);
		System.out.println("+++++++++++++++=");
		
		// gives count
		System.out.println(s1.compareTo(rev));
		System.out.println("++++++++++++++++");
		System.out.println(s1.compareTo(s1));
		
	}

}
