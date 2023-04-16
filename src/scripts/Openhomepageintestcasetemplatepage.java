package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Opencloseclass;
import generic.Readingdata;
import pom.Registerpage;
import pom.Testcasetemplatepage;

public class Openhomepageintestcasetemplatepage extends Opencloseclass {
	@Test
	public void openHomePage() throws IOException, InterruptedException
	{
		Testcasetemplatepage hp = new Testcasetemplatepage(driver);
		hp.clickontestcasetemplatelink();
		hp.clickonhomelink();
		String expectedtitle =Readingdata.getdata("Sheet1", 1, 0);
		String expectedurl =Readingdata.getdata("Sheet1", 1, 1);
		Thread.sleep(2000);
		hp.checktitleofhomepage(expectedtitle);
		Thread.sleep(2000);
		hp.checkurlofhomepage(expectedurl);
	}

}
