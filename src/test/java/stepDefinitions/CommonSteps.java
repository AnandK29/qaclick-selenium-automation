package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Base_Class;
import utilities.LandingPageObjects;
import utilities.LogInPageObjects;
import utilities.RSAHomePageObjects;
import utilities.ResetPageObjects;
import utilities.SignUpPageObjects;

public class CommonSteps extends Base_Class {
	public static WebDriver driver;
	LandingPageObjects lp;
	LogInPageObjects lip;
	ResetPageObjects rp;
	SignUpPageObjects sp;
	RSAHomePageObjects rsa;
	WebDriverWait expWait;

	@Given("^User launches qaclick academy website$")
	public void user_launches_qaclick_academy_website() throws Throwable {
		driver = initializeDriver();
		expWait = new WebDriverWait(driver, 50);
		driver.get(prop.getProperty("landingPageUrl"));
		lp = new LandingPageObjects(driver);
		int size = driver.findElements(lp.getPopUp()).size();
		if (size > 0) {
			lp.getPopUpDismissButton().click();
		}
	}

	@When("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		lp = new LandingPageObjects(driver);
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase(lp.pageTitle), "not landing page");
	}

	@Then("^User is redirected to Rahul Shetty Academy home page$")
	public void user_is_redirected_to_rahul_shetty_academy_home_page() throws Throwable {
		rsa = new RSAHomePageObjects(driver);
		expWait.until(ExpectedConditions.visibilityOf(rsa.getLogo()));
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase(rsa.pageTitle), "user not redirected to RSA Home page");
	}

	// @And("^User scrolls down to featured courses section$")
	// public void user_scrolls_down_to_featured_courses_section() throws Throwable
	// {
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("arguments[0].scrollIntoView(true);",
	// lp.getViewAllCoursesButton());
	// }

	@When("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		lip = new LogInPageObjects(driver);
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase(lip.pageTitle), "Not login page, title mismatch");
	}

	@And("^User clicks on login button$")
	public void user_clicks_on_login_button_on_homepage() throws Throwable {
		lp.getLoginButton().click();
	}

	@Then("^User is redirected to login page$")
	public void user_is_redirected_to_login_page() throws Throwable {
		lip = new LogInPageObjects(driver);
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase(lip.pageTitle), "Not login page, title mismatch");
	}

	@When("^User is on reset password page$")
	public void user_is_on_reset_password_page() throws Throwable {
		rp = new ResetPageObjects(driver);
		lip = new LogInPageObjects(driver);
		lp.getLoginButton().click();
		lip.getForgotPasswordButton().click();
		expWait.until(ExpectedConditions.visibilityOf(rp.getMainSectionHeading()));
		Assert.assertTrue(rp.getSendInstructionButton().isDisplayed(), "use not redirected to reset password page");
	}

	@When("^User is on register page$")
	public void user_is_on_register_page() throws Throwable {
		sp = new SignUpPageObjects(driver);
		lp.getRegisteButton().click();
		expWait.until(ExpectedConditions.visibilityOf(sp.getFullNameEditBox()));
		Assert.assertTrue(sp.getFullNameEditBox().isDisplayed(), "Not redirecetd to signup page");
	}

	@Then("^(.+) message is displayed$")
	public void message_is_displayed(String errormessage) throws Throwable {
		Assert.assertTrue(lip.getInvalidMailAlert().getText().equalsIgnoreCase(errormessage),
				"error message for invalid creds not displayed");
	}

	@When("User clicks on Login button on login page")
	public void user_clicks_on_button_on_login_page() {
		lip.getLogInButton().click();
	}

	// @After
	// public void teardown() throws InterruptedException {
	// try {
	// Base_Class.closeBrowser();
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

}
