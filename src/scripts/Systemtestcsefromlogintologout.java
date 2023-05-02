package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Opencloseclass;
import generic.Readingdata;
import pom.Homepage;

public class Systemtestcsefromlogintologout extends Opencloseclass {
	@Test
	public void main() throws InterruptedException, IOException
	{
		Homepage hp = new Homepage(driver);
		hp.clickonloginlink();
		hp.sendEmail("new");
		hp.sendPassword("kumar");
		hp.clickonlogin();
		hp.clickontestcasetemplatelink();
		String expectedtitle =Readingdata.getdata("Sheet1", 4, 0);
		String expectedurl =Readingdata.getdata("Sheet1", 4, 1);
		hp.checktitleofhome(expectedtitle);
		hp.checkurlofhome(expectedurl);
		hp.clickonlogoutlink();
		
	
	}

}
