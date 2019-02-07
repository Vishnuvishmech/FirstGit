package com.assignments;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		int i= 555;
		int j=i;
		int k=0;
		int l=0;
		int temp=0; 
		while(j>0)
		{
			temp=j%10;
			j = j/10;
			k= k+temp;
			
		}
		while(k>0)
		{
			int temp1= k%10;
			k=k/10;
			l=l+temp1;
		}
		System.out.println(l);
	}

}
