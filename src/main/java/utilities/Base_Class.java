package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Base_Class {
	public static WebDriver dr = null;
	protected Properties prop = new Properties();
	protected Wait<WebDriver> wait;

	public WebDriver initializeDriver() throws IOException {
		FileInputStream fis = new FileInputStream("src\\main\\java\\globalProperties.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browserName");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty(prop.getProperty("chromeDriver"), prop.getProperty("chromeDriverPath"));
			dr = new ChromeDriver();
		}
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty(prop.getProperty("firefoxDriver"), prop.getProperty("firefoxDriverPath"));
			dr = new FirefoxDriver();
		}
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait

		// fluent wait // never used
		wait = new FluentWait<WebDriver>(dr).withTimeout(Duration.ofSeconds(50)).pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

		return dr;
	}

	public static void takeScreenshot() throws IOException {
		String filename = String.format(Long.toString(System.currentTimeMillis()) + ".png");
		File output = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(output, new File(System.getProperty("user.dir") + filename + ""));
	}

	public static void closeBrowser() throws InterruptedException {
		// Thread.sleep(1000);
		dr.close();
	}

	public static void quitBrowser() throws InterruptedException {
		// Thread.sleep(1000);
		dr.quit();
	}
}
