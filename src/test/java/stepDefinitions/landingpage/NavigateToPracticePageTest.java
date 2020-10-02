package stepDefinitions.landingpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Base_Class;
import utilities.LandingPageObjects;
import utilities.PracticePageObjects;

public class NavigateToPracticePageTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	WebDriverWait expWait;
	LandingPageObjects lp = new LandingPageObjects(driver);
	PracticePageObjects pp = new PracticePageObjects(driver);

	@When("^User clicks on practice button$")
	public void user_clicks_on_practice_button() throws Throwable {
		lp.getPracticeButton().click();
	}

	@Then("^user is redirected to practice page$")
	public void user_is_redirected_to_practice_page() throws Throwable {
		Assert.assertTrue(pp.getMainHeading().getText().equalsIgnoreCase(pp.mainHeading),
				"main section heading is not matching to 'Practice Page'");
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase(pp.pageTitle),
				"page title not matching, Not Practice page");
	}

	@And("^Practice button is displayed$")
	public void practice_button_is_displayed() throws Throwable {
		Assert.assertTrue(lp.getPracticeButton().isDisplayed(), "practice button not displaye");
	}
}
