package testscripts;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;

public class SubCategoryTest extends Base {

	@Test(description = "Verify whether user is able to add a new category on the subcategory page", priority = 1)
	public void verifyWhetherUserIsAbleToAddANewCategoryOnTheSubCategoryPage() throws IOException, AWTException {
		String usernamevalue = ExcelUtility.getStringdata(0, 0, "LoginPageData");
		String passwordvalue = ExcelUtility.getStringdata(0, 1, "LoginPageData");
		LoginPage login = new LoginPage(driver);
		login.enterUsername(usernamevalue);
		login.enterPassword(passwordvalue);
		login.clickOnSignInButton();
		SubCategoryPage subcategory = new SubCategoryPage(driver);

		//subcategory.clickOnSubCatgeoryNavigationLin();
		subcategory.clickOnSubcategoryHomeButton();
		subcategory.clickOnNewButton();
		subcategory.selectCategoryDropDown();
		String subcategoryValue = ExcelUtility.getStringdata(3, 0, "VegetablesSubcategories");
		subcategory.enterValueOnSubCategoryField(subcategoryValue);
		subcategory.chooseFileUsingRobotClass();
		subcategory.clickSaveButton();
		boolean isCloseButtonOfAlertDisplayed = subcategory.isAlertDisplayedOnAddingANewSubcategory();
		Assert.assertTrue(isCloseButtonOfAlertDisplayed, "User was not able to add a new subcategory");
	}

	@Test(description = "Verify whether user is able to perform search on the subcategory page", priority = 2)
	public void verifyWhetherUserIsAbleToPerformSearchOnTheSubCategoryPage() throws IOException {
		String usernamevalue = ExcelUtility.getStringdata(0, 0, "LoginPageData");
		String passwordvalue = ExcelUtility.getStringdata(0, 1, "LoginPageData");
		LoginPage login = new LoginPage(driver);
		login.enterUsername(usernamevalue);
		login.enterPassword(passwordvalue);
		login.clickOnSignInButton();
		SubCategoryPage subcategory = new SubCategoryPage(driver);

		//subcategory.clickOnSubCatgeoryNavigationLink();
		subcategory.clickOnSubcategoryHomeButton();
		subcategory.clickOnSearchButton();
		subcategory.selectCategoryDropDownSearchPage();
		String subcategoryValueOfSearchPage = ExcelUtility.getStringdata(1, 0, "VegetablesSubcategories");
		subcategory.enterValueOnSubCategoryFieldOfSearchPage(subcategoryValueOfSearchPage);
		subcategory.clickOnSearchButtonOfSubCategorySearchPage();
		boolean isListSubcategoriesHeaderDisplayed = subcategory.isListSubcategoriesHeaderDisplayedOnSearchingASubcategory();
		Assert.assertTrue(isListSubcategoriesHeaderDisplayed,"Search results not displayed on searching for a subcategory");
	}

}
