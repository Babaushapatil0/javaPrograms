package strings;

import java.util.LinkedHashSet;

public class NumberofoccuranceofString {

	public static void main(String[] args) 
	{
		
		String s1="welcome to india welcome to Kalburgi";
		
		String [] ch=s1.split(" "); //Split it
		
		LinkedHashSet<String> h1=new LinkedHashSet<String>();
		for(int i=0; i<ch.length; i++)
		{
			h1.add(ch[i]); // Stote in Linkedhashset
		}
		
		for(String c:h1) // convert collection to string
		{
			int count=0;
			for(int i=0; i<ch.length; i++)
			{
				if(c.equals(ch[i])) //compare
				{
					count++;
				}
			}
			
			System.out.println(c+"  "+count); //Print
		}

	}

}
