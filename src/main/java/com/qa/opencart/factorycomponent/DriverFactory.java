package com.qa.opencart.factorycomponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.opencart.exceptions.BrowserException;

public class DriverFactory {
	WebDriver driver;

	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is :" + browserName);
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("please pass theright browser name.." +  browserName);
			throw new BrowserException("INVALID BROWSER " + browserName);
			}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		return driver;
		
	}
	
	
	
	
	
	
	
}
