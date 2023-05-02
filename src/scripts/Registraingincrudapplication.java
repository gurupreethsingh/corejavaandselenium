package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Opencloseclass;
import generic.Readingdata;
import pom.Homepage;
import pom.Registerpage;

public class Registraingincrudapplication extends Opencloseclass{
	@Test
	public void registring() throws IOException, InterruptedException
	{
		Homepage hp = new Homepage(driver);
		hp.clickonregisterlink();
		Thread.sleep(2000);
		hp.sendEmail("Roshan ku");
		hp.sendPassword("kumar");
		hp.clickonregister();
		Thread.sleep(2000);
		String expectedtitle =Readingdata.getdata("Sheet1", 1, 0);
		String expectedurl =Readingdata.getdata("Sheet1", 1, 1);
		Thread.sleep(2000);
		hp.checktitleofhome(expectedtitle);
		Thread.sleep(2000);
		hp.checkurlofhome(expectedurl);
		System.out.println(expectedtitle);
	}


}
