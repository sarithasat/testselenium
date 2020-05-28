package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
  System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	Actions action= new Actions(driver);
	action.clickAndHold(driver.findElement(By.id("draggable"))).
	moveToElement(driver.findElement(By.id("droppable"))).
	release().
	build().
	perform();
	
  driver.quit();
}
}