package stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginDefinition {
	
	WebDriver driver;
	
	@Given("^User is at Home Page$")
	public void user_is_at_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yatinp\\Documents\\Yatin\\chromedriver_win32\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://172.16.1.97/QA12WH4103S/xmHarmony.asp");
	}

	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_username_and_password(String uname, String pass) throws Throwable {
		//driver.findElement(By.id("TXTUSERID")).sendKeys(uname);
		//driver.findElement(By.id("TXTPWD")).sendKeys(pass);
		loginPage lp=new loginPage();
		
	}

	@When("^User clicks on submit$")
	public void user_clicks_on_submit() throws Throwable {
		//driver.findElement(By.id("login")).click();
	}

	@Then("^User should be navigated to home page$")
	public void user_should_be_navigated_to_home_page() throws Throwable {
		System.out.println("Test");
	}

}
