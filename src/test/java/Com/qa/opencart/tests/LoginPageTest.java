package Com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

	@Test
	public void loginPageTitleTest() {
		String actTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(actTitle,("Account login"));
	}
	
	@Test
	public void loginPageURLTest() {
		String actURL = loginPage.getLoginPageURL();
		Assert.assertTrue(actURL.contains("route=account/login"));
	}
	
	@Test
	public void forgotPWDLinkExistTest() {
		Assert.assertTrue(loginPage.isForgotPWDLinkExist());
	}
	
	@Test
	public void logoExistTest() {
		Assert.assertTrue(loginPage.islogoExist());
	}
	
	@Test (priority = Integer.MAX_VALUE)
	public void loginTest() {
		String accPageTitle = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(accPageTitle, AppConstants, ACCOUNTS_PAGE_TITLE);
	}
	
	
	
	
	
}
