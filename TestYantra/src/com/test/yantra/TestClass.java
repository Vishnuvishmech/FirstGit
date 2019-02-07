package com.test.yantra;

import org.testng.annotations.Test;

public class TestClass 
{
	@Test(dataProviderClass=com.test.yantra.DataMain.class , dataProvider="Data")
	public void test(String un,String pw)
	{
		System.out.println(" Un : "+un+" Pw : "+pw);
	}
}
