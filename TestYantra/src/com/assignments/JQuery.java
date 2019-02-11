package com.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class JQuery 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider/");
		WebElement frame = driver.findElement(By.xpath("//div[@id='content']//iframe"));
		driver.switchTo().frame(frame);
		WebElement fslider = driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions act = new Actions(driver);
		for(int i=0;i<101;i+=10)
		{
			act.clickAndHold(fslider).moveByOffset(i, 0).perform();
		}
		
		for(int i=100;i>0;i-=10)
			{
				act.clickAndHold(fslider).moveByOffset(-i, 0).perform();
			}	
	}
}


