package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/home");
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("sarithasat@yahoo.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Sathvik09"); 
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		driver.switchTo().frame("mainPanel");
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();

	}

}