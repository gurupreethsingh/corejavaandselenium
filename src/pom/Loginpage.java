package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Verificationclass;

public class Loginpage extends Verificationclass{
	private WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements( driver,this);
	}
	@FindBy(linkText = "Login")
	private WebElement loginlink;
	@FindBy(linkText = "Home")
	private WebElement Homelink;
	@FindBy(linkText ="Register")
	private WebElement registerlink;
	@FindBy(linkText ="Dashboard")
	private WebElement Dashboardlink;
	@FindBy(linkText ="Test Case Template")
	private WebElement testcaseTemplate;
	@FindBy(linkText ="Logout")
	private WebElement logout;
	@FindBy(id="exampleInputEmail1")
	private WebElement emailtextfield;
	@FindBy(id="exampleInputPassword1")
	private WebElement passwordtextfield;
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement loginclick;
	public void clickonlogin()
	{
		loginclick.click();
	}
	
	public void sendEmail(String name)
	{
		emailtextfield.sendKeys(name);
	}
	public void sendPassword(String password)
	{
		passwordtextfield.sendKeys(password);
	}
	
	public void clickonloginlink() {
		loginlink.click();
	}
	public void clickonhomelink() {
		Homelink.click();
	}
	public void clickonregisterlink() {
		registerlink.click();
	}
	public void clickondashboardlink() {
		Dashboardlink.click();
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
    public void checktitleofhomepage(String expectedtitle) throws IOException {
		verifyalltitles(expectedtitle);
	}
	
	
	public void checkurlofhomepage(String expectedurl) throws IOException {
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
    public void checktitleoflogoutpage(String expectedtitle) throws IOException {
		verifyalltitles(expectedtitle);
	}
	
	
	public void checkurloflogoutpage(String expectedurl) throws IOException {
		verifyallurls(expectedurl);
	}




}
