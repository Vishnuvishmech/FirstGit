package com.assignments;

public class MinOfAllEvenIdex {

	public static void main(String[] args) 
	{
		int[] a= {5,9,3,4,6,1,8,2,7};
		int min=a[0];
		for(int i=0;i<=a.length+1;i++) 
		{
			if(i%2==0)
			{
				if(min>a[i])
					min=a[i];
					
			}
		}
		System.out.println("Minimum number of even indexes is : " + min);
	}

}
