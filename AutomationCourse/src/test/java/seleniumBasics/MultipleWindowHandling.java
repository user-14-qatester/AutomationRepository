package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base
{

	public void multipleWindowHandling()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentWindowHandleId=driver.getWindowHandle();
		System.out.println(parentWindowHandleId);
		WebElement clickHere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		Set<String> handleIds=driver.getWindowHandles();
		System.out.println(handleIds);
		Iterator<String>values=handleIds.iterator();
		while(values.hasNext())
		{
			String current_id=values.next();
			if(!current_id.equals(parentWindowHandleId))
			{
				driver.switchTo().window(current_id);
				WebElement email_fld=driver.findElement(By.xpath("//input[@name='emailid']"));
				email_fld.sendKeys("abc@gmail.com");
				WebElement submit_fld=driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit_fld.click();
				driver.switchTo().defaultContent();
			}
	}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MultipleWindowHandling multiplewindow=new MultipleWindowHandling();
		multiplewindow.initializeBrowser();
		multiplewindow.multipleWindowHandling();
		//multiplewindow.driverCloseAndQuit();
	}

}
