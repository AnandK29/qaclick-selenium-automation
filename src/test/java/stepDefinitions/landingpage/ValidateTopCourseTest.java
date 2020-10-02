package stepDefinitions.landingpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.Base_Class;
import utilities.LandingPageObjects;

public class ValidateTopCourseTest {
	WebDriver driver = Base_Class.dr;
	LandingPageObjects lp = new LandingPageObjects(driver);

	@Then("^Featured courses are displayed$")
	public void featured_courses_are_displayed() throws Throwable {
		Assert.assertEquals(driver.findElements(lp.getFeaturedCourseList()).size(), 10);
		Assert.assertTrue(driver.findElement(lp.getFeaturedCourseList()).isDisplayed());
	}

	@And("^\"([^\"]*)\" is first course in the list$")
	public void something_is_first_course_in_the_list(String courseName) throws Throwable {
		Assert.assertTrue(lp.getTopFeaturedCourse().getText().contains(courseName));
	}
}
