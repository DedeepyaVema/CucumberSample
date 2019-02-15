package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	public static WebDriver driver;
	/*@Given("^User is at google page$")
	public void user_is_at_google_page() throws Throwable {
		 System.setProperty("webdriver.ie.driver", "C:\\Users\\S.Addepalli\\Desktop\\jars\\seleniumjars\\IEDriverServer.exe");
		   driver=new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		throw new PendingException();
	} */
	
	@Given("^User is at home page$")
	 public void user_is_at_home_page() throws Throwable {
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "C:\\Users\\S.Addepalli\\Desktop\\jars\\seleniumjars\\IEDriverServer.exe");
	        driver=new InternetExplorerDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://localhost:9018/LoginApplication/");
	        throw new PendingException();
	 }
	 @When("^user clicks Login link$")
	 public void user_clicks_Login_link() throws Throwable {
	 driver.findElement(By.xpath(".//*[@id='index.jsp']/a")).click();
     throw new PendingException();
	 }
	 
	 @When("^provides the username, password and submit$")
	 public void provides_the_username_password_and_submit() throws Throwable {
	 driver.findElement(By.id("log")).sendKeys("Deep8594"); 
	     driver.findElement(By.id("pwd")).sendKeys("Deepa");
	     driver.findElement(By.id("login")).click();
	        throw new PendingException();
	 }
	 
	 @Then("^welcome message is displayed$")
	 public void welcome_message_is_displayed() throws Throwable {
	 System.out.println("Login Successful for the given user");
     throw new PendingException();
	 //driver.quit();
	 }
}
