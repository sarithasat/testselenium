package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.Loginpage;

public class ContactpageTest extends TestBase{
	Loginpage loginpage;
	HomePage homepage;
	
	public ContactpageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		init();
		loginpage = new Loginpage();
		
	}
	
	@Test
	public void loginpageTitle()
	{
		String title=loginpage.validateLoginPage();
		Assert.assertEquals("cogmento CRM", title);
	}
	@Test
	public void emaildisplayed()
	{ 
		boolean flag = loginpage.validateemail();
		Assert.assertTrue(flag);
		
	}
	@Test
	public void loginTest()
	{
		homepage=loginpage.login(prop.getProperty("email"),prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
