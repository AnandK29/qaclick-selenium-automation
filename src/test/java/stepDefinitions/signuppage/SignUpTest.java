package stepDefinitions.signuppage;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import utilities.Base_Class;
import utilities.SignUpPageObjects;

public class SignUpTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	SignUpPageObjects sp = new SignUpPageObjects(driver);

	@And("^User enters invalid (.+) (.+) (.+) (.+)$")
	public void user_enters_invalid(String fullname, String email, String password, String confirmpwd)
			throws Throwable {
		sp = new SignUpPageObjects(driver);
		sp.getFullNameEditBox().sendKeys(fullname);
		sp.getEmailEditBox().sendKeys(email);
		sp.getPasswordEditBox().sendKeys(password);
		sp.getConfirmPasswordEditBox().sendKeys(confirmpwd);
	}

	@And("^User enters valid details (.+) (.+) (.+) (.+)$")
	public void user_enters_valid_details(String fullname, String email, String password, String confirmpwd)
			throws Throwable {
		sp = new SignUpPageObjects(driver);
		sp.getFullNameEditBox().sendKeys(fullname);
		sp.getEmailEditBox().sendKeys(email);
		sp.getPasswordEditBox().sendKeys(password);
		sp.getConfirmPasswordEditBox().sendKeys(confirmpwd);
	}

	@And("^User clicks on terms checkbox$")
	public void user_clicks_on_terms_checkbox() throws Throwable {
		sp.getTermsConditionsCheckBox().click();
	}

	@And("^Clicks on Sign up button$")
	public void clicks_on_sign_up_button() throws Throwable {
		sp.getSignUpButton().click();
	}
}
