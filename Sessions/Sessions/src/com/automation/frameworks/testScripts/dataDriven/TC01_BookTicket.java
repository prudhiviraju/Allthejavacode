package com.automation.frameworks.testScripts.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to implement automation scripts by using Data Driven Framework */
class TC01_BookTicket {

	@Test(dataProvider="testData")
	public void bookTicket(String userName,String password,String firstName,String lastName) {
		WebDriver driver = null;

		try {

			/* Create Driver object */
			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			driver.get("http://newtours.demoaut.com/");

			/* Login into application */
			driver.findElement(By.name("userName")).sendKeys(userName);

			driver.findElement(By.name("password")).sendKeys(password);

			driver.findElement(By.name("login")).click();
			
			WebElement signOff = driver.findElement(By.xpath("//*[text()='SIGN-OFF']"));
			
			Assert.assertNotNull(signOff,"Verification for Login");
			
			/* find flight */
			driver.findElement(By.xpath("//*[@value='oneway']")).click();

			driver.findElement(By.name("passCount")).sendKeys("1");

			driver.findElement(By.xpath("//*[@value='Business']")).click();

			driver.findElement(By.name("findFlights")).click();

			/* select flight */
			driver.findElement(By.xpath("//*[@type ='radio' and contains(@value,'Unified Airlines$363')]")).click();

			driver.findElement(By.xpath("//*[@type ='radio' and contains(@value,'Unified Airlines$633')]")).click();

			driver.findElement(By.name("reserveFlights")).click();

			/* book flight */
			driver.findElement(By.name("passFirst0")).sendKeys(firstName);

			driver.findElement(By.name("passLast0")).sendKeys(lastName);

			driver.findElement(By.name("pass.0.meal")).sendKeys("Vegetarian");

			driver.findElement(By.name("buyFlights")).click();

			WebElement result = driver.findElement(By.xpath("//*[contains(text(),'itinerary has been booked!')]"));

			Assert.assertNotNull(result,"Verification for book a ticket");

			/* Sing off */
			driver.findElement(By.xpath("//*[text()='SIGN-OFF']")).click();

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		} finally {
			driver.quit();
		}
	}
	
	@DataProvider(name = "testData")
	public String[][] testData() {

		String[][] data = null;
		Workbook workBook = null;
		Sheet sheet = null;
		String testDataFile = System.getProperty("user.dir") + File.separator + "resources" + File.separator + "testData" +File.separator + "DataDriven.xls";
		try {
			if(testDataFile.endsWith(".xlsx")){
				workBook = new XSSFWorkbook(new FileInputStream(testDataFile));
			}else if(testDataFile.endsWith(".xls")){
				workBook = new HSSFWorkbook(new FileInputStream(testDataFile));
			}
			
			sheet = workBook.getSheet("TestData");
			int numberOfRows = sheet.getPhysicalNumberOfRows();
			int numberOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();
			data = new String[numberOfRows-1][numberOfColumns];
			for (int rowIndex = 1; rowIndex <= numberOfRows; rowIndex++) {
				for (int columnIndex = 0; columnIndex < numberOfColumns; columnIndex++) {
					data[rowIndex-1][columnIndex] = sheet.getRow(rowIndex).getCell(columnIndex).toString();
				}
			}
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			try {
				workBook.close();
			} catch (Exception exception) {
				System.out.println(exception.getMessage());
			}
		}

		return data;

	}

}
