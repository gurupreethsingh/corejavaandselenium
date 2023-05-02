package scripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generic.Opencloseclass;
import pom.Homepage;

public class Systemtestcasefromregisteringtoaddnewemployee extends Opencloseclass{
	@Test
	public void main() throws InterruptedException, IOException
	{
		Homepage hp = new Homepage(driver);
		hp.clickonregisterlink();
		hp.sendEmail("Rohit");
		hp.sendPassword("kumar");
		hp.clickonregister();
		hp.clickonloginlink();
		hp.sendEmail("Rohit");
		hp.sendPassword("kumar");
		hp.clickonlogin();
		hp.addemployee();
		hp.nameEmployee("james");
		hp.emailEmployee("roshan@gmail.com");
		hp.phoneEmployee("905905");
		Thread.sleep(2000);
		hp.addressEmployee("Bihar");
		Thread.sleep(2000);
		hp.clickonaddemployee();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		hp.fetchlastemployee();
//		hp.clickonlogoutlink();
//		String expectedtitle =Readingdata.getdata("Sheet1", 1, 0);
//		String expectedurl =Readingdata.getdata("Sheet1", 1, 1);
//		hp.checktitleofhome(expectedtitle);
//		hp.checkurlofhome(expectedurl);
	
	}

}
