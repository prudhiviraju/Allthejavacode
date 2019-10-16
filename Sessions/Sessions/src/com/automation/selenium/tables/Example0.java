package com.automation.selenium.tables;

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

/* This Example shows how to find number of tables in a webPage*/
class Example0 {

	private WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@Test(description = "Find number of tables by using tag name")
	public void findByTag() {
		try {
			driver.get("http://www.apsrtconline.in/oprs-web/");
			driver.findElement(By.xpath("//*[@value='Depart On']")).click();
			Thread.sleep(2000);
			List<WebElement> tables = driver.findElements(By.tagName("table"));
			System.out.println("Tables Count by using tag name:" + tables.size());
			for (WebElement table : tables) {
				DriverHelper.highlightObject(driver, table);
				Thread.sleep(1000);
			}
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		}

	}
	
	@Test(description = "Find number of tables by using xpath")
	public void findByXPath() {
		try {
			driver.get("http://www.apsrtconline.in/oprs-web/");
			driver.findElement(By.xpath("//*[@value='Depart On']")).click();
			Thread.sleep(2000);
			List<WebElement> tables = driver.findElements(By.xpath("//table"));
			System.out.println("Tables Count by using xpath:" + tables.size());
			for (WebElement table : tables) {
				DriverHelper.highlightObject(driver, table);
				Thread.sleep(1000);
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
