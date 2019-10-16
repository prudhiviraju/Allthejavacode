package com.automation.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;
import com.automation.selenium.utils.DriverHelper;

/* Example to show how to highlight object/webElement/htmlTag/HtmlControl*/
class Example8 {

	public static void main(String[] args) {

		WebDriver driver = null;

		WebElement webElement = null;

		try {

			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://www.applypanonline.com/");

			WebElement lnkApplyPan = driver.findElement(By.linkText("Apply for New PAN Card"));

			lnkApplyPan.click();

			webElement = driver.findElement(By.xpath("(//*[@type='text'])[1]"));

			DriverHelper.highlightObject(driver, webElement);

			webElement = driver.findElement(By.xpath("(//*[@type='text'])[2]"));

			DriverHelper.highlightObject(driver, webElement);

			webElement = driver.findElement(By.xpath("(//*[@type='text'])[3]"));

			DriverHelper.highlightObject(driver, webElement);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}

	}

}
