package feddle;

public class CheckNumberisPresentInGivenString {

	public static void main(String[] args) 
	{
		
		String s = "aakmdnm728278";
		
		char[] character = s.toCharArray();
		boolean flag=false;
		for(int i=0; i<character.length; i++)
		{
			if(character[i]>=48&&character[i]<=57)
			{
				System.out.print(character[i]);
				flag=true;
				
				
			}
		}
		
		if(flag)
		{
			System.out.println(" number is present");
		} else {
			System.out.println("number is not present");	
		        }

	}

}
