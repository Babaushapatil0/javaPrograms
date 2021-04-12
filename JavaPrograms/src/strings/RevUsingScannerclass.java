package strings;

import java.util.Scanner;

public class RevUsingScannerclass 
{
	public static void main(String[] args) 
	{
		System.out.println("");
		
		Scanner in=new Scanner(System.in);
		String str = in.nextLine();
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
	}

}
