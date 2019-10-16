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

/* This Example shows how to find number of rows under given table in a webPage*/
class Example1 {

private WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@Test(description = "Find number of rows by using tag name <tr>")
	public void findByTag() {
		try {
			driver.get("http://www.apsrtconline.in/oprs-web/");
			driver.findElement(By.xpath("//*[@value='Depart On']")).click();
			Thread.sleep(2000);
			WebElement table = driver.findElement(By.xpath(("(//table)[1]")));
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			System.out.println("Number of Rows:" + rows.size());
			for (WebElement row : rows) {
				DriverHelper.highlightObject(driver, row);
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
