package com.store.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {
	//1.first create object of webdriver
	
	WebDriver ldriver;
	
	public indexPage(WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath= "//a[@class=\"login\"]")
	WebElement signin;
	
	public void clickonsignin() {
		
		signin.click();
	}

}
