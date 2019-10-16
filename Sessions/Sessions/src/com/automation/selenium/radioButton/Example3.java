package com.automation.selenium.radioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* Example to show how to retrieve value from application and validate with expected value */
class Example3 {

	@Test
	public void createNewPAN() {
		
		WebDriver driver = null;
		
		try {

			driver = DriverHelper.getChromeDriver();
			
			driver.get("https://www.cleartrip.com/");

			WebElement rbOneWay = driver.findElement(By.id("OneWay"));
			boolean rbOneWayState =  rbOneWay.isSelected();
			Assert.assertEquals(rbOneWayState, true);
			
			Thread.sleep(1000);
			
			WebElement rbRoundTrip = driver.findElement(By.id("RoundTrip"));
			rbRoundTrip.click();
			boolean rbRoundTripState =  rbRoundTrip.isSelected();
			Assert.assertEquals(rbRoundTripState, true);

			Thread.sleep(1000);

			WebElement rbMultiCity = driver.findElement(By.id("MultiCity"));
			rbMultiCity.click();
			boolean rbMultiCityState = rbMultiCity.isSelected();
			Assert.assertEquals(rbMultiCityState, true);
			
			Thread.sleep(1000);

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
