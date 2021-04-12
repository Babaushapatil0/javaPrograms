package feddle;

public class SwappingTwoNumbers 
{
	public static void main(String[] args) 
	{
		int a=60;
		int b=70;
		a=a+b; //130
		b=a-b; //130-70=60
		a=a-b;//130-60
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
