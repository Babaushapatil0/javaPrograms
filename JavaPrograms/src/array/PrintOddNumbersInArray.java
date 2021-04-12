package array;

import java.util.ArrayList;
import java.util.Collections;

public class PrintOddNumbersInArray 
{
	public static void main(String[] args) 
	{
		int [] arr={12,17,30,30,40,19,15};
		
		ArrayList<Integer> l1=new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++)
		{
			l1.add(arr[i]);
		}
		Collections.sort(l1, Collections.reverseOrder());
		for(int j=0; j<l1.size(); j++)
		{
			if(l1.get(j)%2==1)
			{
				if(l1.get(j)==17)
				{
					System.out.println(l1.get(j));
				} else {
							System.out.println(l1.get(j));
						}
			}
		}
		
	}

}
