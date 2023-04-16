package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OpenCloseclass implements Constant {

	public WebDriver driver;
	
	@BeforeMethod 
	public void openapplication() {
		
		driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(urlofapplication);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	}
	
	@AfterMethod 
	public void closeapplication() {
		
		driver.quit();
		
	}
	
	
}
