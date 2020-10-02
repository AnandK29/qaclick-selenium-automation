package stepDefinitions.landingpage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.Base_Class;
import utilities.LandingPageObjects;
import utilities.SignUpPageObjects;

public class NavigateToRegisterPageTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	LandingPageObjects lp = new LandingPageObjects(driver);;
	SignUpPageObjects sp = new SignUpPageObjects(driver);

	@When("^User clicks on register button$")
	public void user_clicks_on_register_button() throws Throwable {
		lp.getRegisteButton().click();
	}

	@Then("^User is redirected to registration page$")
	public void user_is_redirected_to_registration_page() throws Throwable {
		// sp = new SignUpPageObjects(driver);
		Assert.assertTrue(sp.getSignUpButton().isDisplayed(), "sign up button not found, may not be register page");
	}

	@And("^Register button is displayed$")
	public void register_button_is_displayed() throws Throwable {
		lp.getRegisteButton().isDisplayed();
	}

	@And("^signup page title is \"([^\"]*)\"$")
	public void signup_page_title_is_something(String pageTitle) throws Throwable {
		Assert.assertEquals(driver.getTitle(), pageTitle);
	}
}
