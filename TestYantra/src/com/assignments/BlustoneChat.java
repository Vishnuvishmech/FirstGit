package com.assignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlustoneChat {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		driver.switchTo().frame("wiz-iframe");
		driver.findElement(By.xpath("//span[@class='CT_BannerClose']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame("livechat-compact-view");
		driver.findElement(By.xpath("//a[@id='full-view-button']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("livechat-full-view");	
		driver.findElement(By.id("name")).sendKeys("Vishnu Vardhan");
		driver.findElement(By.id("email")).sendKeys("vishnuvishmec@gmail.com");
		driver.findElement(By.id("container_4_4")).sendKeys("9606665454");
		driver.findElement(By.xpath("//input[@value='Start the chat']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("livechat-full-view");
		WebElement e = driver.findElement(By.xpath("//table[@id='content']/tbody/tr/following::tr[@id='textarea']/td/span/span/a"));
		e.click();
		e.sendKeys("Hello Bluestone");
	}

}
