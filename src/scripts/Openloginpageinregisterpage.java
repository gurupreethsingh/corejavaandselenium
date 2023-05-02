package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Opencloseclass;
import generic.Readingdata;
import pom.Registerpage;

public class Openloginpageinregisterpage extends Opencloseclass{
	@Test
	public void openloginPage() throws IOException, InterruptedException
	{
		Registerpage hp = new Registerpage(driver);
		hp.clickonregisterlink();
		hp.clickonloginlink();
		String expectedtitle =Readingdata.getdata("Sheet1", 0, 0);
		String expectedurl =Readingdata.getdata("Sheet1", 0, 1);
		Thread.sleep(2000);
		hp.checktitleofloginpage(expectedtitle);
		Thread.sleep(2000);
		hp.checkurlofloginpage(expectedurl);
	}

}
