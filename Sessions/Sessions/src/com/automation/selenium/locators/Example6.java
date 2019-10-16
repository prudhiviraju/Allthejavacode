package com.automation.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;
import com.automation.selenium.utils.DriverHelper;

/* Example to show how to use findElementByXPath()method preceding and following-sibling */
class Example6 {

	public static void main(String[] args) {

		WebDriver driver = null;
		
		try {
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);

			driver = new ChromeDriver();
			
			driver.manage().window().maximize();

			driver.get("http://www.apsrtconline.in/oprs-web/");

			WebElement txtFrom = driver.findElement(By.xpath("//*[@id='toPlaceName']/preceding::input[@type='text']"));

			DriverHelper.highlightObject(driver, txtFrom);

			WebElement forRoundTrip = driver.findElement(By.xpath("//*[@id='txtJourneyDate']/following-sibling::input[@type='text']"));

			DriverHelper.highlightObject(driver, forRoundTrip);

			WebElement btnCheckAvailablity = driver.findElement(By.xpath("//*[@id='txtJourneyDate']/following-sibling::input[@type='button']"));

			DriverHelper.highlightObject(driver, btnCheckAvailablity);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		}finally {
			driver.quit();
		}

	}

}
