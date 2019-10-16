package com.automation.selenium.list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to retrieve selected item from drop down and then Validate with expected*/
class Example5 {

	@Test
	public void createPAN() {

		WebDriver driver = null;

		Select select = null;
		
		try {

			driver = DriverHelper.getChromeDriver();
			
			driver.get("http://www.applypanonline.com");

			driver.findElement(By.linkText("Apply for New PAN Card")).click();

			WebElement day = driver.findElement(By.id("dd"));

			select = new Select(day);

			select.selectByVisibleText("17");

			Assert.assertEquals(select.getFirstSelectedOption().getText().trim(), "17");

			Thread.sleep(2000);

			select.selectByVisibleText("18");

			Thread.sleep(2000);

			Assert.assertEquals(select.getFirstSelectedOption().getText().trim(), "18");

			WebElement month = driver.findElement(By.id("mm"));

			select = new Select(month);

			select.selectByVisibleText("JAN");

			Assert.assertEquals(select.getFirstSelectedOption().getText().trim(), "JAN");

			Thread.sleep(2000);

			select.selectByVisibleText("DEC");

			Assert.assertEquals(select.getFirstSelectedOption().getText().trim(), "DEC");

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
