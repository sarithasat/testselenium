package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&dsh=S-1643952078%3A1590279236349104&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		//xpath
		//driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("test");
		//driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("last1");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("last1test");
		//driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Sathvik09");
		//driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Sathvik09");
		//driver.findElement(By.xpath("//span[@class='CwaK9']")).click();
		
		
		
		//by id:-1
		//driver.findElement(By.id("firstName")).sendKeys("test1");
		//by name-3
		//driver.findElement(By.name("lastName")).sendKeys("last1");
		//by class
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("testsdf");
		//by link
		//driver.findElement(By.linkText("Sign in instead")).click();
		//bycssSelector-2(#id), (.className)
		//driver.findElement(By.cssSelector("#firstName")).sendKeys("test1");
		//by partiallinkText
		
		driver.quit();
		
		
		
	

	}

}
