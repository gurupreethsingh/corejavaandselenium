package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Verificationclass;

public class Logoutpage extends Verificationclass{
	private WebDriver driver;
	public Logoutpage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements( driver,this);
	}
	@FindBy(linkText = "Login")
	private WebElement loginlink;
	@FindBy(linkText ="Home")
	private WebElement homelink;
	@FindBy(linkText ="Register")
	private WebElement registerlink;
	@FindBy(linkText ="Test Case Template")
	private WebElement testcaseTemplate;
	@FindBy(linkText ="Dashboard")
	private WebElement Dashboardlink;
	@FindBy(linkText ="Logout")
	private WebElement logout;
	
	public void clickonlogoutlink() {
		logout.click();
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
	public void clickondashboardlink() {
		Dashboardlink.click();
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
    public void checktitleofdashboardpage(String expectedtitle) throws IOException {
		verifyalltitles(expectedtitle);
	}
	
	
	public void checkurlofdashboardpage(String expectedurl) throws IOException {
		verifyallurls(expectedurl);
	}
    public void checktitleoftestasetemplatepage(String expectedtitle) throws IOException {
		verifyalltitles(expectedtitle);
	}
	
	
	public void checkurloftestcasetemplatepage(String expectedurl) throws IOException {
		verifyallurls(expectedurl);
	}
	public void checktitleofhomepage(String expectedtitle) throws IOException {
		verifyalltitles(expectedtitle);
	}
	
public void checkurlofhomepage(String expectedurl) throws IOException {
	verifyallurls(expectedurl);
}

}
