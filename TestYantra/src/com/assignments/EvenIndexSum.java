package com.assignments;

public class EvenIndexSum {

	public static void main(String[] args)
	{
		int[] a= {5,9,3,4,6,1,8,2,7};
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{
			if(i%2==0)
			sum=sum+a[i];
		}
		System.out.println("Sum of even indexes is : " + sum);
	}

}
