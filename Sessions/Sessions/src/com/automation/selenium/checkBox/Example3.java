package com.automation.selenium.checkBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to use Assertions in TestNG*/
class Example3 {

	@Test
	public void testMethod() {

		WebDriver driver = null;

		try {
			
			driver = DriverHelper.getChromeDriver();
			
			driver.get("http://www.applypanonline.com");

			WebElement lnkNewPan = driver.findElement(By.linkText("Apply for New PAN Card"));
			lnkNewPan.click();

			Thread.sleep(2000);

			WebElement noIncome = driver.findElement(By.id("chkincome"));

			Assert.assertEquals(noIncome.isSelected(), false);

			noIncome.click();

			Thread.sleep(2000);

			Assert.assertEquals(noIncome.isSelected(), true);

			Thread.sleep(1000);
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}

	}
}
