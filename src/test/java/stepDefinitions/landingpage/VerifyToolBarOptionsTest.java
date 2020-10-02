package stepDefinitions.landingpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utilities.Base_Class;
import utilities.LandingPageObjects;

public class VerifyToolBarOptionsTest {
	WebDriver driver = Base_Class.dr;
	LandingPageObjects lp;

	@Then("^Verify phone number and mail id are visible on tool bar$")
	public void verify_phone_number_and_mail_id_are_visible_on_tool_bar() throws Throwable {
		lp = new LandingPageObjects(driver);
		Assert.assertTrue(lp.getTeleNumberLink().isEnabled(), "phone number not intractable");
		Assert.assertTrue(lp.getMailLink().isDisplayed(), "mail id not displayed on landing page");
	}

	@And("^Register and Login button are visible on tool bar$")
	public void register_and_login_button_are_visible_on_tool_bar() throws Throwable {
		lp = new LandingPageObjects(driver);
		Assert.assertTrue(lp.getRegisteButton().isDisplayed(), "resigter button not displayed on landing page");
		Assert.assertTrue(lp.getLoginButton().isDisplayed(), "login button not displayed on landing page");
	}
}
