package feddle;

import java.util.LinkedHashSet;

public class NumberOfOccuranceofDuplicteinString {

	public static void main(String[] args) 
	{
		String string1 = "welcome to india welcome to Kalburgi";
		String[] indString = string1.split(" ");
		
		LinkedHashSet<String> l1=new LinkedHashSet<String>();
		for(int i=0; i<indString.length; i++)
		{
			l1.add(indString[i]);
		}
		int count=0;
		for(String word:l1)
		{
			for(int i=0; i<indString.length; i++)
			{
				if(word.equals(indString[i]))
				{
					count++;
				}
			}
			
		System.out.println(word+" "+count);
		}
		
	}

}
