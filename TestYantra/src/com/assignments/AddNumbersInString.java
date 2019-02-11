package com.assignments;

public class AddNumbersInString {

	public static void main(String[] args) 
	{
		String str1= "abd123dnd55ns4";
		char[] arr = str1.toCharArray();
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isDigit(arr[i]))
			{
				
				sum=sum+Integer.parseInt(arr[i]+"");
				
			}
		}
		System.out.println(sum);
	}

}
