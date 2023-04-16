package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Opencloseclass;
import generic.Readingdata;
import pom.Homepage;
import pom.Loginpage;
import pom.Logoutpage;

public class Openhomepageinlogoutpage extends Opencloseclass{
	@Test
	public void openHomePage() throws IOException, InterruptedException
	{
		Logoutpage hp = new Logoutpage(driver);
		hp.clickonhomelink();
		String expectedtitle =Readingdata.getdata("Sheet1", 1, 0);
		String expectedurl =Readingdata.getdata("Sheet1", 1, 1);
		Thread.sleep(2000);
		hp.checktitleofhomepage(expectedtitle);
		Thread.sleep(2000);
		hp.checkurlofhomepage(expectedurl);
	}
}
