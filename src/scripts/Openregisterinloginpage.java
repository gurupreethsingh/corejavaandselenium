package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Opencloseclass;
import generic.Readingdata;
import pom.Homepage;
import pom.Loginpage;

public class Openregisterinloginpage extends Opencloseclass{
	@Test
	public void openHomePage() throws IOException, InterruptedException
	{
		Loginpage hp = new Loginpage(driver);
		hp.clickonloginlink();
		hp.clickonregisterlink();
		String expectedtitle =Readingdata.getdata("Sheet1", 2, 0);
		String expectedurl =Readingdata.getdata("Sheet1", 2, 1);
		Thread.sleep(2000);
		hp.checktitleofregister(expectedtitle);
		Thread.sleep(2000);
		hp.checkurlofregister(expectedurl);
	}

}
