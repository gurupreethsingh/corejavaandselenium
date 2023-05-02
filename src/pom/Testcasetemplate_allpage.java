package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.VarificationClass;

public class Testcasetemplate_allpage extends VarificationClass{

	public Testcasetemplate_allpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Test Case Template']")
	private WebElement testcaselink;
	public void clickontestcaselink() {
		testcaselink.click();
	}
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerlink;
	public void clickonregisterlink() {
		registerlink.click();
	}
	@FindBy(xpath="//a[text()='Dashboard']")
	private WebElement dashboardlink;
	public void clickondashboardlink() {
		dashboardlink.click();
	}
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginlink;
	public void clickonloginlink() {
		loginlink.click();
	}
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutlink;
	public void clickonlogoutlink() {
		logoutlink.click();
	}
	

}
