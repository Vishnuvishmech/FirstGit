package com.assignments;

public class Pattern2 {

	public static void main(String[] args) 
	{
		int r=5; int sp=r-1; char ch='A';
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<i*2+1;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
			sp--;
			ch+=2;
		}

	}

}
