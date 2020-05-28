package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handledropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create?.intl=us&.lang=en-US&src=fpctx&authMechanism=primary&done=https%3A%2F%2Fwww.yahoo.com%2F&eid=100&add=1&specId=yidReg");
		Select select = new Select(driver.findElement(By.id("usernamereg-month")));
        //select.selectByVisibleText("March");
        select.selectByIndex(4);
	}

}
