package com.assignments;

import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String ");
		String s1=sc.next();
		System.out.println("Enter the Second String ");
		String s2=sc.next();
		if(s1.length()==s2.length())
		{
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				for(int j=s1.length()-1;j>=0;j--)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						count++;
					}
				}
			}
			
			if(count==s1.length())
				System.out.println("Strings are Anagram to each other");
			else
				System.out.println("Strings are not Anagram");
		}
			else
				System.out.println("Strings are not Anagram");
	}
	
}
