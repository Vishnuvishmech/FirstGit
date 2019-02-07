package com.assignments;

public class RepeatedAndNonrepeated {

	public static void main(String[] args)
	{
		String str="Heello";
		char[] ch= str.toCharArray();
		int rep =0;
		int nonrep=0;
		int i=0;
		for(i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					rep++;
				}
			 if(ch[i]!=ch[j])
				{
					nonrep++;
				}
					
				
			}
			
		}
		if(rep>0)
		{
			print(ch[i]);
			
		}
		if(nonrep>0)
			
			System.out.println("First non repeated character is : "+ch[i]);
		
		
		
	}
	
	public static void print(char c)
	{
		System.out.println("First repeated character is : "+ c);
	}

}
