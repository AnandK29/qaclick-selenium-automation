package stepDefinitions.landingpage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import utilities.Base_Class;
import utilities.LandingPageObjects;
import utilities.RSAHomePageObjects;

public class ValidateRSALogoTest {
	WebDriver driver = Base_Class.dr;
	LandingPageObjects lp = new LandingPageObjects(driver);
	RSAHomePageObjects rsa = new RSAHomePageObjects(driver);

	@When("^Rahul Shetty Academys logo is displayed$")
	public void rahul_shetty_academys_logo_is_displayed() throws Throwable {
		Assert.assertTrue(lp.getSiteLogo().isDisplayed(), "Logo not found");
	}

	@And("^User click on the logo$")
	public void user_click_on_the_logo() throws Throwable {
		lp.getSiteLogo().click();
	}

	@And("^RSA page title is \"([^\"]*)\"$")
	public void rsa_page_title_is_something(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(rsa.pageTitle),
				"page title not matching, may not be the RSA home page");
	}
}
