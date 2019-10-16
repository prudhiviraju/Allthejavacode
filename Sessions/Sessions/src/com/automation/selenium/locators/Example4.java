package com.automation.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;
import com.automation.selenium.utils.DriverHelper;

/* Example to show how to use findElementByXPath()method */
class Example4 {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		try {
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("http://www.redbus.in/");

			WebElement btnSearch = driver.findElement(By.xpath("//*[text()='Search Buses']"));

			DriverHelper.highlightObject(driver, btnSearch);

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}

	}

}
