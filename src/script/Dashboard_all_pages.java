package script;

import org.testng.annotations.Test;

import generic.OpenCloseclass;
import script.Dashboardpage_allpage;
import script.Home_page_loginpage;
import script.Testcasetemplate;
import script.Testcasetemplate_allpage;

public class Dashboard_all_pages extends OpenCloseclass {
	@Test
	public void goinghome_login() throws Throwable {
		Dashboardpage_allpage hl=new Dashboardpage_allpage(driver);
		hl.clickondashboardlink();
		Thread.sleep(2000);
		hl.clickonloginlink();
		Thread.sleep(2000);
		hl.clickonregisterlink();
		Thread.sleep(2000);
		hl.clickontestcaselink();
		Thread.sleep(2000);
		hl.clickonlogoutlink();
		Thread.sleep(2000);
		
	}

}
