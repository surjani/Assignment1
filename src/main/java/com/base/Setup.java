package com.base;

import Utility.DriverFactory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Setup {
	public WebDriver driver;
	public static String url;
	public  static String browser;
	
	
	@BeforeSuite
	public void setUpEnv() throws IOException {
		FileReader reader=new FileReader("env.properties");
		Properties p=new Properties();
		p.load(reader);
		url=p.getProperty("test.url");
		browser=p.getProperty("browser");

	}

	@BeforeClass
	public void setUp() throws IOException {
		System.out.println(url+browser);
		driver = DriverFactory.startApp(driver,url,browser);
	}

	/*@AfterClass
	public void tearDown() {
		//DriverFactory.tearDown(driver);

	}*/
	
	@AfterMethod
	public void FailedTestCases(ITestResult result) throws IOException {
		if (!result.isSuccess()) {		
		String name=result.getMethod().getMethodName()+" "+new SimpleDateFormat("MM-dd-yyyy-HH-ss").format(new GregorianCalendar().getTime());
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(".//"+name+".png");
			FileUtils.copyFile(SrcFile, DestFile);
		}
	}

}
