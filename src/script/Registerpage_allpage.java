package script;

import org.testng.annotations.Test;

import generic.OpenCloseclass;
import script.Home_page_loginpage;
import script.Registerpage_allpages;

public class Registerpage_allpage extends OpenCloseclass {
	@Test
	public void goinghome_login() throws Throwable {
		Registerpage_allpages hl=new Registerpage_allpages(driver);
		hl.clickonregisterlink();
		Thread.sleep(2000);
		hl.clickonloginlink();
		Thread.sleep(2000);
		hl.clickondashboardlink();
		Thread.sleep(2000);
		hl.clickontestcaselink();
		Thread.sleep(2000);
		hl.clickonlogoutlink();
		Thread.sleep(2000);
	}

}
