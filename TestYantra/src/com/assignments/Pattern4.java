package com.assignments;

public class Pattern4 {

	public static void main(String[] args) 
	{
		int r=5;  int k=r;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				if(i==j||i+j==r-1)
				System.out.print(k);
				else
					System.out.print(" ");
			}
			System.out.println();
			k--;
		}
	}

}
