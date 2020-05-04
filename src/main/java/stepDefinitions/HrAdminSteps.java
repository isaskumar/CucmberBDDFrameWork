package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HrAdminSteps {
	
	WebDriver driver;

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

	@Then("^user enter username and password$")
	public void user_enter_username_and_password(DataTable userDetails) {
		List<List<String>> info =  userDetails.raw();
		driver.findElement(By.id("txtUsername")).sendKeys(info.get(0).get(0));
		driver.findElement(By.id("txtPassword")).sendKeys(info.get(0).get(1));
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
	
	@Then("^user moves to admin page$")
	public void user_moves_to_admin_page() throws InterruptedException{
	  driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	  Thread.sleep(2000);
	}

	@Then("^user enters the employeename$")
	public void user_enter(DataTable data)  {
		List<List<String>> employee =  data.raw();
	  driver.findElement(By.xpath("//input[@id='searchSystemUser_employeeName_empName']")).sendKeys(employee.get(0).get(0));
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.close();
	}

}
