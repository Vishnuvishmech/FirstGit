package com.test.yantra;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UrbanLadder 
{

	public static void setExcelData(String str, int i,Sheet sheet) throws Exception 
	{
		Cell cell = sheet.createRow(i).createCell(0);
		cell.setCellValue(str);
	}

	@Test
	public void test() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.urbanladder.com");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Close")).click();
		List<WebElement> menu = driver.findElements(By.className("topnav_itemname"));
		System.out.println(menu.size());
		File path = new File("./data/data.xlsx");
		FileInputStream fis = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.createSheet("Sheet2");
		int i=0;
		for (WebElement e : menu) {
			if (e.getText().length() > 0)
				System.out.println(e.getText());
				setExcelData(e.getText(), i,sheet);
				Thread.sleep(2000);
				e.click();
				Thread.sleep(1000);
				System.out.println();
				List<WebElement> submenu = driver.findElements(By.xpath("//div[@class='subnavlist_wrapper clearfix']/ul/li/ul/li/a/span"));

			for (i = 0; i <submenu.size(); i++)
			{
				if (submenu.get(i).getText().length() > 0)
				{
					System.out.println(submenu.get(i).getText());
					setExcelData(submenu.get(i).getText(), i,sheet);
				}
			}

			System.out.println();

		}
		
		FileOutputStream fout =  new FileOutputStream(path);
		book.write(fout);
		Thread.sleep(3000);
		driver.close();

	}
}