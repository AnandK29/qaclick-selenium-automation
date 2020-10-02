package stepDefinitions.resetpasswordpage;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.Base_Class;
import utilities.ResetPageObjects;

public class ValidateAllFieldsTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	ResetPageObjects rp = new ResetPageObjects(driver);

	@Then("^Reset password page heading is displayed as \"([^\"]*)\"$")
	public void reset_password_page_heading_is_displayed_as_something(String pageHeading) throws Throwable {
		Assert.assertTrue(driver.findElement(rp.getPageHeading()).isDisplayed(), "page heading not displayed");
	}

	@And("^Reset main section heading is displayed as \"([^\"]*)\"$")
	public void reset_main_section_heading_is_displayed_as_something(String mainHeading) throws Throwable {
		Assert.assertTrue(rp.getMainSectionHeading().isDisplayed(), "main section heading not displayed");
	}

	@And("^Email field label and textbox is displayed$")
	public void email_field_label_and_textbox_is_displayed() throws Throwable {
		Assert.assertTrue(rp.getEmailLabel().isDisplayed(), "email label not displayed");
		Assert.assertTrue(rp.getEmailEditBox().isDisplayed(), "emain edit box not displayed");
	}

	@And("^Send Me Instruction button is displayed$")
	public void send_me_instruction_button_is_displayed() throws Throwable {
		Assert.assertTrue(rp.getSendInstructionButton().isDisplayed(), "send me instruction button not displayed");
	}

	@And("^Log In with school Account button is displayed$")
	public void log_in_with_school_account_button_is_displayed() throws Throwable {
		Assert.assertTrue(rp.getLogInWithSchoolAccountButton().isDisplayed(),
				"LogIn with school account button not displayed");
	}

	@And("^Create an Account button is displayed$")
	public void create_an_account_button_is_displayed() throws Throwable {
		Assert.assertTrue(rp.getCreateAccountButton().isDisplayed(), "create an account button not displayed");
	}
}
