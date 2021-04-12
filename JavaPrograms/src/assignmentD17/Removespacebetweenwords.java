package assignmentD17;

public class Removespacebetweenwords {

	public static void main(String[] args) 
	{
		
		String s="welcome to india";
		String[] s1 = s.split(" ");
		for(int i=0; i<s1.length; i++)
		{
			System.out.print(s1[i]);
		}

	}

}
