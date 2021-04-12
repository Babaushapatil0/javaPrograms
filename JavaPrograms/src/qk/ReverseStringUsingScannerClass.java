package qk;

import java.util.Scanner;

public class ReverseStringUsingScannerClass {

	public static void main(String[] args) 
	{
		System.out.println("");
		
		Scanner read=new Scanner(System.in);
		
		String str=read.nextLine();
		
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		

	}

}
