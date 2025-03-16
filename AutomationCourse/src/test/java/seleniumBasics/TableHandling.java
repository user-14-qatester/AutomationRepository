package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base
{

	public void tableHandling()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table1=driver.findElement(By.xpath("//a[@id='showMoreLess']"));//showmore link
		table1.click();
		//fetch data from entire table
		WebElement fullTable=driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(fullTable.getText());
		//fetch data from single row
		WebElement tableRow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		System.out.println(tableRow.getText());
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TableHandling tablehandling=new TableHandling();
		tablehandling.initializeBrowser();
		tablehandling.tableHandling();
		//tablehandling.driverCloseAndQuit();
	}

}
