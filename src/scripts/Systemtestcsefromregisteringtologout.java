package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Opencloseclass;
import generic.Readingdata;
import pom.Homepage;

public class Systemtestcsefromregisteringtologout extends Opencloseclass {
	@Test
	public void main() throws InterruptedException, IOException
	{
		Homepage hp = new Homepage(driver);
		hp.clickonregisterlink();
		hp.sendEmail("Roshan ");
		hp.sendPassword("kumar");
		hp.clickonregister();
		hp.clickonloginlink();
		hp.sendEmail("Roshan ");
		hp.sendPassword("kumar");
		hp.clickonlogin();
		hp.clickonlogoutlink();
		String expectedtitle =Readingdata.getdata("Sheet1", 1, 0);
		String expectedurl =Readingdata.getdata("Sheet1", 1, 1);
		hp.checktitleofhome(expectedtitle);
		hp.checkurlofhome(expectedurl);
	
	}

}
