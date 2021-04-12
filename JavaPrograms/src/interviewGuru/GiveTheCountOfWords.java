package interviewGuru;

import java.util.LinkedHashSet;

public class GiveTheCountOfWords {
	/*
	 * couting number of words present
	 * in the given statement
	 * 
	 */

	public static void main(String[] args) 
	{
		String s="hello world";
	
		String[] s1 = s.split(" ");
		
		int count=0;
		
		for(int i=0; i<=s1.length-1; i++)
		{
			count++;
		}
		
		System.out.println(count);
	}

}
