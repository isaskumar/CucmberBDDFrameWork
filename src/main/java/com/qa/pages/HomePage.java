package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {


	@FindBy(xpath="//a[@id='welcome']")
	WebElement profile;

	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logout;


	//initializing the page object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}


	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public void logout() {
		profile.click();
		logout.click();		
	}

}
