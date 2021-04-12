package strings;

public class ReverseFirstandLastword {

	public static void main(String[] args) 
	
	{
		
		String s="welcome to testyantra";
		
		String[] ch = s.split(" ");
		String rev = "";
		for(int i=ch.length-1; i>=0; i--)
		{
			rev=rev+ch[i]+" ";
		}
		
		System.out.print(rev);
	}

}
