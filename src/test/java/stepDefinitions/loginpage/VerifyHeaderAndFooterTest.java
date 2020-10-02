package stepDefinitions.loginpage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.Base_Class;
import utilities.LogInPageObjects;

public class VerifyHeaderAndFooterTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	LogInPageObjects lip;

	@Then("^Header message is displayed as \"([^\"]*)\"$")
	public void header_message_is_displayed_as_something(String header) throws Throwable {
		lip = new LogInPageObjects(driver);
		Assert.assertTrue(lip.getPageHeader().getText().contains(header), "page heding not matching expected text");
	}

	@And("^Footer message is displayed as \"([^\"]*)\"$")
	public void footer_message_is_displayed_as_something(String footer) throws Throwable {
		Assert.assertTrue(lip.getFooterText().getText().contains(footer),
				"page footer message not matching expected text");
	}
}
