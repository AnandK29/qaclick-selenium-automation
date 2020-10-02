package stepDefinitions.loginpage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.Base_Class;
import utilities.LogInPageObjects;
import utilities.ResetPageObjects;

public class ForgotPasswordButtonTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	ResetPageObjects rp;
	LogInPageObjects lip;

	@Then("^User is redirected to reset password page$")
	public void user_is_redirected_to_reset_password_page() throws Throwable {
		rp = new ResetPageObjects(driver);
		Assert.assertTrue(rp.getMainSectionHeading().getText().equalsIgnoreCase(rp.mainSectionHeadingText),
				"Reset password page main section heading mis-match");
	}

	@And("^User clicks on forgot password button$")
	public void user_clicks_on_forgot_password_button() throws Throwable {
		lip = new LogInPageObjects(driver);
		lip.getForgotPasswordButton().click();
	}

	@And("^Email field is displayed on reset password page$")
	public void email_field_is_displayed() throws Throwable {
		Assert.assertTrue(rp.getEmailEditBox().isDisplayed(), "email edit box not displayed");
	}

	@And("^reset password page title is \"([^\"]*)\"$")
	public void something_page_title_is_something(String pageTitle) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(pageTitle), "Page Title not mstching with expected text");
	}
}
