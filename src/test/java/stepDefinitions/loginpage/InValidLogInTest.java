package stepDefinitions.loginpage;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import utilities.Base_Class;
import utilities.LogInPageObjects;

public class InValidLogInTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	LogInPageObjects lip;

	@When("^user enter invalid (.+) and (.+)$")
	public void user_enter_invalid_and(String username, String password) throws Throwable {
		lip = new LogInPageObjects(driver);
		lip.getEmailTextBox().sendKeys(username);
		lip.getPasswordTextBox().sendKeys(password);
	}
}
