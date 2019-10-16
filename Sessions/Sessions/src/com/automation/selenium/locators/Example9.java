package com.automation.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;
import com.automation.selenium.utils.DriverHelper;

/* How to use findElement By cssSelector() method*/
class Example9 {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		try {
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);

			driver = new ChromeDriver();
			
			driver.manage().window().maximize();

			driver.get("http://www.applypanonline.com");

			WebElement linkApplyPan = driver.findElement(By.linkText("Apply for New PAN Card"));

			DriverHelper.highlightObject(driver, linkApplyPan);

			linkApplyPan.click();

			WebElement txtFirstName = driver.findElement(By.cssSelector("input[id=firstnameupp]"));

			DriverHelper.highlightObject(driver, txtFirstName);

			WebElement txtLastName = driver.findElement(By.cssSelector("input[name=lastname]"));

			DriverHelper.highlightObject(driver, txtLastName);

			WebElement txtMiddleName = driver.findElement(By.cssSelector("input#middlenameupp"));

			DriverHelper.highlightObject(driver, txtMiddleName);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}

	}

}
