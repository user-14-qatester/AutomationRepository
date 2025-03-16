package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base
{
	public void simpleAlertHandling()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickme=driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickme.click();
		Alert alertRef=driver.switchTo().alert();
		alertRef.accept();
	}
	public void handlingConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmClick=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmClick.click();
		Alert alertRef1=driver.switchTo().alert();
		alertRef1.accept();
	}
	public void promptAlertHandling()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptAlert=driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptAlert.click();
		Alert alertRef2=driver.switchTo().alert();
		alertRef2.sendKeys("Sample text");
		alertRef2.accept();
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AlertHandling alert=new AlertHandling();
		alert.initializeBrowser();
	//	alert.simpleAlertHandling();
	//	alert.handlingConfirmAlert();
		alert.promptAlertHandling();
		//alert.driverCloseAndQuit();
	}

}
