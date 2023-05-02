package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Opencloseclass;
import generic.Readingdata;
import pom.Testcasetemplatepage;

public class Openloginpageintestcasetemplatepage  extends Opencloseclass{
	@Test
	public void openLoginPage() throws IOException, InterruptedException
	{
		Testcasetemplatepage hp = new Testcasetemplatepage(driver);
		hp.clickontestcasetemplatelink();
		hp.clickonloginlink();
		String expectedtitle =Readingdata.getdata("Sheet1", 0, 0);
		String expectedurl =Readingdata.getdata("Sheet1", 0, 1);
		Thread.sleep(2000);
		hp.checktitleofloginpage(expectedtitle);
		Thread.sleep(2000);
		hp.checkurlofloginpage(expectedurl);
	}


}
