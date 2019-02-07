package com.assignments;

public class Pattern3 {

	public static void main(String[] args) 
	{
		int r=5; int sp=r-1; 
		for(int i=0;i<r;i++)
		{
			int k=i+1;
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<i*1+1;j++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			sp--;
		}
	}

}
