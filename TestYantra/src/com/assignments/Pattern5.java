package com.assignments;

public class Pattern5 {

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
			
			for(int j=0;j<i*2+1;j++)
			{
				if(j==0||j==i*2)
				System.out.print(k);
				else
					System.out.print(" ");
			}
			
			System.out.println();
			k++;
			sp--;
		}
	}

}
