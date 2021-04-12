package arrayshankar;

public class CheckPositionOfMinJavaMava 
{
	public static void main(String[] args) 
	{
		String s = "javamava";
		char[] s1 = s.toCharArray();
		int count=0;
		for(int i=0; i<s1.length; i++)
		{
			count++;
			if(s1[i]=='m')
			{
				break;
			}
		}
		System.out.println(count);
		
	}

}
