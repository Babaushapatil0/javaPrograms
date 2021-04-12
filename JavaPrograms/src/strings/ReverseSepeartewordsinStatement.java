package strings;

public class ReverseSepeartewordsinStatement 
{
	public static void main(String[] args) 
	{
		revWordsINSentencewithoutchangingOrder("Babusha yeshwantrao Patil");
	}

	public static void revWordsINSentencewithoutchangingOrder(String s) 
	{

		String[] s1 = s.split(" ");
		String rev="";

		for (String string : s1) 
		{
			String word = " "+string;
			for(int i=word.length()-1; i>=0; i--)
			{
				rev=rev+word.charAt(i);
				
			}
		}
		
		System.out.println(rev.trim());
	}
}
