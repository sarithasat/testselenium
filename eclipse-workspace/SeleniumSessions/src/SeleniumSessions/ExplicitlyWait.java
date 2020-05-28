package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		

	}
	
	public static void clickon(WebDriver driver, WebElement locator, int timeout)
	{
		new WebDriver(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator()));
	}


}
