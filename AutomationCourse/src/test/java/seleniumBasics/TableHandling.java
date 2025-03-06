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
		WebElement fullTable=driver.findElement(By.xpath("//table[@id='dataTable']"));//fetch data from entire table
		System.out.println(fullTable.getText());
		WebElement tableRow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));//fetch data from single row
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
