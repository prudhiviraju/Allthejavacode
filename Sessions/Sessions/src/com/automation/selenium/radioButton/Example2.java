package com.automation.selenium.radioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* Example to show how to retrieve value from application and validate with expected value */
class Example2 {

	@Test
	public void createNewPAN() {

		WebDriver driver = null;

		try {

			driver = DriverHelper.getChromeDriver();
			
			driver.get("https://www.cleartrip.com/");

			WebElement rbOneWay = driver.findElement(By.id("OneWay"));
			boolean rbOneWayState = rbOneWay.isSelected();
			if (rbOneWayState == true) {
				System.out.println("OneWay radio button selected");
			} else {
				System.out.println("Failed to select OneWay radio button");
			}

			Thread.sleep(1000);

			WebElement rbRoundTrip = driver.findElement(By.id("RoundTrip"));
			rbRoundTrip.click();
			boolean rbRoundTripState = rbRoundTrip.isSelected();
			if (rbRoundTripState == true) {
				System.out.println("RoundTrip radio button selected");
			} else {
				System.out.println("Failed to select RoundTrip radio button");
			}

			Thread.sleep(1000);

			WebElement rbMultiCity = driver.findElement(By.id("MultiCity"));
			rbMultiCity.click();
			boolean rbMultiCityState = rbMultiCity.isSelected();
			if (rbMultiCityState == true) {
				System.out.println("MultiCity radio button selected");
			} else {
				System.out.println("Failed to select MultiCity radio button");
			}

			Thread.sleep(1000);

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
