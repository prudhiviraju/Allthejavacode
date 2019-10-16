package com.automation.selenium.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* How to use getAttribute method*/
class Example2 {

	@Test
	public void createAcount() {

		WebDriver driver = null;

		try {
			driver = DriverHelper.getChromeDriver();

			driver.get("https://www.facebook.com/");

			WebElement txtFirstName = driver.findElement(By.id("u_0_j"));
			
			Assert.assertEquals(txtFirstName.getAttribute("aria-label"), "First name");
			
			WebElement txtSurName = driver.findElement(By.id("u_0_l"));
			
			Assert.assertEquals(txtSurName.getAttribute("aria-label"), "Surname");

			WebElement txtMobile = driver.findElement(By.name("reg_email__"));
			
			Assert.assertEquals(txtMobile.getAttribute("aria-label"), "Mobile number or email address");
			
			Thread.sleep(2000);
			
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}

	}

}
