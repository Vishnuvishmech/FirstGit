package com.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodElement
{
	public static WebElement returnElement(WebDriver driver,String value)
	{
		
		return null;
	}
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		WebElement e= driver.findElement(By.id("_hjRemoteVarsFrame"));
		String v = e.getAttribute("_hjRemoteVarsFrame");
		System.out.println(v);
		driver.close();
	}

}
