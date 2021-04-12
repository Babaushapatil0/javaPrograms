package strings;

import java.util.LinkedHashSet;

public class NumberofOccuranceofChar 
{

	public static void main(String[] args) 
	{
		String s="india";
		char[] ch=s.toCharArray(); // convert into char
		
		int count1=0;
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>(); // get only unique character
		
		for(int i=0; i<ch.length; i++)
		{
			set.add(ch[i]);
		}
		
		for(Character c:set)
		{
			int count=0;
			
			for (int i=0; i<ch.length; i++)
			{
				if (c==ch[i])
				{
					
					count++;
				}
			}
			
			/////////////////////////////////////////////////////////////////////////////////////////////////
			
			//for order of accurance
			
			
		System.out.println(c+"  "+count);
			
			///////////////////////////////////////////////////////////////////////////////////////////////////
			
			// duplicates
			
			/*if(count >1)
			{
				System.out.println(c+"  "+count);
			}*/
			
			///////////////////////////////////////////////////////////////////////////////////////////////////
			
			// declare count1=0; to find number of duplicate char
		
			
			if(count>1)
			{
				count1++;
			}
			
			//System.out.println(c+ " "+count1);
			
			
		}
		

	}

}
