package stepDefinitions.landingpage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import utilities.Base_Class;
import utilities.LandingPageObjects;

public class NavigateToLogInPageTest extends Base_Class {
	WebDriver driver = Base_Class.dr;
	LandingPageObjects lp;

	@And("^Home page LogIn button is displayed$")
	public void login_button_is_displayed() throws Throwable {
		lp = new LandingPageObjects(driver);
		lp.getLoginButton().isDisplayed();
	}

	@And("^login page title is \"([^\"]*)\"$")
	public void login_page_title_is_something(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase(title), "login page title mismatch");
	}
}
