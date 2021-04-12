package strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateWordinGivenString {

	public static void main(String[] args) 
	{
		String s="welcome to india welcome to kalaburagi";
		
		String[] s1 = s.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for (int i=0; i<s1.length; i++)
		{
			set.add(s1[i]);
			
		}
		
		for(String c:set)
		{
			System.out.print(c+" ");
		}
		

	}

}
