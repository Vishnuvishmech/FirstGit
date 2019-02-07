package com.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Rings']"))).build().perform();
		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.xpath("(//a[text()='Diamond'])[1]"))).perform();
		driver.findElement(By.xpath(("//a[@title='Diamond Rings']"))).click();
		
		List<WebElement> rings = driver.findElements(By.xpath("//div[@id='grid-view-result']/ul/li/div/div/div/following::span/span/span/span[@class='new-price']"));
		for(int i=0;i<rings.size();i++)
		{
			String v = rings.get(i).getText();
			System.out.println(v);
		}
		
		a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Popular')]"))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='view-sort-by']/div/following::div/following::div/a")).click();
		Thread.sleep(3000);
		List<WebElement> rings1 = driver.findElements(By.xpath("//div[@id='grid-view-result']/ul/li/following::li[@data-position='3']/div/div/div/following::span/span/span/span"));
		System.out.println("-----------------------------");
		for(int i=0;i<rings1.size();i++)
		{
			if(rings1.get(i).getText().length()>3)
			{
				String v = rings1.get(i).getText();
				System.out.println(v);
			}
			
		}
	}

}
