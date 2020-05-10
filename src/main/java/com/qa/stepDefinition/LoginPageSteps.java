package com.qa.stepDefinition;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;

	@Given("^user is on Login Page$")
	public void user_is_on_Login_Page() {
		TestBase.initialization();
	}

	@When("^title of login page is Orange HRM$")
	public void title_of_login_page_is_Orange_HRM() {
		loginpage = new LoginPage();
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals("OrangeHRM", title);
	}

	@Then("^the use logs into the application$")
	public void user_enter_username_and_password() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}


	@Then("^validate home page title$")
	public void validate_home_page_title() {
		String homePageTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals("OrangeHRM", homePageTitle);
	}
	
	@Then("^logout from the application$")
	public void logout_from_the_application() {
	    homepage.logout();
	}

}
