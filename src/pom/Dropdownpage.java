package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Verificationclass;

public class Dropdownpage extends Verificationclass{

	public Dropdownpage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(linkText ="DropDowns / CheckBox")
	private WebElement dropdown;
	@FindBy(linkText ="Dashboard")
	private WebElement Dashboardlink;
	@FindBy(linkText = "Login")
	private WebElement loginlink;
	@FindBy(linkText ="Home")
	private WebElement homelink;
	@FindBy(linkText ="Register")
	private WebElement registerlink;
	@FindBy(linkText ="Test Case Template")
	private WebElement testcaseTemplate;
	@FindBy(linkText ="Logout")
	private WebElement logout;
	@FindBy(xpath="//button[contains(text(),'bootstrap dropdown')]")
	private WebElement bootstrap;
	@FindBy(linkText="Action2 - RegisterPage")
	private WebElement dropregister;
	public void clickdropregister()
	{
		dropregister.click();
	}
	public void clickonbootstrap()
	{
		bootstrap.click();
	}
	public void clickondropdown()
	{
		dropdown.click();
	}
	public void clickondashboardlink() {
		Dashboardlink.click();
	}
	public void clickonloginlink() {
		loginlink.click();
	}
	public void clickonhomelink() {
		homelink.click();
	}
	public void clickonregisterlink() {
		registerlink.click();
	}
	public void clickontestcasetemplatelink() {
		testcaseTemplate.click();
	}
	public void clickonlogoutlink() {
		logout.click();
	}
	public void checktitleofregister(String expectedtitle) throws IOException {
		verifyalltitles(expectedtitle);
	}
	
	
	public void checkurlofregister(String expectedurl) throws IOException {
		verifyallurls(expectedurl);
	}
    public void checktitleofloginpage(String expectedtitle) throws IOException {
		verifyalltitles(expectedtitle);
	}
	
	
	public void checkurlofloginpage(String expectedurl) throws IOException {
		verifyallurls(expectedurl);
	}
	  public void checktitleoftestasetemplatepage(String expectedtitle) throws IOException {
			verifyalltitles(expectedtitle);
		}
		
		
		public void checkurloftestcasetemplatepage(String expectedurl) throws IOException {
			verifyallurls(expectedurl);
		}
	    public void checktitleoflogoutpage(String expectedtitle) throws IOException {
			verifyalltitles(expectedtitle);
		}
		
		
		public void checkurloflogoutpage(String expectedurl) throws IOException {
			verifyallurls(expectedurl);
		}
		  public void checktitleofhomepage(String expectedtitle) throws IOException {
				verifyalltitles(expectedtitle);
			}
			
		public void checkurlofhomepage(String expectedurl) throws IOException {
			verifyallurls(expectedurl);
		}
}
