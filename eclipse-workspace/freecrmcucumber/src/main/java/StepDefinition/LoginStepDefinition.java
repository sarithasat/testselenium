package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition extends TestBase {
 
	LoginPage loginpage =new LoginPage();
	/*@Given("User is already on Login Page")
	public void user_already_on_loginpage(){
		System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
		driver= new ChromeDriver();
		driver.get("http://freecrm.com");
		
	}*/
	@Given("User is already on Login Page")
	public void user_already_on_loginpage(){
		TestBase.initilization();
	}
	@When("title of the login page is CRMPage")
	public void title_of_the_page() {
		String title=loginpage.validatingloginpage();
		
		//String title= driver.getTitle();
		Assert.assertEquals("FreeCRM",title);
	}
	@Then("User Enters UserName and Password")
	public void UsernameandPassword()
	{driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("sarithasat@yahoo.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Sathvik09"); 
		
	}
	@Then("User Clicks Login Button")
	public void submit()
	{
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}
	@And("user is on homepage")
	public void homepage() {
		System.out.println("homepage");
	}
}
