package com.test.yantra;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestCase 
{
	public static  String readExcelData(String str) throws Exception
	{
		File path = new File("./data/TestCase.xlsx");
		FileInputStream fis = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		String v="";
		int index=0;
		for(int i=0;i<5;i++) 
		{
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			v = cell.getStringCellValue();
			if(v.equals(str))
			index=i;
		}
		
			Row row = sheet.getRow(index);
			Cell cell = row.getCell(1);
			v = cell.getStringCellValue();
			return v;
	}
	
	public static void main(String[] args) throws Exception 
	{
		System.out.println(readExcelData("TC2")); 
		
		
	}
}
