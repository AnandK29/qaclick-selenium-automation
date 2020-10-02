package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/* this is rahul shetty academy's official home page to which user is redirected 
 * after clicking menu buttons or courses on qaclickademy.com page
 */
public class RSAHomePageObjects {
	public RSAHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String pageTitle = "Rahul Shetty Academy";

	@FindBy(xpath = "//*[@class='logo']/a/img")
	private WebElement logo;

	public WebElement getLogo() {
		return logo;
	}
}
