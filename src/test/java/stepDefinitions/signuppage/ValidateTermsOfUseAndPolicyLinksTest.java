package stepDefinitions.signuppage;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utilities.Base_Class;
import utilities.SignUpPageObjects;

public class ValidateTermsOfUseAndPolicyLinksTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	SignUpPageObjects sp = new SignUpPageObjects(driver);

	@Then("^User redirected to new page$")
	public void user_redirected_to_new_page() throws Throwable {
		Assert.assertFalse(driver.getCurrentUrl().equalsIgnoreCase(prop.getProperty("registerPageUrl")),
				"user not redirected to new page");
	}

	@And("^User click on Privacy Policy link$")
	public void user_click_on_privacy_policy_link() throws Throwable {
		sp.getPrivacyPolicyLink().click();
	}

	@And("^User click on Terms of Use link$")
	public void user_click_on_terms_of_use_link() throws Throwable {
		sp.getTermsOfUseLink().click();
	}

	@And("^Terms and services content is displayed$")
	public void terms_and_services_content_is_displayed() throws Throwable {

	}

	@And("^Privacy policy content is displayed$")
	public void privacy_policy_content_is_displayed() throws Throwable {

	}
}
