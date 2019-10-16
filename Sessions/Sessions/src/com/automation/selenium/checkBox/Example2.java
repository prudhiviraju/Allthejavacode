package com.automation.selenium.checkBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to write customized methods*/
class Example2 {

	@Test
	public void testMethod(){
		
		WebDriver driver = null;

		try {
			driver = DriverHelper.getChromeDriver();
			
			driver.get("http://www.applypanonline.com");

			WebElement lnkNewPan = driver.findElement(By.linkText("Apply for New PAN Card"));
			lnkNewPan.click();

			Thread.sleep(2000);

			WebElement noIncome = driver.findElement(By.id("chkincome"));

			check(noIncome);

			Thread.sleep(2000);

			System.out.println("After check Method status):"	+ noIncome.isSelected());

			unCheck(noIncome);

			System.out.println("After unCheck Method status):"	+ noIncome.isSelected());

			Thread.sleep(1000);
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}

	}

	private static void check(WebElement webElement) {
		try {
			if (!webElement.isSelected()) {
				webElement.click();
			}
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		}
	}

	private static void unCheck(WebElement webElement) {
		try {
			if (webElement.isSelected()) {
				webElement.click();
			}
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		}
	}

}
			