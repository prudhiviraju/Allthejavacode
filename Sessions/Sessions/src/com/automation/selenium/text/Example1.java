package com.automation.selenium.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* Example to show how to use senKeys method*/
class Example1 {

	@Test
	public void createAcount() {

		WebDriver driver = null;

		try {
			driver = DriverHelper.getChromeDriver();

			driver.get("https://www.facebook.com/");

			WebElement txtFirstName = driver.findElement(By.id("u_0_j"));
			txtFirstName.sendKeys("SHRIRAM");

			WebElement txtSurName = driver.findElement(By.id("u_0_l"));
			txtSurName.sendKeys("ADUSUMALLI");

			WebElement txtMobile = driver.findElement(By.name("reg_email__"));
			txtMobile.sendKeys("0123456789");

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}

	}

}
