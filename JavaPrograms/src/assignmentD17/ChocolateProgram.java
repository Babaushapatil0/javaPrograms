package assignmentD17;

public class ChocolateProgram {

	public static void main(String[] args) 
	{
		String s="bbo17 t70o pati1l997";
		
		String[] s1 = s.split(" ");
		
		for (String string : s1) 
		
		{
			char[] d = string.toCharArray();
			String alpha="";
			String inte="";
			String special="";
			
			for (int i = 0; i < d.length; i++) 
			{
				if(Character.isAlphabetic(d[i]))
				{
					
					alpha=alpha+d[i];
					
				} 
				
				else if (Character.isDigit(d[i]))
				{
					
					inte=inte+d[i];
					
				} 
				else {
					
						special=special+d[i];
						
					 }
			}			
			int integer = Integer.parseInt(inte);	
			int sum=0;
			
			while(integer!=0)
			{
				int rem=integer%10;
				sum=sum+rem;
				integer=integer/10;
			}
			
			System.out.print(sum+" ");
		}
	}

}
