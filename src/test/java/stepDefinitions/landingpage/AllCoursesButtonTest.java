package stepDefinitions.landingpage;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Base_Class;
import utilities.LandingPageObjects;

public class AllCoursesButtonTest {
	WebDriver driver = Base_Class.dr;
	LandingPageObjects lp;

	@When("^User clicks on View All Courses button$")
	public void user_clicks_on_view_all_courses_button() throws Throwable {
		lp.getViewAllCoursesButton().click();
	}

	@Then("^View all Courses button is displayed$")
	public void view_all_courses_button_is_displayed() throws Throwable {
		lp = new LandingPageObjects(driver);
		Assert.assertTrue(lp.getViewAllCoursesButton().isDisplayed(), "view all Courses button is not displayed");
	}
}
