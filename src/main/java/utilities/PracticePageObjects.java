package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePageObjects {
	public PracticePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Strings for practice page
	public String pageTitle = "Practice Page";
	public String mainHeading = "Practice Page";

	@FindBy(xpath = "//h1")
	private WebElement practicepageHeading;

	public WebElement getMainHeading() {
		return practicepageHeading;
	}
}
