package com.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Blustones0Percent
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		WebElement ele = driver.findElement(By.xpath("//nav[@class='wh-navbar']/ul/li/following::li[@class='menuparent offers-menuparent pull-right']/a"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		String xp= "//span[@data-p='offers-100mc,m']";
		String v = driver.findElement(By.xpath(xp)).getText();
		driver.findElement(By.xpath(xp)).click();
		System.out.println(v);
		List<WebElement> num = driver.findElements(By.xpath("//span[@class='offers-wrapper']"));
		int count=0;
		for(int i=0;i<num.size();i++)
		{
			if(v.equalsIgnoreCase(num.get(i).getText()))
			{
				count++;
			}
		}
		
		if(num.size()==count)
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
		
		driver.close();
	}

}
