package com.extent.reports;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DemoExtentReport 
{
	ExtentReports report = new ExtentReports();	
	ExtentTest test = report.createTest("Test");
	
	@Test
	public  void Test()
	{
		ExtentHtmlReporter rep= new ExtentHtmlReporter("C:\\Users\\HP\\git\\repositoryX\\TestYantra\\reports\\rep.html");
		rep.config().setDocumentTitle("First Extent report");
		rep.config().setReportName("Smoke report");rep.config().setTheme(Theme.DARK);

		report.attachReporter(rep);
		report.setSystemInfo("Tester Name", "VISHNU");
		System.out.println("Hello");
		
		test.log(Status.INFO, "Running Extent report");

		
	}
	
	
	@AfterMethod
	public void AfterMeth(ITestResult i)
	{
		if(i.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Test is passed");
			report.flush();
		}
		else
		{
			test.log(Status.FAIL, "Test is failed");
			report.flush();
		}
	}

}
