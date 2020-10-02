package stepDefinitions.landingpage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Base_Class;
import utilities.LandingPageObjects;

public class launchSiteTest {
	WebDriver driver = Base_Class.dr;
	LandingPageObjects lp;

	@When("^site opens on landing page$")
	public void site_opens_on_landing_page() throws Throwable {
		lp = new LandingPageObjects(driver);
		Assert.assertTrue(lp.getLoginButton().isDisplayed(), "login button not displayed on landing page menu bar");
	}

	@Then("^Landing page title is \"([^\"]*)\"$")
	public void something_page_title_is_something(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase(title), "landing page title mismatch");
	}
}
