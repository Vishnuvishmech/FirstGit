package com.assignments;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		String win = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> handles = driver.getWindowHandles();
		handles.remove(win);
		Iterator<String> tab = handles.iterator();
		while(tab.hasNext())
		{
			String v = tab.next();
			driver.switchTo().window(v);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='from']")).sendKeys("BANGALORE (BLR)");;
//		driver.findElement(By.xpath("")).sendKeys("DELHI");
		driver.findElement(By.xpath("//input[@name='optradio' and @id='tripTyper']")).click();
		driver.findElement(By.xpath("(//div [@class='date-wrapper'] /div/span/span)[1]")).click();
		String day = driver.findElement(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/following::tr/td/following::td/following::td/span[@class='act active-red']")).getText();
		System.out.println(day);
		String month = driver.findElement(By.xpath("(//div[@class='date-table-right']/table/tbody/tr/td/span)[1]")).getText();
		System.out.println(month);
		String year = driver.findElement(By.xpath("(//div[@class='date-table-right']/table/tbody/tr/td/span/following::sub)[1]")).getText();
		System.out.println(year);
		
		LocalDate date= LocalDate.now();
		Month mon = date.getMonth();
		String edate = date.toString();
		System.out.println(edate);
		
		if(day.length()==1)
			day=0+day;
		
		String adate=year+"-"+getMonth(month)+"-"+day;
		System.out.println(adate);
		
		if(edate.equals(adate))
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		driver.findElement(By.xpath("(//div[@class='date-wrapper'] /div/span/span)[2]")).click();
		Thread.sleep(2000);
		String newdate = date.plusMonths(1).toString();
		System.out.println(newdate);
		driver.findElement(By.xpath("(//div[@class='date-wrapper'] /div/span/span)[2]")).click();
		String subdate = newdate.substring(5,7 );
		String x1 = getFullMonth(subdate);
		System.out.println(x1);
		String xpath = "(//div[@class='date-table-right']/table/tbody/tr/td/span[text()='"+x1+"'])[1]/following::span";
		Thread.sleep(3000);
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static String getMonth(String v)
	{
		switch(v)
		{
		case "JANUARY" :
			return "01";
		
		case "FEBRUARY" :
		
			return "02";
		
		}
		return "0";
	}
	
	public static String getFullMonth(String name)
	{
		switch(name)
		{
		case "01" :
			return "January";
		case "02" :
			return "February";
		case "03" :
			return "March";
		}
		return "";
	}
}
