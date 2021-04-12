package qk;

public class Findingwordwhichhasleastlength 
{
	public static void main(String[] args) 
	{
		int f=0;
		int t=0;
		int l=0;
		String s="welcome to india";
		String[] s1 = s.split(" ");
		for (String string : s1) 
		{
			int count = string.length();
			if(count<0)
			{
				l=t;
				t=f;
				f=count;
			}
		}
		
		System.out.println(f);
	}
}
