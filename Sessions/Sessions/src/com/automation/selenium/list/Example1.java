package com.automation.selenium.list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to select item from drop down using sendKeys method*/
class Example1 {

	@Test
	public void createPAN() {

		WebDriver driver = null;
		try {
			driver = DriverHelper.getChromeDriver();
			
			driver.get("http://www.applypanonline.com");

			driver.findElement(By.linkText("Apply for New PAN Card")).click();

			WebElement idProof = driver.findElement(By.id("proofofidentity"));

			idProof.sendKeys("Passport");

			Thread.sleep(3000);
			
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}
}
