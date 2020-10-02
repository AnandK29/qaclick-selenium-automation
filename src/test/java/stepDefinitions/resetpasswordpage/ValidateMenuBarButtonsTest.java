package stepDefinitions.resetpasswordpage;

import org.testng.Assert;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.Base_Class;
import utilities.LogInPageObjects;
import utilities.ResetPageObjects;

public class ValidateMenuBarButtonsTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	LogInPageObjects lip;
	ResetPageObjects rp;
	Logger logger = Logger.getLogger(ValidateMenuBarButtonsTest.class.getName());

	@Then("^User remains on same page$")
	public void user_remains_on_same_page() throws Throwable {
		Assert.assertTrue(driver.findElement(rp.getPageHeading()).getText().equals(rp.pageHeadingText),
				"user is not on reset password page");
	}

	@And("^User clicks on (.+) button on reset page menubar$")
	public void user_clicks_on_button(String button) throws Throwable {
		String btn = button.toUpperCase();
		rp = new ResetPageObjects(driver);

		switch (btn) {

		case "SEND ME INSTRUCTION":
			rp.getSendInstructionButton().click();
			break;

		case "LOG IN WITH SCHOOL ACCOUNT":
			rp.getLogInWithSchoolAccountButton().click();
			break;

		case "CREATE AN ACCOUNT":
			rp.getCreateAccountButton().click();
			break;

		case "ALL COURSES":
			rp.getAllCoursesButton().click();
			break;

		case "MY COURSES":
			rp.getMyCoursesButton().click();
			break;

		default:
			logger.log(Level.INFO, "Incorrect button name given or button case couldn't be found");
			break;
		}
	}
}
