package guru01;

public class RecursiveCalling {

	public static void main(String[] args) 
	{
		recursiveCalling(0);
	}

	private static void recursiveCalling(int no) 
	{
		if(no<=30)
		{
			System.out.println(no);
			no++;
			recursiveCalling(no);
		}
	}

}
