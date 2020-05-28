package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	
	@Test
	public void yahooLoginTest() {
		System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
		driver =new ChromeDriver();
		driver.get("http://yahoo.com");
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='login-signin']]")).click();
		 
		
		
	}

}
