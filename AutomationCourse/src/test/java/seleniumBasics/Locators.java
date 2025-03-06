package seleniumBasics;

import org.openqa.selenium.By;

public class Locators extends Base
{
	public void handlingLocators()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("author"));
		driver.findElement(By.linkText("Checkbox Demo"));
		driver.findElement(By.partialLinkText("Radio Buttons"));
		driver.findElement(By.cssSelector("button[id='button-one']"));
	//absolute xpath of textbox /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input
		driver.findElement(By.xpath("//input[@id='single-input-field']")); //relative xpath
		driver.findElement(By.xpath("//button[@id='button-two']")); //relative xpath
		driver.findElement(By.xpath("//input[@id='value-a']"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		driver.findElement(By.xpath("//button[@type='button' and @id='button-two']"));
		driver.findElement(By.xpath("//button[@type='buttonsecond' or @id='button-two']"));
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Locators locator=new Locators();
		locator.initializeBrowser();
		locator.handlingLocators();
		locator.driverCloseAndQuit();

	}

}
