package com.automation.selenium.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* Example to show how to retrieve value from application and validate with expected value */
class Example5 {

	@Test
	public void test() {

		WebDriver driver = null;
		
		try {
			driver = DriverHelper.getChromeDriver();

			driver.get("http://www.redbus.in/");

			WebElement lblFrom = driver.findElement(By.xpath("//*[@for='src']"));

			Assert.assertEquals(lblFrom.getText(), "FROM");
			
			WebElement lblTo = driver.findElement(By.xpath("//*[@for='dest']"));
			
			Assert.assertEquals(lblTo.getText(), "TO");
			
			WebElement lblOnWardsDate = driver.findElement(By.xpath("//*[@for='onward_cal']"));
					
			Assert.assertEquals(lblOnWardsDate.getText(), "ONWARD DATE");
			
			WebElement lblReturnDate = driver.findElement(By.xpath("//*[@for='return_cal']"));
			
			Assert.assertEquals(lblReturnDate.getText(), "RETURN DATE");
			
			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		}finally {
			driver.quit();			
		}

	}

}
