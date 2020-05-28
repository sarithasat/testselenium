package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {//webelements and methods
	
	//pageFactory
	@FindBy(name= "username");
	WebElement username;
	
	//initilithe page objects:
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	//validate the other methods and click
	

}
