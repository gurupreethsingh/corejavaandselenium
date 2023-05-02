package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Opencloseclass;
import generic.Readingdata;
import pom.Registerpage;

public class Opendashboardpageinregisterpage extends Opencloseclass{
	@Test
	public void opendashboardPage() throws IOException, InterruptedException
	{
		Registerpage hp = new Registerpage(driver);
		hp.clickonregisterlink();
		hp.clickondashboardlink();
		String expectedtitle =Readingdata.getdata("Sheet1", 3, 0);
		String expectedurl =Readingdata.getdata("Sheet1", 3, 1);
		Thread.sleep(2000);
		hp.checktitleofdashboardpage(expectedtitle);
		Thread.sleep(2000);
		hp.checkurlofdashboardpage(expectedurl);
	}

}
