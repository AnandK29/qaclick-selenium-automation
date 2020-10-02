package stepDefinitions.landingpage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import utilities.Base_Class;
import utilities.LandingPageObjects;

public class ValidateWelcomePanelContentsTest {
	WebDriver driver = Base_Class.dr;
	LandingPageObjects lp;

	@Then("^(.+) is displayed at index (.+) and description contains (.+)$")
	public void is_displayed_and_description_contains(String title, String index, String message) throws Throwable {
		lp = new LandingPageObjects(driver);
		lp.getWelcomePanelObjectHeadingsByIndex(Integer.parseInt(index)).getText().contains(title);
		lp.getWelcomePanelObjectDescriptionsByIndex(Integer.parseInt(index)).getText().contains(message);
	}

	@And("^User scrolls down to bottom of the page$")
	public void user_scrolls_down_to_bottom_of_the_page() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}
