package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Opencloseclass;
import generic.Readingdata;
import pom.Homepage;

public class Openloginpageinhomepage extends Opencloseclass{
	@Test
	public void openLoginPage() throws IOException, InterruptedException
	{
		Homepage hp = new Homepage(driver);
		hp.clickonloginlink();
		
		String expectedtitle =Readingdata.getdata("Sheet1", 0, 0);
		String expectedurl =Readingdata.getdata("Sheet1", 0, 1);
		Thread.sleep(2000);
		hp.checktitleofloginpage(expectedtitle);
		Thread.sleep(2000);
		hp.checkurlofloginpage(expectedurl);
	}

}
