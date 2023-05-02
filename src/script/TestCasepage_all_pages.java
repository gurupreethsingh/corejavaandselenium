package script;

import org.testng.annotations.Test;

import generic.OpenCloseclass;
import pom.Home_page_loginpage;
import pom.Testcasetemplate_allpage;

public class TestCasepage_all_pages extends OpenCloseclass {
	@Test
	public void goinghome_login() throws Throwable {
		Testcasetemplate_allpage hl=new Testcasetemplate_allpage(driver);
		hl.clickontestcaselink();
		Thread.sleep(2000);
		hl.clickondashboardlink();
		Thread.sleep(2000);
		hl.clickonloginlink();
		Thread.sleep(2000);
		hl.clickonregisterlink();
		Thread.sleep(2000);
		hl.clickonlogoutlink();
		Thread.sleep(2000);
	}

}
