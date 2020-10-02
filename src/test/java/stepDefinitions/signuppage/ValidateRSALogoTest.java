package stepDefinitions.signuppage;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utilities.Base_Class;
import utilities.RSAHomePageObjects;
import utilities.SignUpPageObjects;

public class ValidateRSALogoTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	SignUpPageObjects sp;
	RSAHomePageObjects rsp;

	@Then("^User is redirected to RSA home page$")
	public void user_redirected_to_rsa_home_page() throws Throwable {
		rsp = new RSAHomePageObjects(driver);
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Home | " + rsp.pageTitle),
				"not redirected to RSA home page");
	}

	@And("^User clicks on the logo$")
	public void user_clicks_on_the_logo() throws Throwable {
		sp = new SignUpPageObjects(driver);
		sp.getLogo().click();
	}
}
