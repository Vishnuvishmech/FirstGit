package com.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAuto {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.gmail.com");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("vishnuvishmech@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']/following::div[@class='daaWTb']/preceding::span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("08232224402");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']/following::div[@class='daaWTb']/preceding::span[@class='RveJvd snByac']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@role='checkbox']")).click();
		String v= driver.findElement(By.id(":2j")).getText();
		if(v=="Primary")
		{
			 
		}
		else
		{
			driver.findElement(By.id(":2j")).click();
		}
	}

}
