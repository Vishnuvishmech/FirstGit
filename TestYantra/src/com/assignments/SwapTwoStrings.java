package com.assignments;

public class SwapTwoStrings 
{
	public static void main(String[] args) 
	{
		String s1 = new String("Hai");
		int i= s1.length();
		String s2 = new String("Manga");
		int j= s2.length();
		System.out.println("S1 : "+s1);
		System.out.println("S2 : "+s2);
		s1= s1+s2;
		s2=s1.substring(0,i);
		s1= s1.substring(i,i+j );
		System.out.println("After swaping");
		System.out.println("S1 : "+s1);
		System.out.println("S2 : "+s2);
	}
}
