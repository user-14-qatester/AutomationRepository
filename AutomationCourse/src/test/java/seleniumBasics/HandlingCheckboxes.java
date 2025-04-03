package seleniumBasics;


import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class HandlingCheckboxes extends Base
{
	public void handlingCheckbox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-1']"));
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
				fluentWait.until(ExpectedConditions.elementToBeClickable(checkbox));
		checkbox.click();	
		System.out.println(checkbox.isSelected());
	}
	public void handlingRadiobutton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");	
		WebElement radioButtonElement=driver.findElement(By.xpath("//input[@value='green']"));
		radioButtonElement.click();
		WebElement radio1=driver.findElement(By.xpath("//input[@value='lettuce']"));
		radio1.click();
		System.out.println(radio1.isSelected());
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HandlingCheckboxes handlingcheckbox=new HandlingCheckboxes();
		handlingcheckbox.initializeBrowser();
		handlingcheckbox.handlingRadiobutton();
		//handlingcheckbox.handlingCheckbox();
		//handlingcheckbox.driverCloseAndQuit();
	}

}
