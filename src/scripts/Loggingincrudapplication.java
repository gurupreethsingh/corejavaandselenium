package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Opencloseclass;
import generic.Readingdata;
import pom.Homepage;

public class Loggingincrudapplication extends Opencloseclass {
	@Test
	public void logging() throws IOException, InterruptedException
	{
		Homepage hp = new Homepage(driver);
		hp.clickonloginlink();
		Thread.sleep(2000);
		hp.sendEmail("Roshan ku");
		hp.sendPassword("kumar");
		hp.clickonlogin();
		Thread.sleep(2000);
		String expectedtitle =Readingdata.getdata("Sheet1", 0, 0);
		String expectedurl =Readingdata.getdata("Sheet1", 0, 1);
		Thread.sleep(2000);
		hp.checktitleofloginpage(expectedtitle);
		Thread.sleep(2000);
		hp.checkurlofdashboardpage(expectedurl);
		System.out.println(expectedtitle);
	}


}
