package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageObjects {
	public LogInPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Strings for login page
	public String pageHeaderText = "WebServices Testing using SoapUI";
	public String mainSectionHeadingText = "Log In to WebServices Testing using SoapUI";
	public String footerText = "WebServices Testing using SoapUI";
	public String pageTitle = "WebServices Testing using SoapUI";

	/**
	 * LogIn page webelements
	 */
	@FindBy(xpath = "//a[@class='navbar-brand']")
	private WebElement pageHeading;

	@FindBy(xpath = "//section[@id='hero']/div/h1")
	private WebElement mainSectionHeading;

	@FindBy(xpath = "//label[@class='control-label']")
	private WebElement emailLabel;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailTextBox;

	@FindBy(xpath = "//label[@for='user_password']")
	private WebElement passwordLabel;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTextBox;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement logInButton;

	@FindBy(xpath = "//a[@class ='link-below-button']") // @FindBy(linkText = "Forgot Password?")
	private WebElement forgotPwdBtn;

	@FindBy(xpath = "//footer[@class = 'bottom-menu bottom-menu-inverse']/div/div/div/p")
	private WebElement footer;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-show mb-5']")
	private WebElement invalidMailAlert;

	/**
	 * Public getter methods for all elements on login page.
	 * 
	 * @return WebElements
	 */

	public WebElement getPageHeader() {
		return pageHeading;
	}

	public WebElement getMainSectionHeading() {
		return mainSectionHeading;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getLogInButton() {
		return logInButton;
	}

	public WebElement getForgotPasswordButton() {
		return forgotPwdBtn;
	}

	public WebElement getFooterText() {
		return footer;
	}

	public WebElement getInvalidMailAlert() {
		return invalidMailAlert;
	}
}
