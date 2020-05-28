package SeleniumSessions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

import javaScriptExecutor;

public class CalendarByjs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
		//WebDriver driver= new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/");
        WebElement date=  driver.findElement(By.id("id"));
        String dateval ="30-12-2017";
        selectDateByJS(driver,date,dateval);
        
        

	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateval)
	{
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','" +dateval+"');",element);
	}

}
