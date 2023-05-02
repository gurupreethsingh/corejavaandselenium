package generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.google.common.io.Files;

public class Verificationclass {
	private  WebDriver driver;
	protected Verificationclass(WebDriver driver)
	{
		this.driver = driver;
	}
 // function is common for verifying all the pages titles.
	public void verifyalltitles(String specificpagestitles) throws IOException
	{
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = now.format(format);
		String timestamp = formatDateTime.toString().replace(':', '-');
		try {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains(specificpagestitles));
		Reporter.log("Title matched",true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			TakesScreenshot ts = (TakesScreenshot) driver;
			File romlocation = ts.getScreenshotAs(OutputType.FILE);
			File f = new File("C:\\Users\\Roshan Jha\\eclipse-workspace\\Frameworkdesign\\all_failed_screenshots\\title_image_"+timestamp+".jpeg");
			Files.copy(romlocation, f);			
		}
	}
	public void verifyallurls(String specificpagesurl) throws IOException {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = now.format(format);
		String timestamp = formatDateTime.toString().replace(':', '-');
		try {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains(specificpagesurl));
		Reporter.log("Url matched",true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			TakesScreenshot ts = (TakesScreenshot) driver;
			File romlocation = ts.getScreenshotAs(OutputType.FILE);
			File f = new File("C:\\Users\\Roshan Jha\\eclipse-workspace\\Frameworkdesign\\all_failed_screenshots\\url_image_"+timestamp+".jpeg");
			Files.copy(romlocation, f);			
		}
		}
}
