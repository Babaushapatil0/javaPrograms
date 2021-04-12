package swappingwordsinsentence;

public class Swappingaddnmuberwords 
{
	

	public static void main(String[] args) 
	{
		SwappingOddnmuberwords("welcome to tyss") ;
		SwappingOddnmuberwords("welcome to india mandya");
	}

		
		public static void SwappingOddnmuberwords(String s)
		{
			String[] s1 = s.split(" ");
			
			for(int i=0; i<s1.length-1; i++)
			{
				if(i%2==0)
				{
				
				String temp=s1[i];
				s1[i]=s1[i+1];
				s1[i+1]=temp;
				}
			}
			
			for (int i = 0; i < s1.length; i++) 
			{
				System.out.print((s1[i]+" "));
				
			}
			
		}
}