package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class HomePage 
{
    WaitUtility wait=new WaitUtility();
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@data-toggle='dropdown']") private WebElement adminUser;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']") private WebElement logout;
	@FindBy(xpath="//b[text()='7rmart supermarket']") private WebElement mainTitle;
	
	
	public HomePage clickAdminLink()
	{
		adminUser.click();
		return this;
	}
	
	public LoginPage clickLogoutLink()
	{
		wait.waitUntilVisibilityOfElement(driver, logout);
		logout.click();
		return new LoginPage(driver);
	}
	public String getTextFromTitle()
	{
		return mainTitle.getText();
	}
}
