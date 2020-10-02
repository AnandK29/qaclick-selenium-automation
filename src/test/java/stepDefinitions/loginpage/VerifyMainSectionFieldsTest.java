package stepDefinitions.loginpage;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.Base_Class;
import utilities.LogInPageObjects;

public class VerifyMainSectionFieldsTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	LogInPageObjects lip;

	@Then("^Login main section heading is displayed as \"([^\"]*)\"$")
	public void login_main_section_heading_is_displayed_as_something(String heading) throws Throwable {
		lip = new LogInPageObjects(driver);
		System.out.println(lip.getMainSectionHeading().getText());
		Assert.assertTrue(lip.getMainSectionHeading().getText().equalsIgnoreCase(heading),
				"main section heading not matching with expected text");
	}

	@And("^Email field is displayed$")
	public void email_field_is_displayed() throws Throwable {
		Assert.assertTrue(lip.getEmailTextBox().isDisplayed(), "Email field not displayed");
	}

	@And("^Password field is displayed$")
	public void password_field_is_displayed() throws Throwable {
		Assert.assertTrue(lip.getPasswordTextBox().isDisplayed(), "password field is not displayed");
	}

	@And("^LogIn button is displayed$")
	public void login_button_is_displayed() throws Throwable {
		lip.getLogInButton().isDisplayed();
	}
}
