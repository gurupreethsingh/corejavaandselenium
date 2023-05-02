package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Opencloseclass;
import generic.Readingdata;
import pom.Homepage;

public class Openlogoutpageinhomepage extends Opencloseclass{
	@Test
	public void openLogoutPage() throws IOException, InterruptedException
	{
		Homepage hp = new Homepage(driver);
		hp.clickonlogoutlink();
		
		String expectedtitle =Readingdata.getdata("Sheet1", 5, 0);
		String expectedurl =Readingdata.getdata("Sheet1", 5, 1);
		Thread.sleep(2000);
		hp.checktitleoflogoutpage(expectedtitle);
		Thread.sleep(2000);
		hp.checkurloflogoutpage(expectedurl);
	}

}
