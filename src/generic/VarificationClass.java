package generic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
//parent class for every pom class
public class VarificationClass {
	private WebDriver driver;
	//constructor injection
	public VarificationClass(WebDriver driver){
		this.driver=driver;
	}
	
	//this function is common for varifying all the pages title
	public void varifyingalltitle(String specificpagetitles) throws Throwable {
		LocalDateTime now=LocalDateTime.now();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime=now.format(format);
		String timestamp=formatDateTime.toString().replace(':', '-');
		try {
		//explicitwait WebDriverWait=new WebDriverWait(driver,10)
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		//expected condition methods
		wait.until(ExpectedConditions.titleIs(specificpagetitles));
		Reporter.log("Title matched",true);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			TakesScreenshot ts=(TakesScreenshot) driver;
			File romlocation=ts.getScreenshotAs(OutputType.FILE);
			File harddisk=new File("C:\\Users\\Pratyush Kumar\\eclipse-workspace\\framework_design\\allfailedtestcase\\title_image"+timestamp+".jpeg");
			FileUtils.copyFile(romlocation, harddisk);
			
		}
		
	}
	public void varifyurl(String specificpagesurl)  throws Throwable {
			LocalDateTime now=LocalDateTime.now();
			DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			String formatDateTime=now.format(format);
			String timestamp=formatDateTime.toString().replace(':', '-');
			try {
			//explicitwait WebDriverWait=new WebDriverWait(driver,10)
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
			//expected condition methods
			wait.until(ExpectedConditions.urlToBe(specificpagesurl));
			Reporter.log("url matched",true);
			}
			catch(Exception ex) {
				ex.printStackTrace();
				TakesScreenshot ts=(TakesScreenshot) driver;
				File romlocation=ts.getScreenshotAs(OutputType.FILE);
				File harddisk=new File("C:\\Users\\Pratyush Kumar\\eclipse-workspace\\framework_design\\allfailedtestcase\\title_image"+timestamp+".jpeg");
				FileUtils.copyFile(romlocation, harddisk);
		
	}

}
}
