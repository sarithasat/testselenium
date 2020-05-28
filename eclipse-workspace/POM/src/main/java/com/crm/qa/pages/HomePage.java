package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath="//a[contains(text(),'Contacts;)]")
	WebElement contacts;
	@FindBy(xpath="//a[contains(text(),'Deals;)]")
	WebElement Deals;

	public void clickOnNewContacts() {
		Actions actions =new Actions(driver);
		actions.moveToElement(contacts).build().perform();
		
	}

	
}
