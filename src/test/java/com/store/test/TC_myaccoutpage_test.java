package com.store.test;

import org.testng.annotations.Test;

import com.store.page.account;
import com.store.page.accountCreationDetails;
import com.store.page.indexPage;

public class TC_myaccoutpage_test extends BaseClass{
	@Test
	public void varifyragistration()
	{
		
		//open url
		driver.get(url);
		
		//click on signin
		indexPage pg=new indexPage(driver);
		pg.clickonsignin();
		
		account acc= new account(driver);
			acc.enterEmailAddress("sa1234@gmail.com");
		acc.clickSubmit();
				
		accountCreationDetails acr =new accountCreationDetails(driver);
		acr.firstame("saurabh");
		
		
		
	}

}
