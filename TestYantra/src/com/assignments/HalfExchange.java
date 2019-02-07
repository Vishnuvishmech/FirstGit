package com.assignments;

import java.util.Scanner;

public class HalfExchange 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int i= sc.nextInt();
		int size = count(i);
		exchange(i, size);
		
	}
	
	public static void exchange(int num,int size)
	{
		int[] n= new int[size];
		int[] m=new int[size];
		int i=0;
		while(num>0)
		{
			int temp=num%10;
			num=num/10;
			n[i++]=temp;
		}
		
		for(int j=n.length-1, k=0;j>=0;j--,k++)
		{
			m[k]=n[j];
		}
		
		int x=0;
		for(int j=0;j<n.length;j++)
		{
			if(j>=size/2)
			{
				
				x=x*10;
				x= m[j]+x  ;
				
			}
		}
		for(int j=0;j<n.length;j++)
		{
			 if(j<size/2)
			{
				
				x=x*10;
				x= m[j]+x;
			}
//			
			
		}
		System.out.println("reversed number is");
		System.out.println(x);
		
		
	}
	
	public static int count(int i)
	{
		int count=0;
		while(i>0)
		{
			int temp=i%10;
			i=i/10;
			count++;
		}
		return count;
	}
	
}
