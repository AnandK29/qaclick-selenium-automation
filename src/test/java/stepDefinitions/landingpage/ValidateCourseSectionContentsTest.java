package stepDefinitions.landingpage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.Base_Class;
import utilities.LandingPageObjects;

public class ValidateCourseSectionContentsTest {
	WebDriver driver = Base_Class.dr;
	LandingPageObjects lp = new LandingPageObjects(driver);

	@Then("^Course section title is displayed as \"([^\"]*)\"$")
	public void course_section_title_is_displayed_as_something(String title) throws Throwable {
		// lp = new LandingPageObjects(driver);
		Assert.assertTrue(lp.getContentSectionHeading().getText().equalsIgnoreCase(title),
				"Content section heading mismatch");
	}

	@And("^Total ten featured courses are displayed$")
	public void total_ten_featured_courses_are_displayed() throws Throwable {
		int count = driver.findElements(lp.getFeaturedCourseList()).size();
		Assert.assertEquals(count, 10);
	}
}
