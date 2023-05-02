package scripts;

import java.io.IOException;
import java.util.Set;

import org.testng.annotations.Test;

import generic.Opencloseclass;
import generic.Readingdata;
import pom.Homepage;

public class Systemtestcaseforjavascriptalerttohomepage extends Opencloseclass {
	@Test
	public void main() throws InterruptedException, IOException
	{
		Homepage hp = new Homepage(driver);
		hp.clickonalertlink();
		hp.clickonshowalert();
		driver.switchTo().alert().accept();
		String mainid = driver.getWindowHandle();
		hp.clickondropdown();
		hp.clickoninstalink(driver);
		Set<String> allid = driver.getWindowHandles();
		for(String id : allid)
		{
			if(!(mainid.equals(id)))
			{
				driver.switchTo().window(id);
			}
		}
		System.out.println(driver.getTitle());
		driver.switchTo().window(mainid);
		String expectedurl =Readingdata.getdata("Sheet1", 1, 1);
		Thread.sleep(2000);
		hp.checkurlofhome(expectedurl);
	
	}

}
