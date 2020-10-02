package stepDefinitions.landingpage;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Base_Class;
import utilities.LandingPageObjects;

public class ClickOnMenuBarButtonsTest {
	WebDriver driver = Base_Class.dr;
	LandingPageObjects lp;
	Logger logger = Logger.getLogger(ClickOnMenuBarButtonsTest.class.getName());

	@When("^User clicks on (.+) button on landing page menubar$")
	public void user_clicks_on_button(String buttonName) throws Throwable {
		String button = buttonName.toUpperCase();
		lp = new LandingPageObjects(driver);

		switch (button) {
		case "HOME":
			lp.getHomeButton().click();
			break;

		case "COURSES":
			lp.getCourseButton().click();
			break;

		case "ABOUT":
			lp.getAboutButton().click();
			break;

		case "BLOG":
			lp.getBlogButton().click();
			break;

		case "INTERVIEW GUIDE":
			lp.getInterviewGuideButton().click();
			break;

		case "PRACTICE":
			lp.getPracticeButton().click();
			break;

		case "VIDEOS":
			lp.getVideosButton().click();
			break;

		case "CONTACT":
			lp.getContactButton().click();
			break;

		case "LOGIN":
			lp.getLoginButton().click();
			break;

		case "REGISTER":
			lp.getRegisteButton().click();
			break;

		case "VIEW ALL COURSES":
			lp.getViewAllCoursesButton().click();
			break;

		default:
			logger.log(Level.INFO, "Incorrect button name given or button case couldn't be found");
			break;
		}
	}

	@Then("^All menu bar buttons are displayed and enabled$")
	public void all_menu_bar_buttons_are_displayed_and_enabled() throws Throwable {
		lp = new LandingPageObjects(driver);
		Assert.assertTrue("home button not displayed", lp.getHomeButton().isDisplayed());
		Assert.assertTrue("courses button not displayed", lp.getCourseButton().isDisplayed());
		Assert.assertTrue("About button not displayed", lp.getAboutButton().isDisplayed());
		Assert.assertTrue("Blog button not displayed", lp.getBlogButton().isDisplayed());
		Assert.assertTrue("Interview Guide button not displayed", lp.getInterviewGuideButton().isDisplayed());
		Assert.assertTrue("Practice button not displayed", lp.getPracticeButton().isDisplayed());
		Assert.assertTrue("Videos button not displayed", lp.getVideosButton().isDisplayed());
		Assert.assertTrue("Contact button not displayed", lp.getContactButton().isDisplayed());
	}
}
