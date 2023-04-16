package script;

import org.testng.annotations.Test;

import generic.OpenCloseclass;
import script.Home_page_loginpage;

public class Home_to_login extends OpenCloseclass {
	@Test
	public void goinghome_login() throws Throwable {
		Home_page_loginpage hl=new Home_page_loginpage(driver);
		hl.clickonloginlink();
		Thread.sleep(2000);
		hl.clickonregisterlink();
		Thread.sleep(2000);
		hl.clickondashboardlink();
		Thread.sleep(2000);
		hl.clickontestcaselink();
		Thread.sleep(2000);
	}

}
