package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPageObjects {
	public ResetPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Strings for Password reset page
	public String pageHeadingText = "WebServices Testing using SoapUI";
	public String mainSectionHeadingText = "Reset Password";

	/**
	 * Password reset page WebElements..
	 */
	By pageHeading = By.xpath("//a[@class ='navbar-brand']");

	@FindBy(linkText = "My Courses")
	private WebElement myCoursesButton;

	@FindBy(linkText = "All Courses")
	private WebElement allCoursesButton;

	@FindBy(linkText = "Login")
	private WebElement logInButton;

	@FindBy(xpath = "//*[@id = 'hero']/div/h1")
	private WebElement mainSectionHeading;

	@FindBy(xpath = "//label[@for ='user_email']")
	private WebElement emailLabel;

	@FindBy(xpath = "//input[@type ='email']")
	private WebElement emailEditBox;

	@FindBy(xpath = "//input[@name='commit']")
	private WebElement submitButton;

	@FindBy(xpath = "//a[@class='box-half login-button'][1]")
	private WebElement logInWithSchoolAccountButton;

	@FindBy(xpath = "//a[@class='box-half login-button'][2]")
	private WebElement createAccountButton;

	@FindBy(xpath = "//*[@id='new_user']/div/div/div/span")
	private WebElement errorMessage;

	// should return size as 3 | to get parent row remove last div in xpath
	@FindBy(xpath = "//footer[@class='bottom-menu bottom-menu-inverse text-center']/div/div/div")
	private WebElement footer;

	/**
	 * public getter methods for password reset page elements
	 * 
	 * @return WebElements
	 */
	public By getPageHeading() {
		return pageHeading;
	}

	public WebElement getMyCoursesButton() {
		return myCoursesButton;
	}

	public WebElement getAllCoursesButton() {
		return allCoursesButton;
	}

	public WebElement getLogInButton() {
		return logInButton;
	}

	public WebElement getMainSectionHeading() {
		return mainSectionHeading;
	}

	public WebElement getEmailLabel() {
		return emailLabel;
	}

	public WebElement getEmailEditBox() {
		return emailEditBox;
	}

	public WebElement getSendInstructionButton() {
		return submitButton;
	}

	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getLogInWithSchoolAccountButton() {
		return logInWithSchoolAccountButton;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}

	public WebElement getFooterSection() {
		return footer;
	}
}
