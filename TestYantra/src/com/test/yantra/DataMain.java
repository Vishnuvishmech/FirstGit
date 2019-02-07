package com.test.yantra;

import org.testng.annotations.DataProvider;

public class DataMain 
{
	@DataProvider(name="Data")
	public static String[][] getData()
	{
		String str[][]= new String[2][2];
		str[0][0]="a";
		str[0][1]="b";
		str[1][0]="c";
		str[1][1]="d";
		return str;
	}
}

