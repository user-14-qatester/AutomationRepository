package seleniumBasics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends TestNgBase
{

	@Test(description="Verify whether user is able to successfully login with valid credentials",priority=1)
	public void verifyWhetherUserCanLoginWithValidCredentials() throws IOException
	{
		String usernameValue=ExcelUtility.getStringdata(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringdata(0, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
	    login.clickOnLoginButton();
	}
	@Test(description="Verify whether user is able to login with valid username and invalid password",priority=2)
	public void verifyWhetherUserCanLoginWithValidUsernameAndInvalidPassword() throws IOException
	{
		String usernameValue=ExcelUtility.getStringdata(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringdata(1, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
	    login.clickOnLoginButton();
	}
	@Test(description="Verify whether user is able to login with invalid username and valid password",priority=4)
	public void verifyWhetherUserCanLoginWithInvalidUsernameAndValidPassword() throws IOException
	{
		
		String usernameValue=ExcelUtility.getStringdata(2, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringdata(2, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
	    login.clickOnLoginButton();
	}
	@Test(description="Verify whether user is able to login with invalid credentials",priority=3)
	public void verifyWhetherUserCanLoginWithInvalidCredentials() throws IOException
	{
		String usernameValue=ExcelUtility.getStringdata(3, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringdata(3, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernameValue);
		login.enterPasswordOnPasswordField(passwordValue);
	    login.clickOnLoginButton();	
	}
}
