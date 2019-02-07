package com.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromText {

	public static void main(String[] args) 
	{
		try 
		{
	         File file = new File("./text/data.txt");
	         Scanner sc = new Scanner(file);
	         while (sc.hasNextLine()) 
	         {
	           System.out.println(sc.nextLine());
	         }
	         sc.close();
	    } 
		catch (FileNotFoundException e) 
			{
	         e.printStackTrace();
			}
	}
}
