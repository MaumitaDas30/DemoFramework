package com.qa.openkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstants;

public class LoginPage {
 
	private WebDriver driver;
	
	//1. private By locators : page objects
	private By username = By.id("input-email");
	private By password = By.id("input-password");
	private By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	private By forgotPwdLink = By.linkText("Forgotten Password");
	
	
	//2. Public Page Const..
	public LoginPage(WebDriver driver)   {
		this.driver = driver;
	}
	
	
	//3. Public Page Actions/Methods
	
	public String getLoginPageTitle() {
		
		String title = eleUtil.waitForTitleContainsAndReturn(AppConstants.LOGIN_PAGE_TITLE, AppConstants.DEFAULT_SHORT_TIME_OUT);
	    System.out.println("login page title: "+title);
	    return title;
	}
		
	public String getLoginPageURL() {
		String url = driver.getCurrentUrl();
	    System.out.println("login page title: "+ url);
	    return url;
	}
	  
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	public boolean isLogoExist() {
		return driver.findElement(logo).isDisplayed();
	}
	
	 public String doLogin(String userName, String pwd) {
		driver.findElement(username).sendKeys(userName);
		 driver.findElement(password).sendKeys(pwd);
		 driver.findElement(loginBtn).click();
		 return driver.getTitle();
		 
	 }
	
	
	
	
	
	
	
	
	
}
