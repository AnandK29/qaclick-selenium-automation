package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

// this is the home page after log-in in the website.
public class PortalHomePageObjects {

	public PortalHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
