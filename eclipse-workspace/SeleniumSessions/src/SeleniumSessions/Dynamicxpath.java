package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://ebay.com");
        //driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("java");
        //driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("java");
		driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("java");
		driver.findElement(By.xpath("//input[starts-with(@id,'gh-ac')]")).sendKeys("java");
		
		//link test
		driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();
		
        driver.quit();
	}

}