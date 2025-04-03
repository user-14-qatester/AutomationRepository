package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import constants.Constants;
import utilities.PageUtility;
import utilities.WaitUtility;

public class SubCategoryPage {

	WaitUtility wait = new WaitUtility();
	public WebDriver driver;

	public SubCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Sub Category']//parent::a[@class=' nav-link']")
	private WebElement subcategoryNav;
	@FindBy(xpath = "//div[@class='col-sm-12']//child::a[@class='btn btn-rounded btn-danger']")
	private WebElement newButton;
	@FindBy(xpath = "//select[@id='cat_id']")
	private WebElement categoryDropDown;
	@FindBy(xpath = "//input[@id='subcategory']")
	private WebElement subcategoryField;
	@FindBy(xpath = "//input[@id='main_img']")
	private WebElement chooseFileButton;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement saveButton;
	@FindBy(xpath = "//button[@class='close']")
	private WebElement successMessageClose;
	@FindBy(xpath = "//div[@class='col-sm-12']//child::a[@class='btn btn-rounded btn-primary']")
	private WebElement searchButton;
	@FindBy(xpath = "//select[@id='un']")
	private WebElement categoryDropdownSearchPage;
	@FindBy(xpath = "//input[@name='ut']")
	private WebElement subcategoryFieldOfSearchPage;
	@FindBy(xpath = "//button[@value='sr']")
	private WebElement searchButtonOfSubcategorySearchPage;
	@FindBy(xpath = "//button[@class='close']")
	private WebElement closeButtonOfAlert;
	@FindBy(xpath = "//h4[text()='List Sub Categories']")
	private WebElement listSubcategoriesHeader;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']")
	private WebElement subcatgeoryHomeButton;

	public void clickOnSubCatgeoryNavigationLink() {
		subcategoryNav.click();
	}

	public void clickOnNewButton() {
		newButton.click();
	}

	public void selectCategoryDropDown() {

		PageUtility pageutility = new PageUtility();
		pageutility.selectDropdownWithValue(categoryDropDown, "566");
	}

	public void enterValueOnSubCategoryField(String subcategoryFieldValue) {
		subcategoryField.sendKeys(subcategoryFieldValue);
	}

	public void clickSaveButton() {
		saveButton.click();
	}

	public void clickOnSuccessMessageCloseButton() {
		successMessageClose.click();
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

	public void selectCategoryDropDownSearchPage() {
		PageUtility pageutility = new PageUtility();
		pageutility.selectDropdownWithIndex(categoryDropdownSearchPage, 7);
	}

	public void enterValueOnSubCategoryFieldOfSearchPage(String subcategoryFieldValueOfSearchPage) {
		subcategoryFieldOfSearchPage.sendKeys(subcategoryFieldValueOfSearchPage);
	}

	public void clickOnSearchButtonOfSubCategorySearchPage() {
		searchButtonOfSubcategorySearchPage.click();
	}

	public void chooseFileUsingRobotClass() throws AWTException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", chooseFileButton);
		StringSelection s = new StringSelection(Constants.TESTDATAIMAGE);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot robot = new Robot();
		robot.delay(2500);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public boolean isAlertDisplayedOnAddingANewSubcategory() {
		return closeButtonOfAlert.isDisplayed();
	}

	public boolean isListSubcategoriesHeaderDisplayedOnSearchingASubcategory() {
		return listSubcategoriesHeader.isDisplayed();
	}
	public void clickOnSubcategoryHomeButton()
	{
		subcatgeoryHomeButton.click();
	}
}
