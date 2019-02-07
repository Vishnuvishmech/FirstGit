package com.assignments;

import java.util.Scanner;

public class ImmediateSwap {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int size=count(num);
		int[] n=new int[size];
		int[] m=new int[size];
		
		int a=0;
		while(num>0)
		{
			int temp=num%10;
			num=num/10;
			n[a++]=temp;
		}
		
		for(int i=m.length-1,j=0;i>=0;i--,j++)
		{
			m[j]=n[i];
			
		}
		
		for(int i=0;i<m.length;i+=2)
		{
			swap(i,i+1,m);
			
		}
		int temp=0;
		for(int i=0;i<m.length;i++)
		{
			temp=temp*10;
			temp=temp+m[i];
		}
		System.out.println(temp);
		
	}
	
	public static void swap(int i,int j,int[] m)
	{
		int temp=m[i];
		m[i]=m[j];
		m[j]=temp;
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
