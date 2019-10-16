package com.automation.selenium.jsAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;
import com.automation.selenium.utils.DriverHelper;

/* This Example show how to use switchToAlert method*/

class Example1 {

	@Test
	public void test() {

		WebDriver driver = null;

		try {

			driver = DriverHelper.getChromeDriver();
			
			driver.get(ApplicationConstants.ALERTS_PATH + "SimpleAlert.html");

			WebElement button = driver.findElement(By.xpath("//*[text()='Click on me']"));

			button.click();

			Thread.sleep(2000);

			Alert alert = driver.switchTo().alert();

			alert.accept();

			Thread.sleep(1000);
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
