package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{

		//page Factory or object rep
	@FindBy(name="firstname")
	//driver.findElement(By.name("email")).sendKeys("test");
	WebElement firstname;
	
	@FindBy(name="lastname")
	WebElement lastname;

	@FindBy(submit="submit")
	WebElement submit;
		public void Contactpage() {
			PageFactory.initElements(driver, this);
		}
		public void createContact(String title,string fn,String ln,String submit) {
			Select select= new Select(driver.findElement(By.className("title")));
			select.selectByVisibleText(title);
			firstname.sendKeys(fn);
			lastname.sendkeys(ln);
			submit.click();
			
		}
		
}
