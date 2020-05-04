package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	/*WebDriver driver;

	@Given("^user is on Login Page$")
	public void user_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\semmalai\\eclipse-workspace\\BDDFramework\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^title of login page is Orange HRM$")
	public void title_of_login_page_is_Orange_HRM() {
		String title = driver.getTitle();
		Assert.assertEquals("OrangeHRM", title);
	}

	@Then("^user enter \"(.*)\" and \"(.*)\"$")
	public void user_enter_username_and_password(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^user is on HomePage$")
	public void user_is_on_HomePage() {
		String welcomeMsg = driver.findElement(By.xpath("//a[@id='welcome']")).getText();
		Assert.assertEquals("Welcome Admin", welcomeMsg);
	}


	@Given("^user is already on home page$")
	public void user_is_already_on_home_page() throws InterruptedException {
		Thread.sleep(2000);
		String home_title = driver.getTitle();
		System.out.println(home_title);
	}

	@When("^user is click on profile menu$")
	public void user_is_click_on_profile_menu() {
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
	}

	@Then("^user is click on logout button$")
	public void user_is_click_on_logout_button() {
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}

	@Then("^verify application landing page$")
	public void verify_application_landing_page() {
		driver.findElement(By.id("txtUsername")).isEnabled();
	}
	
	@Then("^user moves to admin page$")
	public void user_moves_to_admin_page() throws InterruptedException{
	  driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	  Thread.sleep(2000);
	}

	@Then("^user enters the \"([^\"]*)\"$")
	public void user_enter(String empName)  {
	  driver.findElement(By.xpath("//input[@id='searchSystemUser_employeeName_empName']")).sendKeys(empName);
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.close();
	}*/






}
