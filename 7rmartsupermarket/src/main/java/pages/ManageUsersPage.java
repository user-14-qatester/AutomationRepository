package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitUtility;

public class ManageUsersPage {
	WaitUtility wait = new WaitUtility();
	public WebDriver driver;

	public ManageUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='nav-link']//child::i[@class='nav-icon fas fa-users']")
	private WebElement adminUserNav;
	@FindBy(xpath = "//p[text()='Manage Users']//parent::a[@class='nav-link']")
	private WebElement manageUserRadiobutton;
	@FindBy(xpath = "//div[@class='col-sm-12']//child::a[@class='btn btn-rounded btn-danger']")
	private WebElement newButtonManageUsersPage;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement usernameField;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordField;
	@FindBy(xpath = "//select[@id='user_type']")
	private WebElement userTypeDropdown;
	@FindBy(xpath = "//button[@type='submit']//child::i[@class='fa fa-save']")
	private WebElement saveButtonManageUsersPage;
	@FindBy(xpath = "//div[@class='col-sm-12']//child::a[@class='btn btn-rounded btn-primary']")
	private WebElement searchButtonManageUsersPage;
	@FindBy(xpath = "//input[@id='un']")
	private WebElement usernameFieldSearchUser;
	@FindBy(xpath = "//select[@id='ut']")
	private WebElement userTypeSearchUser;
	@FindBy(xpath = "//button[@value='sr']")
	private WebElement searchUserButton;
	@FindBy(xpath = "//button[@value='sr']//following::a[@class='btn btn-default btn-fix']")
	private WebElement resetUserButton;
	@FindBy(xpath = "//button[@class='close']")
	private WebElement alertCloseButton;

	@FindBy(xpath = "//h4[text()='Search Admin Users']")
	private WebElement searchUsersHeader;
	@FindBy(xpath = "//h4[text()='Admin Users']")
	private WebElement adminUsersHeader;

	public void clickOnAdminUsersNavigationLink() {
		adminUserNav.click();
	}

	public void clickOnManageUsersRadioButton() {
	//	wait.waitUntilElementToBeSelected(driver, manageUserRadiobutton);
		manageUserRadiobutton.click();
		
	}

	public void clickOnNewButtonOfManageUsersPage() {
		newButtonManageUsersPage.click();
	}

	public void enterValueOnUsernameFieldofManageUsersPage(String username) {
		usernameField.sendKeys(username);
	}

	public void enterValueOnPasswordFieldofManageUsersPage(String password) {
		passwordField.sendKeys(password);
	}

	public void selectUserType() {
		
		Select select = new Select(userTypeDropdown);
		select.selectByIndex(3);
		
	}

	public void clickOnSaveButtonManageUsersPage() {
		wait.waitUntilElementToBeClickable(driver, saveButtonManageUsersPage);
		saveButtonManageUsersPage.click();
	}

	public void clickOnSearchButtonOfManageUsersPage() {
		searchButtonManageUsersPage.click();
	}

	public void enterValueOnUsernameFieldToSearchAUser(String usernameSearchUser) {
		usernameFieldSearchUser.sendKeys(usernameSearchUser);
	}

	public void selectUserTypeToSearchAUser() {
		Select select = new Select(userTypeSearchUser);
		
		select.selectByIndex(2);
	}

	public void clickOnSearchUserButton() {
		searchUserButton.click();
	}

	public void scrollManageUsersPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
	}

	public void clickOnResetButton() {
		resetUserButton.click();
	}

	public boolean isAlertCloseButtonDisplayed() {
		return alertCloseButton.isDisplayed();
	}

	public boolean isSearchUsersHeaderDisplayed() {
		return searchUsersHeader.isDisplayed();
	}

	public boolean isAdminUsersHeaderDisplayed() {
		return adminUsersHeader.isDisplayed();
	}
}
