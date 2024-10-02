package Com.qa.opencart.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import com.qa.opencart.factorycomponent.DriverFactory;
import com.qa.openkart.pages.LoginPage;

public class Basetest {
     WebDriver driver;
     DriverFactory df;
     
     protected LoginPage loginPage;
     
     public void setup() {
    	 
    	 df = new DriverFactory();
    	driver = df.initDriver("chrome");
    	loginPage = new LoginPage(driver);
    	 }
    	 
    	 @AfterTest
    	 public void tearDown() {
    		 driver.quit();
    	 
    	 
    	 
     }
	
	
	
}
