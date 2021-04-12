package strings;

public class UppercaseDuplicateCharacter {

	public static void main(String[] args) 
	{
		String s="India";
		
		String m="";
		
		for(int j=0; j<s.length(); j++) // call 
		{
			if(s.charAt(j)=='i')
			{
				char c=s.charAt(j);
				m=m+(c+"").toUpperCase();
				
				//by using ASCE value  
				
				//char ch = (char) ((s.charAt(j))-32); 
				
				//m=m+ch;
				
			} else {
						m=m+s.charAt(j);
					}
		}
		
		System.out.println(m);
	}

}
