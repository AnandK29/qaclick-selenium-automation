package stepDefinitions.resetpasswordpage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.Base_Class;
import utilities.ResetPageObjects;

public class ResetPasswordTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	ResetPageObjects rp;

	@Then("^\"([^\"]*)\" message displayed$")
	public void something_message_is_displayed(String message) throws Throwable {
		// TODO: modify method to work for success message as well
		Thread.sleep(500);
		Assert.assertTrue(rp.getErrorMessage().getText().equalsIgnoreCase(message),
				"error message not matching expected text");
	}

	@Then("^Email box is reset, user remains in same page$")
	public void email_field_is_reset() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(rp.getEmailEditBox().getText().isEmpty(), "email field is not cleared on failed attempt");
	}

	@And("^User enters invalid email \"([^\"]*)\"$")
	public void user_enters_invalid_email_something(String email) throws Throwable {
		rp = new ResetPageObjects(driver);
		rp.getEmailEditBox().sendKeys(email);
	}

	@And("^User clicks on Send me Instructions button$")
	public void user_clicks_on_send_me_instructions_button() throws Throwable {
		rp.getSendInstructionButton().click();
	}

	@And("^User enters valid email \"([^\"]*)\"$")
	public void user_enters_valid_email_something(String email) throws Throwable {
		rp = new ResetPageObjects(driver);
		rp.getEmailEditBox().sendKeys(email);
	}
}
