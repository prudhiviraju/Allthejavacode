package com.automation.selenium.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* How to use getAttribute method*/
class Example3 {

	@Test
	public void createAcount() {

		WebDriver driver = null;

		try {
			driver = DriverHelper.getChromeDriver();

			driver.get("https://www.facebook.com/");

			WebElement txtFirstName = driver.findElement(By.id("u_0_j"));
			txtFirstName.sendKeys("SHRIRAM");
			Assert.assertEquals(txtFirstName.getAttribute("value"), "SHRIRAM");

			WebElement txtSurName = driver.findElement(By.id("u_0_l"));
			txtSurName.sendKeys("ADUSUMALLI");
			Assert.assertEquals(txtSurName.getAttribute("value"), "ADUSUMALLI");

			WebElement txtMobile = driver.findElement(By.name("reg_email__"));
			txtMobile.sendKeys("0123456789");
			Assert.assertEquals(txtMobile.getAttribute("value"), "0123456789");

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}

	}

}
