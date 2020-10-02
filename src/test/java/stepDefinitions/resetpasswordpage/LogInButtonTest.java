package stepDefinitions.resetpasswordpage;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utilities.Base_Class;
import utilities.LogInPageObjects;
import utilities.ResetPageObjects;

public class LogInButtonTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	LogInPageObjects lip;
	ResetPageObjects rp;

	@Then("^User is redirected to login page from reset page$")
	public void user_is_redirected_to_login_page_from_reset_page() throws Throwable {
		lip = new LogInPageObjects(driver);
		Assert.assertTrue(lip.getLogInButton().isDisplayed(), "Log In button not found, may not be LogIn page");
	}

	@And("^User clicks on login button from reset page$")
	public void user_clicks_on_login_button_from_reset_page() throws Throwable {
		rp = new ResetPageObjects(driver);
		rp.getLogInButton().click();
	}
}
