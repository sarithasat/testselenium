package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

public class Headlessbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
		//WebDriver driver= new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/");
        Actions action =new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Visa Services')]")).click();    		
        driver.quit();
	}

}
