package com.store.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountCreationDetails {
	
WebDriver ldriver;
	
	public accountCreationDetails(WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	
//1
	@FindBy(id= "//input[@id='id_gender1']")
	WebElement titlemr;
	
	//2
	@FindBy(id= "//input[@id='customer_firstname']")
	WebElement firstname;
	
	//3
	@FindBy(id= "//input[@id='customer_lastname']")
	WebElement lastname;
	
	//4
	@FindBy(id= "//input[@id='passwd']")
	WebElement password;
	
	
	//5
	@FindBy(id= "//input[@id='firstname']")
	WebElement Addfirstname;
	
	//6
	@FindBy(id= "//input[@id='lastname']")
	WebElement Addlastname;
	
	//7
	@FindBy(id= "//input[@id='address1']")
	WebElement address;
	
	//8

	@FindBy(id= "//input[@id='city']")
	WebElement addcity;
	
	
 //9
	@FindBy(id= "//select[@id='id_state']")
	WebElement addstate;
	
	
	//10
	@FindBy(id= "//input[@id='postcode']")
	WebElement zippostal;
	
	//11
	@FindBy(id= "//select[@id='id_country']")
	WebElement addcountry;
	
	
	//12
	@FindBy(id= "//input[@id='phone_mobile']")
	WebElement addmobile;
	
	
	//13
	@FindBy(id= "//input[@id='alias']")
	WebElement addalice;
	
	//14
	@FindBy(xpath= "//span[normalize-space()='Register']")
	WebElement btn;
	
	
	//1
	public void mrselect()
	{
		titlemr.click();
		
	}
	
	//2
	public void firstame(String fname) {
		firstname.sendKeys(fname);
	}
	
	//3
public void lastname(String lname) {
		lastname.sendKeys(lname);
	}
	
//4
public void passw(String pass) {
	password.sendKeys(pass);
}

//5	
public void addfirstame(String fname1) {
	Addfirstname.sendKeys(fname1);
}

//6
public void addlastame(String lname1) {
	Addlastname.sendKeys(lname1);
}

	//7
public void address(String add) {
	address.sendKeys(add);
}

//8
public void cityaddress(String cityadd) {
	addcity.sendKeys(cityadd);
}
//9
public void stateaddress(String stateadd) {
	addstate.sendKeys(stateadd);
}

//10
public void zipaddress(String zipadd) {
	zippostal.sendKeys(zipadd);
}


//11
public void countrydress(String countryadd) {
	addcountry.sendKeys(countryadd);
}


//12
public void mobiledress(String mobileadd) {
	addmobile.sendKeys(mobileadd);
}


//13
public void alicedress(String aliceadd) {
	addalice.sendKeys(aliceadd);
}

//14

public void btnadress() {
	btn.click();
}



















}

