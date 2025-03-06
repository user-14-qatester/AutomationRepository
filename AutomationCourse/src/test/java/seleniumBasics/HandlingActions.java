package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base
{
	
    public void verifyRightClick()
    {
    	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
    	WebElement showMessage =driver.findElement(By.id("button-one"));
    	Actions actions=new Actions(driver);
    	actions.contextClick(showMessage).build().perform();
    }
    
    public void verifyMouseHover()
    {
    	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
    	WebElement mouseHover=driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
    	Actions actions=new Actions(driver);
    	actions.moveToElement(mouseHover).build().perform();
    }
    
    public void verifyDragAndDrop()
    {
    	driver.navigate().to("https://demoqa.com/droppable");
    	WebElement drag=driver.findElement(By.id("draggable"));
    	WebElement drop=driver.findElement(By.id("droppable"));
    	Actions actions=new Actions(driver);
    	actions.dragAndDrop(drag, drop).build().perform();
    }
    
    public void verifyKeyboardActions() throws AWTException
    {
    	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
    	Robot robot=new Robot();
    	robot.keyPress(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_T);
    	robot.keyRelease(KeyEvent.VK_CONTROL);
    	robot.keyRelease(KeyEvent.VK_T);
    	
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HandlingActions handlingactions=new HandlingActions();
		handlingactions.initializeBrowser();
		try {
			handlingactions.verifyKeyboardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//handlingactions.verifyDragAndDrop();
		//handlingactions.verifyMouseHover();
		//handlingactions.verifyRightClick();
		//handlingactions.driverCloseAndQuit();
		
	}

}
