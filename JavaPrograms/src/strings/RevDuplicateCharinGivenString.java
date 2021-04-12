package strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RevDuplicateCharinGivenString 
{
	public static void main(String[] args) 
	{
		
		String s="india";
		
		char[] ch = s.toCharArray();
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) 
		{
			set.add(ch[i]);
			
		}
		
		for(Character ch1:set)
		{
			System.out.print(ch1);
		}

	}

}
