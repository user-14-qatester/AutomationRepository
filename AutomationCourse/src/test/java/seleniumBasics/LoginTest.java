package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends TestNgBase
{

	@Test(description="Verify whether user is able to successfully login with valid credentials")
	public void verifyWhetherUserCanLoginWithValidCredentials()
	{
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField();
		login.enterPasswordOnPasswordField();
	    login.clickOnLoginButton();
	}
	@Test(description="Verify whether user is able to login with valid username and invalid password")
	public void verifyWhetherUserCanLoginWithValidUsernameAndInvalidPassword()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret123");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
	}
	@Test(description="Verify whether user is able to login with invalid username and valid password")
	public void verifyWhetherUserCanLoginWithInvalidUsernameAndValidPassword()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
	}
	@Test(description="Verify whether user is able to login with invalid credentials")
	public void verifyWhetherUserCanLoginWithInvalidCredentials()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();	
	}
}
