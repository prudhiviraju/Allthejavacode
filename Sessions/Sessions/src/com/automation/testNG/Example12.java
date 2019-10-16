0package com.automation.testNG;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show how to use @DataProvider and retrieve data from Excel*/
class Example12 {

	private WebDriver driver = null;

	@Parameters({"browser"})
	@BeforeTest
	public void beforeTest(String browser) {
		switch (browser.toUpperCase()) {
			case "CHROME":
				System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
				driver = new ChromeDriver();
				break;
			case "FF":
				System.setProperty("webdriver.gecko.driver", ApplicationConstants.FIREFOX_DRIVER);
				driver = new FirefoxDriver();
				break;
			case "IE":
				System.setProperty("webdriver.ie.driver", ApplicationConstants.IE_DRIVER);
				driver = new InternetExplorerDriver();
				break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
	}


	@Test(dataProvider = "getTestData")
	public void loginAndVerifyTitle(String userName, String password,String firstName,String lastName) {
		
		driver.get("http://newtours.demoaut.com/");
		
		/* Login into application */
		driver.findElement(By.name("userName")).sendKeys(userName);

		driver.findElement(By.name("password")).sendKeys(password);

		driver.findElement(By.name("login")).click();

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

		Assert.assertNotNull(result);

		/* Sing off */
		driver.findElement(By.xpath("//*[text()='SIGN-OFF']")).click();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@DataProvider(name = "getTestData")
	public Object[][] getTestData() {
		Object[][] testData = null;
		int numberOfRows;
		int numberOfColumns;
		Workbook workBook = null;
		Sheet sheet = null;
		Row row = null;
		String testDataFile = ApplicationConstants.TESTDATA_PATH + "NewTours.xls";
		try {
			if (testDataFile.endsWith(".xlsx")) {
				workBook = new XSSFWorkbook(new FileInputStream(testDataFile));
			} else if (testDataFile.endsWith(".xls")) {
				workBook = new HSSFWorkbook(new FileInputStream(testDataFile));
			}

			sheet = workBook.getSheet("TestData");
			numberOfRows = sheet.getPhysicalNumberOfRows();
			numberOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();
			testData = new Object[numberOfRows-1][numberOfColumns-1];
			System.out.println("NumberOfRows:" + numberOfRows);
			System.out.println("NumberOfColumns:" + numberOfColumns);
			for (int rowIndex = 1; rowIndex < numberOfRows; rowIndex++) {
				row = sheet.getRow(rowIndex);
				numberOfColumns = row.getPhysicalNumberOfCells();
				for (int column = 1; column < numberOfColumns; column++) {
					System.out.println(row.getCell(column).toString());
					testData[rowIndex-1][column-1] = row.getCell(column).toString();
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
		return testData;

	}

}
