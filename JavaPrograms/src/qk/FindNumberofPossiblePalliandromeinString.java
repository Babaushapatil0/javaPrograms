package qk;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class FindNumberofPossiblePalliandromeinString 
{
	public static void main(String[] args)
	{
		// To find Possible palliandrome Sequence
		
		String s="AABBAACAA";
		
		String[] s1=new String[s.length()];

		int count=0;
		for(int i=0; i<s.length()-1; i++)
		{
			for(int j=i+1; j<s.length(); j++)
			{
				String s2=s.substring(i,j+1);
				String rev="";

				for(int k=s2.length()-1;k>=0; k--)
				{
					rev=rev+s2.charAt(k);
				}

				if(s2.equals(rev))
				{

					count++;
					s1[count]=s2;
				}
			}
		}
	
		// To Print Max Length Palliandrome
		ArrayList<String> list=new ArrayList<String>();
		

		for(int k=0; k<s1.length; k++ )
		{
			list.add(s1[k]);
		}
		System.out.println(list);
		list.remove(null);
		System.out.println(list);
		String var = list.get(0);
		for (int i = 1; i < list.size(); i++) 
		{
			if(list.get(i).length()>var.length())
			{
				var=list.get(i);
			}

		}
		System.out.println(var);
	}
}

