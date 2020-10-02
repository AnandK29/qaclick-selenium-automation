package stepDefinitions.landingpage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.Base_Class;
import utilities.LandingPageObjects;

public class ValidateHeaderSectionContentsTest {
	WebDriver driver = Base_Class.dr;
	LandingPageObjects lp = new LandingPageObjects(driver);;

	@Then("^Featured image is displayed in header section$")
	public void featured_image_is_displayed_in_header_section() throws Throwable {
		Assert.assertTrue(lp.getBackgroundImage().isDisplayed(), "featured image not displaeyd");
	}

	@And("^Heading text is displayed$")
	public void heading_text_is_displayed() throws Throwable {
		Assert.assertTrue(lp.getCarouselHeading().isDisplayed(), "heading text not displaeyd");
		Assert.assertTrue(lp.getCarouselHeading().getText().equalsIgnoreCase(lp.carouselHeadingText));
	}

	@And("^Video wrapper is displayed and clickable$")
	public void video_wrapper_is_displayed_and_clickable() throws Throwable {
		Assert.assertTrue(lp.getVideoWrapper().isEnabled(), "video wrapper not intractable");
	}

	@And("Marquee strip is displayed")
	public void marquee_strip_is_displayed() {
		Assert.assertTrue(lp.getMauqueStrip().isDisplayed(), "marquee strip not shown");
	}
}
