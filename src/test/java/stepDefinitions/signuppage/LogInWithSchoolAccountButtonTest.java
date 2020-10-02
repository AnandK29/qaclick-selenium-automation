package stepDefinitions.signuppage;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.Base_Class;
import utilities.LogInPageObjects;
import utilities.SignUpPageObjects;

public class LogInWithSchoolAccountButtonTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	SignUpPageObjects sp;
	LogInPageObjects lip;

	@Then("^User redirected to login page$")
	public void user_redirected_to_login_page() throws Throwable {
		Assert.assertTrue(sp.getLogInMainSectionHeading().getText().contains(sp.logInPageHeading),
				"user not redirected to login page");
	}

	@And("^User click on Log In with a School Account button$")
	public void user_click_on_log_in_with_a_school_account_button() throws Throwable {
		sp = new SignUpPageObjects(driver);
		sp.getLogInWithSchoolAccountButton().click();
	}

	@And("^Login fields are displayed$")
	public void login_fields_are_displayed() throws Throwable {
		lip = new LogInPageObjects(driver);
		Assert.assertTrue(lip.getEmailTextBox().isDisplayed(), "email field not displayed");
		Assert.assertTrue(lip.getPasswordTextBox().isDisplayed(), "password field not displayed");
	}
}
