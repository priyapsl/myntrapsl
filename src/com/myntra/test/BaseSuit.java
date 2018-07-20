package com.myntra.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseSuit {

	private static  WebDriver driver = null;
	
	
	
	@BeforeTest
	public void prestart()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/");
	}
	
	
	@AfterTest
	public void tearDown(){
		
		driver.close();
		driver.quit();
	}

	
	public static WebDriver getDriver(){
		
		 return driver;
	}

}
