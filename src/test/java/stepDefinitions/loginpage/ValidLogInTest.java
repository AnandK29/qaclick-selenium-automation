package stepDefinitions.loginpage;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Base_Class;
import utilities.LogInPageObjects;

public class ValidLogInTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	LogInPageObjects lip;

	@When("^User enters valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void user_enters_valid_usename_and_valid_password(String username, String password) throws Throwable {
		lip = new LogInPageObjects(driver);
		lip.getEmailTextBox().sendKeys(username);
		lip.getPasswordTextBox().sendKeys(password);
	}

	@Then("^User is logged into the website$")
	public void user_is_logged_into_the_website() throws Throwable {
		// TODO portal home page assertion
	}
}
