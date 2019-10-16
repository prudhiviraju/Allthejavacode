package com.automation.frameworks.testScripts.keywordDriven;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.frameworks.exceptions.FrameworkException;
import com.automation.frameworks.helper.TestDataHelper;
import com.automation.frameworks.utils.Logger;
import com.automation.selenium.utils.ApplicationConstants;

class KeywordScript {

	private WebDriver driver = null;

	@BeforeTest
	protected void onInitialize() {
		try {
			Logger.info("onInitialize");
			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		} catch (Exception exception) {
			Logger.error(exception.getMessage());
		}

	}

	@Test
	public void execute() {
		String action = null;
		String object = null;
		String testData = null;
		int totalRows = -1;
		try {
			Logger.info("execute");
			TestDataHelper dataHelper = new TestDataHelper(System.getProperty("user.dir") + File.separator+ "resources" + File.separator + "testData"	+ File.separator + "ApplyPanOnline.xls","Keyword");
			totalRows = dataHelper.getNumberOfRows();
			for (int rowNumber = 1; rowNumber < totalRows; rowNumber++) {
				action = dataHelper.getCellData(rowNumber, 3);
				object = dataHelper.getCellData(rowNumber, 4);
				testData = dataHelper.getCellData(rowNumber, 5);
				executeAction(driver, action, object, testData);
			}
		} catch (Exception exception) {
			new FrameworkException(exception);
		}
	}

	public static void executeAction(WebDriver driver, String action,String object, String testData) {
		try {
			Logger.info("executeAction" + action + ":" + object + ":" + testData);
			switch (action.toUpperCase()) {
			case "OPEN":
				driver.get(testData);
				break;
			case "CLOSE":
				driver.close();
				break;
			case "CLICK":
				driver.findElement(By.xpath(object)).click();
				break;
			case "SENDKEYS":
				driver.findElement(By.xpath(object)).sendKeys(testData);
				break;
			case "SLEEP":
				Thread.sleep(Integer.valueOf(testData)*1000);
				break;	
			default:
				System.out.println("Wrong action mentioed in excel" + action);
			}
		} catch (Exception exception) {
			new FrameworkException(exception);
		}

	}

	@AfterTest
	protected void onTerminate() {
		Logger.info("onTerminate");
		try {
			Thread.sleep(5000);
		} catch (Exception exception) {
			Logger.error(exception.getMessage());
		}
	}

}
