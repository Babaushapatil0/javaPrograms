package strings;

public class FindThewordWhichisHavingLeastLength {

	public static void main(String[] args) 
	{
		String s="welcome to india";
		
		String[] s1 = s.split(" ");
		String var=s1[0];
		int count = s1[0].length();
		
		for (int i = 1; i < s1.length-1; i++) 
		{
			if(s1[i].length()>var.length())
			{
				var=s1[i];
			}
			
		}
		
		System.out.println(var);
	}
}

// 

// String s="welcome to india" o/p welcometoindia

// Palliandrome

// factorial

// Strin S=welcome to india