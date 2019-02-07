package com.assignments;

import java.util.Scanner;

public class CharacterPercentage {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		char[] ch=s.toCharArray();
	    float low=0, num=0, spl=0, sp=0, up=0;
		int count=ch.length;
		for(int i=0;i<count;i++)
		{
			if(ch[i]>=97 && ch[i]<=123)
				low++;
			else if(ch[i]>=65 && ch[i]<=91)
				up++;
			else if(ch[i]>=48 && ch[i]<=57)
				num++;
			else if(ch[i]==' ')
				sp++;
			else
				spl++;
		}
		System.out.println(low);
		System.out.println("Percentege of lowerCase in the given String is : " + low/count*100 +" %");
		System.out.println("Percentege of UpperrCase in the given String is : " + up/count*100 +" %");
		System.out.println("Percentege of Numbers in the given String is : " + num/count*100 +" %");
		System.out.println("Percentege of Special symbols in the given String is : " + spl/count*100 +" %");
		System.out.println("Percentege of Spaces in the given String is : " + sp/count*100 +" %");
	}

}
