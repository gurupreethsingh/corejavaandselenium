package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Opencloseclass;
import generic.Readingdata;
import pom.Homepage;

public class Systemtestcasefromdropdowntologout extends Opencloseclass {
	@Test
	public void main() throws InterruptedException, IOException
	{
		Homepage hp = new Homepage(driver);
		hp.clickondropdown();
		hp.clickonbootstrap();
		hp.clickdropregister();
		hp.clickonregisterlink();
		hp.sendEmail("Rosha");
		hp.sendPassword("kumar");
		hp.clickonregister();
		hp.clickonloginlink();
		hp.sendEmail("Rosha");
		hp.sendPassword("kumar");
		hp.clickonlogin();
		hp.addemployee();
		String expectedtitle =Readingdata.getdata("Sheet1", 1, 0);
		String expectedurl =Readingdata.getdata("Sheet1", 1, 1);
		hp.checktitleofhome(expectedtitle);
		hp.checkurlofhome(expectedurl);
	
	}

}
