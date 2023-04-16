package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Datareading;
import generic.OpenCloseclass;

import pom.Homepage;

public class loginmodule extends OpenCloseclass {
	
	@Test
	public void openloginpage() throws InterruptedException {
		Homepage hp=new Homepage(driver);
		String username=Datareading.getdata("Sheet2", 0, 0);
    	String password=Datareading.getdata("Sheet2", 0, 1);
    	hp.clickonloginlink(username,password);
    	
    	String name=Datareading.getdata("Sheet4", 0, 0);
    	String email=Datareading.getdata("Sheet4", 0, 1);
    	String phone=Datareading.getdata("Sheet4", 0, 2);
    	String address=Datareading.getdata("Sheet4", 0, 3);
    	hp.addemployee(name, email, phone, address);
	}
	
	
	@Test
	public void redisterpage() throws InterruptedException {
		Homepage hp=new Homepage(driver);
		String username=Datareading.getdata("Sheet3", 0, 0);
    	String password=Datareading.getdata("Sheet3", 0, 1);
    	hp.clickonregisterlink(username,password);
    
	}
	
	@Test
	public void viewrmp() throws InterruptedException {
		Homepage hp=new Homepage(driver);
		String username=Datareading.getdata("Sheet2", 0, 0);
    	String password=Datareading.getdata("Sheet2", 0, 1);
    	hp.viewemployee(username, password);
	
	}
	
	
	
	
	
	

}
