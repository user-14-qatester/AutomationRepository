package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	public WebDriver driver;

public LoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@id='user-name']") private WebElement username;
@FindBy(xpath="//input[@id='password']") private WebElement password;
@FindBy(xpath="//input[@id='login-button']") private WebElement loginButton;



public void enterUsernameOnUsernameField()
{
	username.sendKeys("standard_user");
}

public void enterPasswordOnPasswordField()
{
	password.sendKeys("secret_sauce");
}

public void clickOnLoginButton()
{
	loginButton.click();
}

}
