package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base
{

	public void handlingWebElementCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagefield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messagefield.sendKeys("Nithya");
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showmessagebutton.isDisplayed());
		System.out.println(showmessagebutton.isEnabled());
		
		//applying explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(showmessagebutton));
		
		showmessagebutton.click();
		messagefield.clear();
		System.out.println(showmessagebutton.getCssValue("background-color"));
		System.out.println(messagefield.getTagName());
		WebElement yourmessagetext=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(yourmessagetext.getText());
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebElementCommands web=new WebElementCommands();
		web.initializeBrowser();
		web.handlingWebElementCommands();
		//web.driverCloseAndQuit();
	}

}
