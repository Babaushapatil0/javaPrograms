package strings;



public class Sumofnumbersingivenstring {

	public static void main(String[] args) 
	{
		String s="abc123@4&xyz";
		
		char[] Chara = s.toCharArray();
		
		String inte="";
		
		for (int i = 0; i < Chara.length; i++) 
		{
			
			if(Chara[i]>=48&&Chara[i]<=57)
			{
			inte=inte+Chara[i];
			} 
		}
		
		int intu = Integer.parseInt(inte);
		
		int sum=0;
		
		while(intu!=0)
		{
			int rem=intu%10;
			sum=sum+rem;
			intu=intu/10;
		}
		System.out.println(sum);
		
	}

}
