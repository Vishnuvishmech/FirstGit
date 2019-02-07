 package com.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BlueStone4 {
    
	@BeforeTest
	public void sProperty()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public static void test() throws Throwable {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.switchTo().frame("wiz-iframe");
		driver.findElement(By.className("CT_BannerClose")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//form[@id='searchbox_elastic_search']/input[@id='search_query_top_elastic_search']")).sendKeys("rings");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@id='searchbox_elastic_search']/input[@name='submit_search']")).click();
		act.moveToElement(driver.findElement(By.xpath("//aside[@class='filters-container']/descendant::span[@class='title style-fill i-right']/span"))).perform();
		String text = driver.findElement(By.xpath("//aside[@class='filters-container']/descendant::span[@class='title style-fill i-right']/following::div[@class='bs-tt bs-tt-tl bs-tt-sq bs-tt-blue active']/descendant::span[@class='prcs-dlh']/descendant::span/following-sibling::span/following-sibling::span[1]")).getText();
		System.out.println(text);
	}

}
