package generic;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Verificationclass  {
	
WebDriver driver;

public Verificationclass(WebDriver driver){
	this.driver=driver;
}

public void verifyloginpage( String ps)
{
	   LocalDateTime now = LocalDateTime.now();  
       DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
       String formatDateTime = now.format(format);  
       String timestamp =  formatDateTime.toString().replace(':', '-');

try {
	 WebDriverWait wait = 	new WebDriverWait(driver, Duration.ofSeconds(10)) ;
	
	
     }catch(Exception ex) {
    	 
    	 Reporter.log("Title not matched."); 
	ex.printStackTrace();
    }
    }
}
