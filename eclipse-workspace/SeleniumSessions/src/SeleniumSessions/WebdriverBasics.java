package SeleniumSessions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class WebdriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.ff browser
		//gecodriver
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\makka\\Downloads\\geckodriver2.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		qWebDriver driver = new HtmlUnitDriver();
		driver.get("http://google.com");
		String s= driver.getTitle();
		System.out.println(s);
		if(s.equals("google"))
		{
			System.out.println("correct title");
			
		}
		else
			System.out.println("incorrect");

	       driver.quit();
	
		
	}
	
}
