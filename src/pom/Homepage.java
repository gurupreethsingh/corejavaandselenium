package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.Verificationclass;

public class Homepage extends Verificationclass{
	// find the webelements. 
			@FindBy(xpath = "//a[text()='Login']")
			private WebElement loginlink;
			
			@FindBy(xpath = "//input[@id='exampleInputEmail1']")
			private WebElement usernamefield;
			
			
			@FindBy(xpath = "//input[@type='password']")
			private WebElement passwordfield;
			
			@FindBy(xpath = "//button[.='Sign In']")
			private WebElement loginbutton;
			
			@FindBy(xpath = "//a[.='Register']")
			private WebElement registerlink;
			
			@FindBy(xpath = "//a[.='Register']")
			private WebElement signup;
			
			@FindBy(xpath = "//a[.='Add New Employee']")
			private WebElement addemployee;
			
			@FindBy(xpath = "//input[@id='name']")
					private WebElement addname;
			
			@FindBy(xpath = "(//a[.='View Full Profile'])[1]")
			private WebElement viewemployee;
			
			
			@FindBy(xpath = "//input[@id='email']")
					private WebElement addmail;
			
			@FindBy(xpath = "//input[@id='phone']")
			private WebElement addphone;
			
			@FindBy(xpath = "//input[@id='address']")
			private WebElement addaddress;
			
			
			@FindBy(xpath = "//button[.='Add Employee']")
			private WebElement addempbutton;
			
			@FindBy(xpath = "(//a[.='Delete'])[2]")
			private WebElement deleteemp;
			
			@FindBy(xpath = "//a[.='Logout']")
			private WebElement logout;
			
			@FindBy(xpath = "(//a[.='View Full Profile'])[1]")
			private WebElement viewemploye;
			
		public Homepage(WebDriver driver){
			super(driver);
			PageFactory.initElements(driver, this);
		}
		
		
		
		public void clickonloginlink(String username ,String password) throws InterruptedException {
			loginlink.click();
			usernamefield.sendKeys(username);
			passwordfield.sendKeys("1234");
			Thread.sleep(3000);
            loginbutton.click();
            Thread.sleep(3000);
		}
        public void addemployee(String name, String email, String phone, String address) throws InterruptedException {
        	addemployee.click();
        	addname.sendKeys(name);
        	addmail.sendKeys(email);
        
        	addphone.sendKeys("121324233");
        	
        	addaddress.sendKeys("banglore");
        	Thread.sleep(3000);
        	addempbutton.click();
        	
        	logout.click();
        	Thread.sleep(3000);
        }
        
        
     
        	
     
        
		
		public void clickonregisterlink(String username ,String password) throws InterruptedException {
			registerlink.click();
			usernamefield.sendKeys(username);
			passwordfield.sendKeys("1234");
			Thread.sleep(3000);
			signup.click();
			Thread.sleep(3000); 
		}
			
		public void viewemployee(String username ,String password) throws InterruptedException {
			loginlink.click();
			usernamefield.sendKeys(username);
			passwordfield.sendKeys("1234");
			Thread.sleep(3000);
            loginbutton.click();
            Thread.sleep(3000);
            viewemploye.click();
            Thread.sleep(3000);
		}
	 }
        
		

