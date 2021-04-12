package qk;

import java.util.LinkedHashSet;

public class RepeatationofChar 
{
	public static void main(String[] args)
	{
		int count1=0;
		
		String s="ABBCDEEH";
		
		char[] s1 = s.toCharArray();
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<s1.length; i++)
		{
			set.add(s1[i]);
			
		}
		
		for (Character character : set) 
		{
			int count=0;
			for(int j=0; j<s1.length; j++ )
			{
				if(character==s1[j])
				{
					count++;
				}
			}
			System.out.println(character+" "+count);
		//	System.out.println();
		/*	if(count>1)
			{
				count1++;
				System.out.println(character+" "+count);
			}
			*/
		}
		
		
	}

}
