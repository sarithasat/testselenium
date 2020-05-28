package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Loginpage extends TestBase {
	
	//page Factory or object rep
	@FindBy(name="email")
	//driver.findElement(By.name("email")).sendKeys("test");
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUp;
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPage()
	{
		return driver.getTitle();
	}
	
	public boolean validateemail()
	{
		return email.isDisplayed();
	}
	
	public HomePage login(String un, String pwd)
	{
	    email.sendKeys(un);	
	    password.sendKeys(pwd);	
	    loginBtn.click();
	    return new HomePage();
	}
}
