package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageObjects {
	public LandingPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Strings for landing page
	public String pageTitle = "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy";
	public String contentSectionHeadingText = "Featured Courses";
	public String carouselHeadingText = "An Academy to learn Everything about Testing";
	public String carouselParagraphText = "Learn Hot tools like Selenium, Appium, JMeter, SoapUI,Database Testing and more..";

	/**
	 * landing page elements.
	 * 
	 * @return WebElement
	 */

	// menu bar and nav bar items
	@FindBy(linkText = "HOME")
	private WebElement homeBtn;

	@FindBy(linkText = "COURSES")
	private WebElement courseBtn;

	@FindBy(linkText = "VIDEOS")
	private WebElement videoBtn;

	@FindBy(linkText = "PRACTICE")
	private WebElement practicebBtn;

	@FindBy(linkText = "INTERVIEW GUIDE")
	private WebElement interviewBtn;

	@FindBy(linkText = "BLOG")
	private WebElement blogBtn;

	@FindBy(linkText = "ABOUT")
	private WebElement aboutBtn;

	@FindBy(linkText = "CONTACT")
	private WebElement contactBtn;

	@FindBy(xpath = "//div[@class = 'container-fluid']/ul/li[1]/a")
	private WebElement teleNum;

	@FindBy(xpath = "//div[@class = 'container-fluid']/ul/li[2]/a")
	private WebElement mail;

	@FindBy(linkText = "Register")
	private WebElement registerButton;

	@FindBy(xpath = "//span[contains(text(), 'Login')]")
	private WebElement logInButton;

	@FindBy(xpath = "//*[@id='homepage']/header/div[2]/div/div/a/img") // img[@class = 'image-responsive logo']
	private WebElement websiteLogo;

	// inner carousel items
	@FindBy(xpath = "//div[@class='item active'] //img[@class = 'img-responsive'] ")
	private WebElement carouselBackground;

	@FindBy(xpath = "//div[@class='carousel-caption']/div/div/h3")
	private WebElement carouselHeading;

	@FindBy(xpath = "//div[@class='carousel-caption']/div/div/p")
	private WebElement carouselParagraph;

	@FindBy(className = "video-wrapper")
	private WebElement videoWrapper;

	@FindBy(xpath = "//div[@class = 'marquee0']")
	private WebElement marqueStrip;

	// Featured Content section elements
	@FindBy(xpath = "//section[@id='content'] //div[@class = 'container']/div/h2")
	private WebElement contentSectionHeading;

	By featuredCourseList = By.xpath("//ul[@class = 'gallery course-list']/li");

	@FindBy(xpath = "//ul[@class = 'gallery course-list']/li[1]")
	private WebElement topCourse;

	@FindBy(linkText = "VIEW ALL COURSES")
	private WebElement viewCoursesBtn;

	// welcome panel/section elements
	@FindBy(xpath = "//section[@id ='welcome']/div/div/div/div")
	private WebElement welcomePanelAllRows;

	@FindBy(xpath = "//section[@id='welcome']/div/div/div/div[1]/div/div[2]/h3")
	private WebElement welcomePanelElement_1;

	@FindBy(xpath = "//*[@id='welcome']/div/div/div/div[2]/div/div[2]/h3")
	private WebElement welcomePanelElement_2;

	@FindBy(xpath = "//*[@id='welcome']/div/div/div/div[3]/div/div[2]/h3")
	private WebElement welcomePanelElement_3;

	@FindBy(xpath = "//*[@id='welcome']/div/div/div/div[4]/div/div[2]/h3")
	private WebElement welcomePanelElement_4;

	@FindBy(xpath = "//*[@id=\"welcome\"]/div/div/div/div[5]/div/div[2]/div/div[2]/h3")
	private WebElement welcomePanelElement_5;

	@FindBy(xpath = "//*[@id='welcome']/div/div/div/div[1]/div/div[2]/p")
	private WebElement welcomePanelElement_1_desc;

	@FindBy(xpath = "//*[@id='welcome']/div/div/div/div[2]/div/div[2]/p")
	private WebElement welcomePanelElement_2_desc;

	@FindBy(xpath = "//*[@id='welcome']/div/div/div/div[3]/div/div[2]/p")
	private WebElement welcomePanelElement_3_desc;

	@FindBy(xpath = "//*[@id='welcome']/div/div/div/div[4]/div/div[2]/p")
	private WebElement welcomePanelElement_4_desc;

	@FindBy(xpath = "//*[@id='welcome']/div/div/div/div[5]/div/div[2]/div/div[2]/p")
	private WebElement welcomePanelElement_5_desc;

	@FindBy(xpath = "//button[text()='NO THANKS']")
	private WebElement popupDismissButton;

	/*
	 * using 'By' as alternative of @FindBy
	 * 
	 * @return By
	 */
	By popup = By.xpath("//button[text()='NO THANKS']");

	// public methods for newsletter pop up.
	public By getPopUp() {
		return popup;
	}

	public WebElement getPopUpDismissButton() {
		return popupDismissButton;
	}

	/**
	 * Public getter methods for all elements on home page
	 * 
	 * @return WebElement
	 */
	public WebElement getHomeButton() {
		return homeBtn;
	}

	public WebElement getCourseButton() {
		return courseBtn;
	}

	public WebElement getInterviewGuideButton() {
		return interviewBtn;
	}

	public WebElement getPracticeButton() {
		return practicebBtn;
	}

	public WebElement getBlogButton() {
		return blogBtn;
	}

	public WebElement getContactButton() {
		return contactBtn;
	}

	public WebElement getAboutButton() {
		return aboutBtn;
	}

	public WebElement getVideosButton() {
		return videoBtn;
	}

	public WebElement getTeleNumberLink() {
		return teleNum;
	}

	public WebElement getMailLink() {
		return mail;
	}

	public WebElement getRegisteButton() {
		return registerButton;
	}

	public WebElement getLoginButton() {
		return logInButton;
	}

	public WebElement getSiteLogo() {
		return websiteLogo;
	}

	public WebElement getCarouselHeading() {
		return carouselHeading;
	}

	public WebElement getCarouselParagraph() {
		return carouselParagraph;
	}

	public WebElement getVideoWrapper() {
		return videoWrapper;
	}

	public WebElement getBackgroundImage() {
		return carouselBackground;
	}

	public WebElement getMauqueStrip() {
		return marqueStrip;
	}

	public WebElement getContentSectionHeading() {
		return contentSectionHeading;
	}

	public By getFeaturedCourseList() {
		return featuredCourseList;
	}

	public WebElement getTopFeaturedCourse() {
		return topCourse;
	}

	public WebElement getViewAllCoursesButton() {
		return viewCoursesBtn;
	}

	public WebElement getWelcomePanelAllRows() {
		return welcomePanelAllRows;
	}

	public WebElement getWelcomePanelObjectHeadingsByIndex(int index) {
		switch (index) {
		case 1:
			return welcomePanelElement_1;
		case 2:
			return welcomePanelElement_2;
		case 3:
			return welcomePanelElement_3;
		case 4:
			return welcomePanelElement_4;
		case 5:
			return welcomePanelElement_5;
		default:
			return null;
		}
	}

	public WebElement getWelcomePanelObjectDescriptionsByIndex(int index) {
		switch (index) {
		case 1:
			return welcomePanelElement_1_desc;
		case 2:
			return welcomePanelElement_2_desc;
		case 3:
			return welcomePanelElement_3_desc;
		case 4:
			return welcomePanelElement_4_desc;
		case 5:
			return welcomePanelElement_5_desc;
		default:
			return null;
		}
	}
}
