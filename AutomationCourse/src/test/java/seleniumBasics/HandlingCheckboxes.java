package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckboxes extends Base
{
	public void handlingCheckbox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-1']"));
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
