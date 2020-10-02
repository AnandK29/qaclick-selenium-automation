package stepDefinitions.signuppage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.Base_Class;
import utilities.SignUpPageObjects;

public class SignUpPageFieldsTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	SignUpPageObjects sp;

	@Then("^RSA logo is displayed on top$")
	public void rsa_logo_is_displayed_on_top() throws Throwable {
		sp = new SignUpPageObjects(driver);
		Assert.assertTrue(sp.getLogo().isDisplayed(), "Logo is not displayed");
	}

	@And("^Main content heading is displayed as \"([^\"]*)\"$")
	public void main_content_heading_is_displayed_as_something(String heading) throws Throwable {
		Assert.assertTrue(driver.findElement(sp.getMainSectionHeading()).getText().contains(heading),
				"main section heading not matching expected text");
	}

	@And("^Email field label and text box displayed$")
	public void email_field_label_and_text_box_displayed() throws Throwable {
		Assert.assertTrue(sp.getEmailEditBox().isDisplayed(), "email edit box not displayed");
		Assert.assertTrue(sp.getEmailLabel().isDisplayed(), "email label is not displayed");
	}

	@And("^Password field label and text box displayed$")
	public void password_field_label_and_text_box_displayed() throws Throwable {
		Assert.assertTrue(sp.getPasswordEditBox().isDisplayed(), "password edit box not displayed");
		Assert.assertTrue(sp.getPasswordLabel().isDisplayed(), "password label is not displayed");
	}

	@And("^Sign Up button is displayed$")
	public void sign_up_button_is_displayed() throws Throwable {
		Assert.assertTrue(sp.getSignUpButton().isDisplayed(), "sign up button not displayed");

	}
}
