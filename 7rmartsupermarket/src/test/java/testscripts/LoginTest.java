package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base
{
	
	@Test(description="Verify whether user is able to successfully login with valid credentials",priority=4,retryAnalyzer=retry.Retry.class)
	public void verifyWhetherUserIsAbleToLoginWithValidCredentials() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringdata(0, 0, "LoginPageData");
		String passwordvalue=ExcelUtility.getStringdata(0, 1, "LoginPageData");
		LoginPage testlogin=new LoginPage(driver);
		testlogin.enterUsername(usernamevalue).enterPassword(passwordvalue).clickOnSignInButton();
		boolean isDashboardDisplayed=testlogin.isDashboardDisplayed();
		Assert.assertTrue(isDashboardDisplayed,Messages.VALIDCREDENTIALERROR);
	}
	
	@Test(description="Verify whether user is able to login with valid username and invalid password",priority=2,groups={"smoke"})
	public void verifyWhetherUserIsAbleToLoginWithValidUsernameAndInvalidPassword() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringdata(1, 0, "LoginPageData");
		String passwordvalue=ExcelUtility.getStringdata(1, 1, "LoginPageData");
		LoginPage testlogin=new LoginPage(driver);
		testlogin.enterUsername(usernamevalue);
		testlogin.enterPassword(passwordvalue);
		testlogin.clickOnSignInButton();
		boolean isErrorAlertDisplayed=testlogin.isErrorAlertDisplayed();
		Assert.assertTrue(isErrorAlertDisplayed, "User is able to login with valid username and invalid password");
	}
	
	@Test(description="Verify whether user is able to login with invalid username and valid password",priority=3,groups={"smoke"})
	public void verifyWhetherUserIsAbleToLoginWithInValidUsernameAndValidPassword() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringdata(2, 0, "LoginPageData");
		String passwordvalue=ExcelUtility.getStringdata(2, 1, "LoginPageData");
		LoginPage testlogin=new LoginPage(driver);
		testlogin.enterUsername(usernamevalue);
		testlogin.enterPassword(passwordvalue);
		testlogin.clickOnSignInButton();
		boolean isErrorAlertDisplayed=testlogin.isErrorAlertDisplayed();
		Assert.assertTrue(isErrorAlertDisplayed, "User is able to login with invalid username and valid password");
	}
	
	@Test(description="Verify whether user is able to login with invalid credentials",priority=1,dataProvider="loginProvider")
	public void verifyWhetherUserIsAbleToLoginWithInvalidCredentials(String usernamevalue,String passwordvalue) throws IOException
	{
		
		LoginPage testlogin=new LoginPage(driver);
		testlogin.enterUsername(usernamevalue);
		testlogin.enterPassword(passwordvalue);
		testlogin.clickOnSignInButton();
		boolean isErrorAlertDisplayed=testlogin.isErrorAlertDisplayed();
		Assert.assertTrue(isErrorAlertDisplayed, "User is able to login with invalid username and invalid password");
	}
	@DataProvider(name="loginProvider")

	public Object[][] getDataFromDataProvider() throws IOException

	{

		return new Object[][] { new Object[] {"admin","admin12"},

			new Object[] {"123","123"},

		//	new Object[] {ExcelUtility.getStringdata(3, 0,"Login"),ExcelUtility.getStringdata(3,1 ,"Login")}

		};

	}
}
