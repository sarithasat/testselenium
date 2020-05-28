package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://ebay.com");
		
		//get the total count of link
		List <WebElement> linkList=driver.findElements(By.tagName("a"));
		//size of linklist
		
		System.out.println(linkList.size());
		
		for(int i=0; i<linkList.size();i++)
		{
			String link=linkList.get(i).getText();
			System.out.println(link);
		}

	}

}