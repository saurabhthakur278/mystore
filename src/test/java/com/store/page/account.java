package com.store.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class account {
WebDriver ldriver;
	
	public account(WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(id= "email_create")
	WebElement createEmailId;
	
	@FindBy(id= "SubmitCreate")
	WebElement SubmitCreate;
	
	public void enterEmailAddress(String emailAdd) {
		
		createEmailId.sendKeys(emailAdd);
	}
	
 public void clickSubmit() {
	 
	 SubmitCreate.click();
 }

}
