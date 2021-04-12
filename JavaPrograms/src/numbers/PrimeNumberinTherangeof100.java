package numbers;

public class PrimeNumberinTherangeof100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int j = 1; j < 100; j++) 
		{
			findprime(j);	
		}

	}

	public static void findprime(int no) {
		// TODO Auto-generated method stub
		
		boolean flag=true;
		
		for (int i = 2; i < no; i++) 
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}	
		}
		
		if(flag==true)
		{
			System.out.println(no);
		}
		
	}

}
