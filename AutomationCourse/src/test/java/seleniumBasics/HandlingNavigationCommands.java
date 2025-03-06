package seleniumBasics;

public class HandlingNavigationCommands extends Base
{
public void handlingNavigationCommands()
{
	driver.navigate().to("https://www.amazon.in/"); //to navigate to another url
	driver.navigate().back(); //to navigate back to previous webpage
	driver.navigate().forward(); //to navigate forward
	driver.navigate().refresh();
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HandlingNavigationCommands navigate=new HandlingNavigationCommands();
		navigate.initializeBrowser();
	    navigate.handlingNavigationCommands();
	//	navigate.driverCloseAndQuit();

	}

}
