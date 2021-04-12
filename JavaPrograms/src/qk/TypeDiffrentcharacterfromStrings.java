package qk;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class TypeDiffrentcharacterfromStrings {

	public static void main(String[] args) 
	{
		String s1="customer service";
		char[] string1 = s1.toCharArray();
		String s2="in squad";
		char[] string2 = s2.toCharArray();
	
		LinkedHashSet<Character> l1=new LinkedHashSet<Character>();
		
		for (char c:string1)
		{
			l1.add(c);
		}
		
		LinkedHashSet<Character> l2=new LinkedHashSet<Character>();
		
		for (char c1:string2)
		{
			l2.add(c1);
		}
		l1.addAll(l2);
		
		for(Character c:l1)
		{
			System.out.print(c);
		}
	}

}
