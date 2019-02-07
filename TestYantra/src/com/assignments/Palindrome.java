package com.assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1= sc.nextLine();
		char[] ch=s1.toCharArray();
		int k=0;
		if(s1.length()>0)
		{
			int count=s1.length();
			for(int i=0,j=count-1;i<count;i++,j--)
			{
				if(ch[i]==ch[j])
					k++;
			}
			if(k==count)
				System.out.println("String is palindrome");
			else
				System.out.println("String is not palindrome");
		}
		else
			System.out.println("String is not palindrome");
				
	}

}
