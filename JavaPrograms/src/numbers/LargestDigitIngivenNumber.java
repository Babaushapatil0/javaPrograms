package numbers;

public class LargestDigitIngivenNumber {

	public static void main(String[] args) 
	{
		int no=4384928;
		int largest=0;
		while(no!=0)
		{
			int rem=no%10;
			if(largest<rem)
			{
				largest=rem;
			}
			no=no/10;
		}
		System.out.println(largest);

	}

}
