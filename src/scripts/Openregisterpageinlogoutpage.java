package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Opencloseclass;
import generic.Readingdata;
import pom.Logoutpage;

public class Openregisterpageinlogoutpage extends Opencloseclass{
	@Test
	public void openRegisterPage() throws IOException, InterruptedException
	{
		Logoutpage hp = new Logoutpage(driver);
		hp.clickonregisterlink();
		String expectedtitle =Readingdata.getdata("Sheet1", 2, 0);
		String expectedurl =Readingdata.getdata("Sheet1", 2, 1);
		Thread.sleep(2000);
		hp.checktitleofregister(expectedtitle);
		Thread.sleep(2000);
		hp.checkurlofregister(expectedurl);
	}

}
