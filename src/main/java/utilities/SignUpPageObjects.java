package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageObjects {
	public SignUpPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Strings for registration page
	public String pageTitle = "Rahul Shetty Academy";
	public String mainsectionHeadintText = "Sign Up to Rahul Shetty Academy";
	public String logInPageHeading = "Log In to Rahul Shetty Academy";

	/**
	 * SignUp page WebElements..
	 */

	@FindBy(xpath = "//img[@alt= 'Rahul Shetty Academy']")
	private WebElement academyLogo;

	By mainSectionHeading = By.xpath("//div[@class ='content-box content-box-school-signup']/h1");

	@FindBy(xpath = "//label[@for ='user_name']")
	private WebElement fullNameLabel;

	@FindBy(xpath = "//input[@id='user_name']")
	private WebElement fullNameTextBox;

	@FindBy(xpath = "//label[@for ='user_email']")
	private WebElement emailLabel;

	@FindBy(xpath = "//input[@id='user_email']")
	private WebElement emailTextBox;

	@FindBy(xpath = "//label[@for ='user_password']")
	private WebElement passwordLabel;

	@FindBy(xpath = "//input[@id='user_password']")
	private WebElement passwordTextBox;

	@FindBy(xpath = "//label[@for ='user_password_confirmation']")
	private WebElement confirmPasswordLabel;

	@FindBy(xpath = "//input[@id='user_password_confirmation']")
	private WebElement confirmPasswordTextBox;

	@FindBy(xpath = "//input[@id='user_unsubscribe_from_marketing_emails']")
	private WebElement marketingemailCheckBox;

	@FindBy(xpath = "//input[@id='user_agreed_to_terms']")
	private WebElement termsConditionCheckBox;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement signUpButton;

	@FindBy(xpath = "//a[@class=' login-button']")
	private WebElement logInWithSchoolAccountButton;

	@FindBy(linkText = "Terms of Use")
	private WebElement termsOfUseLink;

	@FindBy(linkText = "Privacy Policy")
	private WebElement privacyPolicyLink;

	@FindBy(xpath = "//footer[@class='bottom-menu bottom-menu-inverse']/div/div/div/p")
	private WebElement footer;

	// Alert/error messages on sign up page
	@FindBy(xpath = "//div[@class ='alert alert-danger alert-registration-page']")
	private WebElement errorMessage;

	// Log In page that's is shown when navigated back from signUp page
	@FindBy(xpath = "//div[@class='content-box']/h1")
	private WebElement logInMainSectionHeading;

	/**
	 * public getter methods for webElements on register page
	 * 
	 * @return WebElement
	 */

	public WebElement getLogo() {
		return academyLogo;
	}

	public By getMainSectionHeading() {
		return mainSectionHeading;
	}

	public WebElement getFullNameLabel() {
		return fullNameLabel;
	}

	public WebElement getFullNameEditBox() {
		return fullNameTextBox;
	}

	public WebElement getEmailLabel() {
		return emailLabel;
	}

	public WebElement getEmailEditBox() {
		return emailTextBox;
	}

	public WebElement getPasswordLabel() {
		return passwordLabel;
	}

	public WebElement getPasswordEditBox() {
		return passwordTextBox;
	}

	public WebElement getConfirmPasswordLabel() {
		return confirmPasswordLabel;
	}

	public WebElement getConfirmPasswordEditBox() {
		return confirmPasswordTextBox;
	}

	public WebElement getemailCheckBox() {
		return marketingemailCheckBox;
	}

	public WebElement getTermsConditionsCheckBox() {
		return termsConditionCheckBox;
	}

	public WebElement getSignUpButton() {
		return signUpButton;
	}

	public WebElement getLogInWithSchoolAccountButton() {
		return logInWithSchoolAccountButton;
	}

	public WebElement getTermsOfUseLink() {
		return termsOfUseLink;
	}

	public WebElement getPrivacyPolicyLink() {
		return privacyPolicyLink;
	}

	public WebElement getFooterText() {
		return footer;
	}

	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getLogInMainSectionHeading() {
		return logInMainSectionHeading;
	}
}
