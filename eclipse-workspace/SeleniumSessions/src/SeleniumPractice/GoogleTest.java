package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://google.com");
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
    @Test
    public void googleTitle()
    {
    	
    	String title=driver.getTitle();
    	System.out.println(title);
    	
    		
    }
    @Test(priority=1, groups="Title")
    public void googleLogoTest(){
    	
    	boolean a=driver.findElement(By.xpath("logo-doodle-iamge")).isDisplayed();
    	System.out.println(a);
    }
   
    @Test(priority=2, groups="Title")
    public void googlesearch(){
    	
    	 driver.findElement(By.id("fakebox-input")).sendKeys("testing");
    }
}
