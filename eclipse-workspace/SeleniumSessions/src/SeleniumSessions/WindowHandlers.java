package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[1]/font[1]/b[1]/a[3]")).click();
		Set <String> handler = driver.getWindowHandles();
		
		Iterator<String> it= handler.iterator();
		
	
		
		String parentWindowId = it.next();
		System.out.println(parentWindowId);
		
		String childWindowId = it.next();
		System.out.println(childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
	}
		
		
		
		

	}


