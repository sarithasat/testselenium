package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		

	}

}