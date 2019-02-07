package com.test.yantra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Craftsvilla {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.craftsvilla.com");
		Thread.sleep(3000);
		List<WebElement> main = driver.findElements(By.xpath("//a[span[@class='first_arrow icon']]"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		for(int i=0;i<main.size();i++)
		{
			Thread.sleep(1000);
			act.moveToElement(main.get(i)).perform();
			List<WebElement> main2 = driver.findElements(By.xpath("//a[div[@class='visible-xs acc-arrow']]"));
			for(int j=0;j<main2.size()-1;j++)
			{
				String v = main2.get(j).getText();
				if(v.length()>0)
				System.out.println(v);
				
				List<WebElement> main3 = driver.findElements(By.xpath("//li[a[@href='#']]/ul/li/a"));
				for(int k=0;k<15;k++)
				{
					String v1 = main2.get(k).getText();
					if(v1.length()>0)
					System.out.println(v1);
				}
				
			}
			
			
		}
		
		
		
		
		
	}

}
