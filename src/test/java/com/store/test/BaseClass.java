package com.store.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;

import com.mystore.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	
	ReadConfig readConfig= new ReadConfig();
	
	
	String url= readConfig.getbaseUrl();
	String browser= readConfig.getbrowser();
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		
		switch (browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
			
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;
			
		

		default:
			driver=null;
			
			break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
	}
	//@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	
}
