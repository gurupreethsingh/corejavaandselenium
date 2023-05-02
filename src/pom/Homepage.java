package pom;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import generic.Verificationclass;

public class Homepage extends Verificationclass{
	private WebDriver driver;
	public Homepage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements( driver,this);
	}
	@FindBy(id="exampleInputEmail1")
	private WebElement emailtextfield;
	@FindBy(id="exampleInputPassword1")
	private WebElement passwordtextfield;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement registerclick;
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement loginclick;
	@FindBy(linkText ="Home")
	private WebElement homelink;
	@FindBy(linkText = "Login")
	private WebElement loginlink;
	@FindBy(linkText ="Register")
	private WebElement registerlink;
	@FindBy(linkText ="Dashboard")
	private WebElement Dashboardlink;
	@FindBy(linkText ="Test Case Template")
	private WebElement testcaseTemplate;
	@FindBy(linkText ="Logout")
	private WebElement logout;
	@FindBy(linkText ="DropDowns / CheckBox")
	private WebElement dropdown;
	@FindBy(xpath="//button[contains(text(),'bootstrap dropdown')]")
	private WebElement bootstrap;
	@FindBy(linkText="Action2 - RegisterPage")
	private WebElement dropregister;
	@FindBy(linkText="Add New Employee")
	private WebElement addnewemployee;
	@FindBy(id="name")
	private WebElement  nameofnewemployee;
	@FindBy(id="email")
	private WebElement  emailofnewemployee;
	@FindBy(id="phone")
	private WebElement phoneofnewemployee;
	@FindBy(id="address")
	private WebElement addressofnewemployee;
	@FindBy(xpath="//button[contains(@class,'text-light')]")
	private WebElement addemployee;
	@FindBy(xpath="(//a[text()='View Full Profile'])[last()]")
	private WebElement lastemployee;
	@FindBy(linkText="Javascript Alerts")
	private WebElement alerthandling;
	@FindBy(xpath="//button[text()='Show Alert Button']")
	private WebElement showalert;
	@FindBys({@FindBy(tagName="input")})
	private List<WebElement> allboxes; 
	@FindBy(linkText="Instagram")
	private WebElement instalink;
	public void clickoninstalink(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(instalink).click(instalink).build().perform();
	}
	public void tickingAllboxes() throws InterruptedException
	{
		for(WebElement eachboxes:allboxes)
		{
			if(eachboxes.isSelected()==false)
			{
				eachboxes.click();
				Thread.sleep(2000);
			}
		}
	}
	public void clickonshowalert()
	{
		showalert.click();
	}
	public void clickonalertlink()
	{
		alerthandling.click();
	}
	public void fetchlastemployee()
	{
		lastemployee.click();
	}
	public void clickonaddemployee()
	{
		addemployee.click();
		
	}
	public void addressEmployee(String name)
	{
		addressofnewemployee.sendKeys(name);
	}
	public void phoneEmployee(String name)
	{
		phoneofnewemployee.sendKeys(name);
	}
	public void emailEmployee(String name)
	{
		emailofnewemployee.sendKeys(name);
	}
	public void nameEmployee(String name)
	{
		nameofnewemployee.sendKeys(name);
	}
	
	public void addemployee()
	{
		addnewemployee.click();
	}
	public void clickdropregister()
	{
		dropregister.click();
	}
	public void clickonbootstrap()
	{
		bootstrap.click();
	}
	public void clickonregister()
	{
		registerclick.click();
	}
	public void clickondropdown()
	{
		dropdown.click();
	}
	
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
	public void clickonhomelink() {
		homelink.click();
	}

	public void clickonloginlink() {
		loginlink.click();
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
	public void checktitleofhome(String expectedtitle) throws IOException {
		verifyalltitles(expectedtitle);
	}
	
	
	public void checkurlofhome(String expectedurl) throws IOException {
		verifyallurls(expectedurl);
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
    public void checktitleoflogoutpage(String expectedtitle) throws IOException {
		verifyalltitles(expectedtitle);
	}
	
	
	public void checkurloflogoutpage(String expectedurl) throws IOException {
		verifyallurls(expectedurl);
	}




}
