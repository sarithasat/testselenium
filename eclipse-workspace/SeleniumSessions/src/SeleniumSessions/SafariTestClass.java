package SeleniumSessions;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.*;
public class SafariTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new SafariDriver();
		driver.get("http://google.com");
		

	}

}
