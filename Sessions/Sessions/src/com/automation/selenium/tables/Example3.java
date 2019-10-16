package com.automation.selenium.tables;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;
import com.automation.selenium.utils.DriverHelper;

/* This Example shows how to get data given table in a webPage*/
class Example3 {

	private WebDriver driver = null;
	
	private WebElement cell = null;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@Test(description = "get cell data from the given table")
	public void getCellData() {
		try {
			driver.get("http://www.apsrtconline.in/oprs-web/");
			driver.findElement(By.xpath("//*[@value='Depart On']")).click();
			Thread.sleep(2000);
			
			cell = driver.findElement(By.xpath(("(((//table)[1]//tr)[1]//th)[1]")));
			System.out.println("1 row 1 column data :"+cell.getText());
			
			cell = driver.findElement(By.xpath(("(((//table)[1]//tr)[1]//th)[2]")));
			System.out.println("1 row 2 column data :"+cell.getText());
			
			cell = driver.findElement(By.xpath(("(((//table)[1]//tr)[1]//th)[3]")));
			System.out.println("1 row 3 column data :"+cell.getText());
			
			cell = driver.findElement(By.xpath(("(((//table)[1]//tr)[1]//th)[4]")));
			System.out.println("1 row 4 column data :"+cell.getText());
			
			cell = driver.findElement(By.xpath(("(((//table)[1]//tr)[1]//th)[5]")));
			System.out.println("1 row 5 column data :"+cell.getText());
			
			cell = driver.findElement(By.xpath(("(((//table)[1]//tr)[1]//th)[6]")));
			System.out.println("1 row 6 column data :"+cell.getText());
			
			cell = driver.findElement(By.xpath(("(((//table)[1]//tr)[1]//th)[7]")));
			System.out.println("1 row 7 column data :"+cell.getText());
			
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		}
	}
	
	
	@Test(description = "Get all cells data from the given table")
	public void getAllTableData() {
		try {
			driver.get("http://www.apsrtconline.in/oprs-web/");
			driver.findElement(By.xpath("//*[@value='Depart On']")).click();		
			Thread.sleep(2000);
			WebElement table = driver.findElement(By.xpath("(//table)[1]"));
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			System.out.println("Number of Rows:" + rows.size());
			List<WebElement> columns = null;
			for (int index = 0; index < rows.size(); index++) {
				DriverHelper.highlightObject(driver, rows.get(index));
				if(index==0){
					columns = rows.get(index).findElements(By.tagName("th"));
				}else{
					columns = rows.get(index).findElements(By.tagName("td"));
				}
				Iterator<WebElement> columnsIterator = columns.iterator();
				while(columnsIterator.hasNext()){
					WebElement column = columnsIterator.next();
					System.out.print(column.getText() + "\t");
				}
				System.out.println();
			}
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		}
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
}
