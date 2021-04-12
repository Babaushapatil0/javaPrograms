package array;

import java.util.HashSet;

public class PrintnumberwhoosAdditionwillbe7withDuplicateelements {

	public static void main(String[] args) 
	{
		
		int arr[]={1,3,4,5,2,6,9,7,4,3,1};
		
		HashSet<Integer> set=new HashSet<Integer>(); // To remove duplicate from array convert it hashset
		
		for(int i=0; i<arr.length; i++)
		{
			set.add(arr[i]); //fetch and add one value at a time
		}
		
		// we will be creating new array because when we remove duplicate elements size will be different
		
		int arr1[]=new int[set.size()]; // get size of the set beacuse we removed duplicate elements
		
		int count=0; // we dont know order of insertion so provide count
		for(Integer value:set)
		{
			arr1[count]=value; //whenevr value comes count will get increment
			count++;
		}
		
		// bubble sort
		for(int i=0; i<arr1.length-1; i++) //outerloop
		{
			for(int j=i+1; j<arr1.length; j++) //innerloop
			{
				if(arr1[i]+arr1[j]==7) //provide required condition
				{
					System.out.println(arr1[i]+" "+arr1[j]); //Print
				}
			}
		}

	}
}

